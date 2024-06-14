class Solution {
    public String largestNumber(int[] nums) {
        //String array
       String [] Snum=new String[nums.length];
       //convert number into string  
       for(int i=0;i<nums.length;i++){
        Snum[i]=String.valueOf(nums[i]);
       } 
       java.util.Arrays.sort(Snum, new java.util.Comparator<String>(){
       //compare method of two string
        public int compare(String left,String right){
            //concat to string 
            String leftRight = left.concat(right);
            String rightLeft = right.concat(left);
            return rightLeft.compareTo(leftRight);
        }
       });
       StringBuilder sb = new StringBuilder();
        for(int i=0;i<Snum.length;i++){
            sb.append(Snum[i]);
        }
        java.math.BigInteger result = new java.math.BigInteger(sb.toString());
        return result.toString();
       }
    }
