class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character , Integer> charMag=new HashMap<>();

        for(char c: magazine.toCharArray()){
            charMag.put(c,charMag.getOrDefault(c, 0) + 1);
        }

        for(char c : ransomNote.toCharArray()){
            if(!charMag.containsKey(c) || charMag.get(c)==0){
                return false;
            }
            charMag.put(c, charMag.get(c) - 1);
        }
        return true;
    }
}
