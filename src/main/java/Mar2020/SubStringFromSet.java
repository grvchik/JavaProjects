package Mar2020;

import java.util.HashSet;
import java.util.Set;

public class SubStringFromSet {

	
	public static String getSubString(String masterString, char[] setChars) {
		Set<String> uniqueSet = new HashSet<String>();
	    helper(masterString, uniqueSet, 0, masterString.length(), setChars);	
  
	    System.out.println("uniqueSet"+uniqueSet);
	    
	    return "something";
	}
	
	
	public static void helper(String masterString,Set<String> uniqueSet, int start,int end, char[] setChars) {
		if(start>=end && uniqueSet.isEmpty()) {
			return ;
		}
		
		
		String leftSubString = masterString.substring(start, end);
		
		if(containsSetCharacters(leftSubString, setChars)) {
			uniqueSet.add(leftSubString);
			return;
		}
		
		helper(masterString, uniqueSet, start+1, end, setChars);
		helper(masterString, uniqueSet, start, end-1, setChars);
		
	}
	
	public static boolean containsSetCharacters(String str, char[] setChars) {
		
		for(char c :setChars) {
			if(str.charAt(0)!= setChars[0]) {
				return false;
			}
			int indexOfChar = str.indexOf(c);
			if(indexOfChar==-1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String masterString = "Ravindrajeet";
		char set[] = {'j','e','e','t'};
		getSubString(masterString, set);
	}

}
