class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long a=0;
        for(int num:chalk){
            a+= num;
        }
        int rc=(int)(k%a);
        for(int i=0;i<chalk.length;i++){
             if (rc < chalk[i]){
                return i;
             }
             rc= rc-chalk[i];
        }
        return 0;
    }
}
