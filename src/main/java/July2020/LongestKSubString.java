package July2020;

import java.util.HashSet;
import java.util.Set;

public class LongestKSubString {

	public static String getLongestSubString(String input, int k) {
		StringBuffer 
		sb = new StringBuffer(input.length());
		Set <Character> uniqueSet = new HashSet<>();
		char[] strArray = input.toCharArray();
		String longestString="";
		int maxLength=0;		
		
		int endLength = input.length()-k;
		
		
		for(int i=0;i<=endLength;i++) {
			int counter = i;
			
			int uniquCharCounter=1;
			uniqueSet.clear();
			while(uniquCharCounter<=k) {
				char currChar = strArray[counter];
				sb.append(currChar);
				if(!uniqueSet.contains(currChar)) {
					uniquCharCounter++;
					uniqueSet.add(currChar);
				}
			
				counter++;
			
			}
			
			String currStr = sb.toString();
			sb.delete(0, sb.length());
			if(currStr.length()>=maxLength) {
				maxLength = currStr.length();
				longestString = currStr;
			
			}

			System.out.println(longestString);
		}
		

		
		return longestString;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ret = getLongestSubString("chamanbahadur", 4);
		System.out.println(ret);
	}

}
