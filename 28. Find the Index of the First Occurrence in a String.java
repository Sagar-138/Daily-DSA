class Solution {
    public int strStr(String haystack, String needle) {
      if(haystack.isEmpty()){
        return -1;
      }
      int hayLen=haystack.length();
      int neeLen=needle.length();
      for(int i=0; i<=hayLen-neeLen;i++){
        String window=haystack.substring(i,i+neeLen);
        if(window.equals(needle)){
            return i;
        }
      }
      return -1;
    }
}
