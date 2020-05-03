package April2020;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringPermutations {

	public static Set<String> getPermutations(String str) {
		
		if(str.length()<=1) {
			   return new HashSet<String>(Collections.singletonList(str));
			
		}
		
		
		String allExceptLast = str.substring(0,str.length()-1);
		 char lastChar = str.charAt(str.length() - 1);
		Set<String> remainingPermutations = getPermutations(allExceptLast);
		Set<String> uniquePerm = new HashSet<String>();
	    for (String permElement : remainingPermutations) {
	    	 for (int position = 0; position <= allExceptLast.length(); position++) {  
	            String permutation = permElement.substring(0, position) + lastChar
	                + permElement.substring(position);
	            uniquePerm.add(permutation);
	            System.out.println(permutation);
	        }
	    }
		
		return uniquePerm;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String perm = "abc";
		getPermutations(perm);
	}

}
