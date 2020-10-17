package Sep2020;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
	public static Set<String> getPermutations(String input) {
		if(input.length()<=1) {
			return new HashSet<String>(Collections.singleton(input));
		}
		
		String allExceptLast = input.substring(0,input.length()-1);
		Set<String> permAllExceptLastSet = getPermutations(allExceptLast);
		char lastChar = input.charAt(input.length()-1);
		
		Set<String> finalList = new HashSet<String>();
		
		for(String perm : permAllExceptLastSet) {
			
			for(int i=0;i<allExceptLast.length();i++) {
				String permutation = perm.substring(0, i)+lastChar+perm.substring(i);
				finalList.add(permutation);
			}
		}
		
		return finalList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
