class Solution {
    public void rotate(int[] nums, int k) {
        //if value of k is larget than length of array then % is used
        k%=nums.length;
        //reverse all elements of array
       reverse(nums, 0,nums.length-1);
        //reverse only 0 to k elements of reversed array
       reverse(nums, 0, k-1);
        //reverse k to last element of the array 
       reverse(nums, k,nums.length-1);
    }
    public static void reverse(int [] nums, int start, int end){
        if(nums==null||nums.length==1)
            return;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
