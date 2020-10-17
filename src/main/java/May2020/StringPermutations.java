package May2020;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringPermutations {

	public static Set<String> getPermutations(String input) {
		
		if(input.length()<=1) {
			return new HashSet<String>(Collections.singletonList(input));
		}
		
		String allExceptLast = input.substring(0, input.length()-1);
		Set<String> permAllExceptLastSet = getPermutations(allExceptLast);
		char lastCharacter = input.charAt(input.length()-1);
		
		Set<String> finalList = new HashSet<String>();
		
		for(String perm: permAllExceptLastSet) {
			
			for(int position=0;position<allExceptLast.length();position++) {
				
				String permutation = perm.substring(0, position)+lastCharacter+perm.substring(position);
				finalList.add(permutation);
			}
		}
		
		return finalList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String perm = "string";
		Set<String> res = getPermutations(perm);
		System.out.println(res);
	}

}
