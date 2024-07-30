class Solution {
    public boolean isIsomorphic(String s1, String s2) {
         if (s1.length() != s2.length()) {
            return false;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256]; 

        for (int i = 0; i < s1.length(); i++) {
            char char1 = s1.charAt(i);
            char char2 = s2.charAt(i);

            
            if (map1[char1] != map2[char2]) {
                return false;
            }
            map1[char1] = i + 1;
            map2[char2] = i + 1;
        }

        return true;
    }
}
