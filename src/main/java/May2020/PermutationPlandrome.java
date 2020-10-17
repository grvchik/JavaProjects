package May2020;

import java.util.HashSet;
import java.util.Set;

public class PermutationPlandrome {

	
	
	public static boolean permutationPalindrome(String perm) {
		
		Set<Character> charCount = new HashSet<Character>();
		
		char [] charArray = perm.toCharArray();
		
		for(char ch: charArray) {
			charCount.add(ch);
		}
		
	
		int oddCounter = 0;
		for(char ch: charArray) {
			if(!charCount.contains(ch)) {
				++oddCounter;
			}
		
			
		}
		
		boolean conditionTwo = charCount.size()==perm.length();
		
		if(oddCounter>1) {
			return false;
		}
		
		
		if(oddCounter==0 && conditionTwo) {
			return false;
		}
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = permutationPalindrome("carrace");
		System.out.println(result);
		
	}

}
