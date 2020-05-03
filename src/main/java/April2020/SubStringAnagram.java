package April2020;

import java.util.ArrayList;
import java.util.List;

public class SubStringAnagram {

	public static List<Integer> getAnagramIndexes(String biggerString,String smallerString) {
		
		List<Integer> numList = new ArrayList<Integer>();
		
		if(biggerString.indexOf(smallerString)==-1) {			
			return numList; 
		}
		
		int begIndex = 0;
		int endIndex = begIndex+smallerString.length();
		
		while(endIndex <= biggerString.length()) {
			String subString = biggerString.substring(begIndex,endIndex);
			if(isAnagram(subString,smallerString)) {
				numList.add(begIndex);
			}
			++begIndex;
			++endIndex;
		}
		
		return numList;
	}
	

	public static boolean  isAnagram(String s1,String s2) {
		int[] num1 = new int[256];
		
		
		char char1[] = s1.toCharArray();
		char char2[] = s2.toCharArray();
		
		for(char character :char1) {
			num1[character-'a']++;
		}
		for(char character :char2) {
			num1[character-'a']--;
		}		
		
		for(int n :num1) {
			if(n!=0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String g[]) {
		
		String bigger="abxaba";
		String smaller = "ab";
		List<Integer> indexes = getAnagramIndexes(bigger, smaller);
		System.out.println(indexes);
	}
}
