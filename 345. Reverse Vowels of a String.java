class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels=new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i');
        vowels.add('o'); vowels.add('u');  vowels.add('A');
        vowels.add('E'); vowels.add('I'); vowels.add('O');
        vowels.add('U');

        char[] charArr= s.toCharArray();
        int left =0;
        int right=charArr.length-1;
        while(left<right){
            // Move the left pointer until a vowel is found
            while (left < right && !vowels.contains(charArr[left])) {
                left++;
            }
             // Move the right pointer until a vowel is found
            while (left < right && !vowels.contains(charArr[right])) {
                right--;
            }
             // Swap the vowels
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;

            // Move both pointers towards the center
            left++;
            right--;
        }
        return new String(charArr);
    }
}
