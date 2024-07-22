//with O(n log n) time complexity
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int[] prefixSums = new int[n + 1];
      
        for (int i = 1; i <= n; i++) {
            prefixSums[i] = prefixSums[i - 1] + nums[i - 1];
        }
        
        int minLength = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int targetSum = target + prefixSums[i];
            
            int bound = Arrays.binarySearch(prefixSums, targetSum);
            if (bound < 0) {
                bound = -bound - 1;
            }
            
            if (bound <= n) {
                minLength = Math.min(minLength, bound - i);
            }
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
