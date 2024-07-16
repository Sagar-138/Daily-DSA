class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> rv = new HashMap<>();
        rv.put('I', 1);
        rv.put('V', 5);
        rv.put('X', 10);
        rv.put('L', 50);
        rv.put('C', 100);
        rv.put('D', 500);
        rv.put('M', 1000);
        
        int sum = 0;

         for (int i = 0; i < s.length(); i++) {
            int currentVal = rv.get(s.charAt(i));
            if (i < s.length() - 1 && currentVal < rv.get(s.charAt(i + 1))) {
                sum -= currentVal;
            } else {
                sum += currentVal;
            }
        }
        return sum;
    }
}
