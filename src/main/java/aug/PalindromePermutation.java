package aug;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PalindromePermutation {

	public static boolean doesPermutationExist(String input) {
		boolean ret = false;
		Map <Character,Integer> countMap = new HashMap<Character, Integer>();
		
		char inputArr[] = input.toCharArray();
		
		for(Character ch : inputArr) {
			if(countMap.get(ch)==null) {
				countMap.put(ch, 1);
			}
			else {
				countMap.put(ch, countMap.get(ch)+1);
			}
		}
		
		
		
		
		
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
