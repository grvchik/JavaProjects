package Oct2019;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubString {


	public static String getShortestCommonSubString(String first,String second) {
		
		int firstStart = 0;
		int secondStart = 0;
		int firstEnd=first.length()-1; 
		
		int secondEnd = second.length()-1;

	
		StringBuffer sb = new StringBuffer();
		Set<String> subset = new HashSet<String>();
		while(firstStart<=firstEnd && secondStart<=secondEnd) {
			if(first.charAt(firstStart)==second.charAt(secondStart)) {
				sb.append(first.charAt(firstStart));
				++firstStart;
				++secondStart;
			}
			else {
				if(secondEnd > firstEnd) {
					++secondStart;	
				}
				else {
					++firstStart;
				}
			

			}
		}	
		if(sb.length()>0) {
			subset.add(sb.toString());
			sb.delete(0,sb.length()-1);			
		}
		return sb.toString();
	}

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "There";
		String str2 ="The";
		getShortestCommonSubString(str1, str2);
	}

}
