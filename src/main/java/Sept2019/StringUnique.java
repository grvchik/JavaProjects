package Sept2019;

import java.security.AllPermission;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringUnique {

	public static Set<String> getPermutations(String str) {
		
		if(str.length()<=1) {
			Set<String> permutation = new HashSet<String>();
			permutation.add(str);
			return permutation;			
		}
	
		String lastChar = str.substring(str.length()-1);
		String allExceptLast = str.substring(0,str.length()-1);
		
		Set<String> allPemutations = getPermutations(allExceptLast);
		
		Set<String> totalPerm = new HashSet<String>();
		
		for(String element : allPemutations) {
			
			// for each element  iterator from 0 to length of this element
			
			for(int position =0; position<=element.length();position++){
				String firstPart = element.substring(0,position);
				String lastPart = element.substring(position);
				String finalPart = firstPart+lastChar+lastPart;
				System.out.println("Final part:"+finalPart);
				totalPerm.add(finalPart);
			}
			
		}
		
		return totalPerm;
	}

	
	public int getFibonacci(int n) {
		
		if(n==0 ||n==1) {
			return 1;
		}
		
		int prevprev = 0;
		int prev = 1;
		int current=0;
		for(int i = 1;i<=n;i++) {
			current = prev  +prevprev;
			prevprev = prev;
			prev = current;

		}
		return current;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str[] = {'s','h','a','n','g','h','a','a','i'};
		Arrays.sort(str);
		System.out.println(str);
		Set<String> perm = getPermutations("AABC");
		System.out.println(perm);
	}

}
