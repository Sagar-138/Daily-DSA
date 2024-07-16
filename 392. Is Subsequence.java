class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        char [] sarr = s.toCharArray();
        char [] tarr = t.toCharArray();

        if(s.length()<1) return true;

        while(i<t.length()){
            if(tarr[i]==sarr[j]){
                j++;
            }
            i++;
            if(j==s.length()) return true;
        }
        return false;
    }
}
