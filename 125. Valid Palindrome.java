class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        s=s.toLowerCase();
        char[] chars=s.toCharArray();
        int start=0;
        int last=s.length()-1;
        while(start<last){
            
            if(!Character.isLetterOrDigit(chars[start])){
                start++;
            } else if(!Character.isLetterOrDigit(chars[last])){
                last--;
            } else{
                if(chars[start] != chars[last]){
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
