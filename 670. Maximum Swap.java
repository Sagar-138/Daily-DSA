class Solution {
    public int maximumSwap(int num) {
         char[] digits = Integer.toString(num).toCharArray();
        int maxNum = num;

        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                // Swap digits[i] and digits[j]
                char temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;
                // Convert back to integer to check the number
                int newNum = Integer.parseInt(new String(digits));
                if (newNum > maxNum) {
                    maxNum = newNum;
                }
                // Swap back to restore original array
                temp = digits[i];
                digits[i] = digits[j];
                digits[j] = temp;
            }
        }
        
        return maxNum;
    }
}
