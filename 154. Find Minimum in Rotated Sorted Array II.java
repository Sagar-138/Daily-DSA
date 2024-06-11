class Solution {
    public int findMin(int[] num) {
        return findMinHelper(num, 0, num.length - 1);
    }

    public int findMinHelper(int[] num, int left, int right) {
        if (right == left) {
            return num[left];
        }
        if (right == left + 1) {
            return Math.min(num[left], num[right]);
        }
        int middle = (right - left) / 2 + left;
        // already sorted
        if (num[right] > num[left]) {
            return num[left];
            // right shift one
        } else if (num[right] == num[left]) {
            return findMinHelper(num, left + 1, right);
            // go right
        } else if (num[middle] >= num[left]) {
            return findMinHelper(num, middle, right);
            // go left
        } else {
            return findMinHelper(num, left, middle);
        }
    }
}
