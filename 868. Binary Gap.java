class Solution {
    public int binaryGap(int N) {
        int pre = -1;  // Last '1' bit position
        int len = 0;   // Maximum gap

        while (N > 0) {
            int k = N & -N;  // Extract rightmost '1' bit
            int curr = Integer.numberOfTrailingZeros(k);  // Get position of that bit

            if (pre != -1) {
                len = Math.max(len, curr - pre);  // Calculate the distance between the current '1' bit and the previous '1' bit
            }
            pre = curr;  // Update the position of the previous '1' bit

            N &= (N - 1);  // Remove the rightmost '1' bit
        }

        return len;
    }
}
