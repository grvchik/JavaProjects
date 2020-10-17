package Aug2020;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringCombinations {

	public static Set<String> getCombinations(String str) {
		if(str.length()<=1) {
			return new HashSet<String>(Collections.singletonList(str));
		}
		String permAllExceptLastSet = str.substring(0, str.length()-1);
		Set<String> allCombinationsExceptLast  = getCombinations(permAllExceptLastSet);
		char lastChar = str.charAt(str.length()-1);
		Set<String> finalList = new HashSet<String>();
		
		for(String perm: allCombinationsExceptLast) {
			
			for(int i = 0;i< permAllExceptLastSet.length();i++) {
				String permutation = perm.substring(0, i)+lastChar+ perm.substring(i);
				finalList.add(permutation);
			}
		}
		return finalList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "gaurav";
		Set<String> combination = getCombinations(str);
		System.out.println(combination);
	}

}
