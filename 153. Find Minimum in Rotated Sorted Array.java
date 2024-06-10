class Solution {
    public int findMin(int[] nums) {
        return findMinHelper(nums, 0,nums.length-1);
    }
    public int findMinHelper(int[] nums, int left, int right){
        if(left==right){
            return nums[left];
        }
        if(right - left ==1){
            return Math.min(nums[right], nums[left]);
        }

        int mid= left + (right - left)/2;
        if(nums[left]<nums[right]){
            return nums[left];
        }else if(nums[mid]> nums[left]){
            return findMinHelper(nums, mid,right);
        }else{
            return findMinHelper(nums,left , mid);
        }
    }
}
