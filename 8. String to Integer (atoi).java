class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }

        // Trim white spaces
        str = str.trim();

        // Check for empty string after trimming
        if (str.length() == 0) {
            return 0;
        }

        char flag = '+';
        int i = 0;

        // Check negative or positive sign
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }

        // Use long to store result to handle overflow cases
        long result = 0;

        // Calculate value
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;

            // Check for overflow and underflow conditions i.e limit of int max value (2^31)
            if (result > Integer.MAX_VALUE) {
                return flag == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }

        // Apply the sign i.e if integer is negetive then add sign to it 
        if (flag == '-') {
            result = -result;
        }

        // Return the final result answer with type cast
        return (int) result;
    }
}
