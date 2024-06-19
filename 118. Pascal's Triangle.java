class Solution {
    List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0)
            return result;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if (numRows == 1)
            return result;

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);

            // Start the next row
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);// left
            for (int j = 0; j < i - 1; j++) {
                row.add(prevRow.get(j) + prevRow.get(j + 1));// middle
            }
            row.add(1);// right
            result.add(row);
        }

        return result;
    }

}
