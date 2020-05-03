package Feb2020;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringPermutations {

	public static Set<String> getPermutations(String str) {
		
		if(str.length()==1) {
			return new HashSet<>(Collections.singleton(str));
		}
		
		String strExceptLast = str.substring(0, str.length()-1);
		char lastChar = str.charAt(str.length()-1);
		
		Set<String> permutationofAllExceptLast = getPermutations(strExceptLast);
		
		Set<String> finalSet = new HashSet<String>();
		
		for(String elem : permutationofAllExceptLast) {
			for(int i=0;i<=strExceptLast.length();i++) {
				String permutation = elem.substring(0,i)+lastChar+elem.substring(i);
				finalSet.add(permutation);
			}
		}
		return finalSet;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Humra";
		Set<String> result = getPermutations(str);
		System.out.println(result);
		
	}

}
