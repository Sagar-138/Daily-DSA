class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (num == null || num.length < 4) {
            return result;
        }

        Arrays.sort(num);
        int n = num.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && num[i] == num[i - 1])
                continue; // avoid duplicates
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && num[j] == num[j - 1])
                    continue; // avoid duplicates
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = (long) num[i] + num[j] + num[k] + num[l];
                    if (sum == target) {
                        result.add(Arrays.asList(num[i], num[j], num[k], num[l]));
                        while (k < l && num[k] == num[k + 1])
                            k++;
                        while (k < l && num[l] == num[l - 1])
                            l--;
                        k++;
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return result;
    }
}
