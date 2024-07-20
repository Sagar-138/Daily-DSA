public class LongestRepetitiveConsecutiveString {
	public static String [] findLongestRepetitiveConsecutiveString(String input) {
		if(input == null || input.length()==0) {
			return new String [] {"","0"};
		}
		char maxChar=input.charAt(0);
		int maxLength = 1;
		int currLength =1;
		
		for(int i=1;i<input.length(); i++) {
			if(input.charAt(i)==input.charAt(i-1)) {
				currLength++;
			}else {
				if(currLength>maxLength) {
					maxLength=currLength;
					maxChar=input.charAt(i-1);
					
				}
				currLength=1;
			}
			if(currLength>maxLength) {
				maxLength=currLength;
				maxChar=input.charAt(i-1);
			}
			
			
		}
		return new String [] {String.valueOf(maxChar), String.valueOf(maxLength)};
	}
	public static void main(String [] args) {
		String input= "abcabcbb";
		String[] result = findLongestRepetitiveConsecutiveString(input);
		System.out.print("["+result[0]+","+result[1]+"]");
		
	}

}
