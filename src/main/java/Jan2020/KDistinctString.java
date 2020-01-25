package Jan2020;

import java.util.HashSet;
import java.util.Set;

public class KDistinctString {

	
	
	public static String getLongestDistinctSubString(String str, int k) {
		
		int beg = 0;
		int end = k;
		String subStringWindow ="";
		int uniqueCount = 0;
		int maxLength = Integer.MIN_VALUE;
		while(end<=str.length()-1) {
			subStringWindow = str.substring(beg, end);
			uniqueCount = countOfUniqueCharacters(subStringWindow);
			// if already length is reached
			if(uniqueCount==k && subStringWindow.length()==k) {				
				++end;
			}
			else if(uniqueCount>k && subStringWindow.length()> k) {
				++beg;
			}
			else {
				--beg;				
			}
			maxLength = Math.max(maxLength, subStringWindow.length());
			if(subStringWindow.length()>k && uniqueCount==k) {
				break;
			}
		}
	return subStringWindow;
	}
	
	
	
	

	public static int countOfUniqueCharacters(String str) {
		
	  Set<Character> uniqueSet = getSetForString(str);		
	  return uniqueSet.size();
	}
	
	public static Set<Character> getSetForString(String str) {
		Set<Character> uniqueCharacter	= new HashSet<Character>();
		char uniqueChar[] = str.toCharArray();
		for(char c: uniqueChar) {
			uniqueCharacter.add(c);
		}
		return uniqueCharacter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcba";
		String sub = getLongestDistinctSubString(str, 2);
		System.out.println(sub);
	}

}
