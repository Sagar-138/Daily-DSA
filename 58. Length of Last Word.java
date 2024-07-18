class Solution {
    public int lengthOfLastWord(String s) {
         int len=0;
        boolean isWord = false;
        
        for(int i = s.length() - 1; i>=0;i--){
            if(s.charAt(i)!= ' '){
                len++;
                isWord=true;
            }else if(isWord){
                break;
            }
        }
        return len;
    }
}
