package May2020;

public class CountChars {

	public static String countStrings(String input) {
		
		int counter=1;
		StringBuilder sd = new StringBuilder(input.length()-1);
		for(int i=0;i<input.length();i++) {
			if(i==input.length()-1) {
				sd.append(counter);
				sd.append(input.charAt(i));
			}
			else {
				//case 1 next char is same as current char
				if(input.charAt(i)==input.charAt(i+1)) {
					++counter;
				}
				else {
				
					sd.append(counter);
					sd.append(input.charAt(i));	
					counter=1;
				}
			}
		}
		return sd.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "AAAABBBCCDAA";
		String decoded = countStrings(input);
		System.out.println(decoded);
	}

}
