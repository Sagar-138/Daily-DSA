class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();

        //fill
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        //searching
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int rem =target - n;
            if(map.containsKey(rem)){
                int idx=map.get(rem);
                if(idx==i) continue;
                return new int[]{idx,i};
            }
        }
        return new int[]{};
    }
}
