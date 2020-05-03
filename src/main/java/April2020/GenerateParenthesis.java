package April2020;

import java.util.HashSet;
import java.util.Set;

public class GenerateParenthesis {
    public static Set<String> combinations = new HashSet<String>();
	
	public static void generateParenthesis(int number) {
		
		int limit = number*2;
		Set<String> limitSet = new HashSet<String>();
		getParenthesis("", 0, 0, limitSet, limit);
		for(String str: limitSet) {
			System.out.println(str);
		}
		
	}
	
	public static void  getParenthesis(String running,int leftIndex,int rightIndex,Set<String> result,int number) {
		
		if(running.length()==number) {
			result.add(running);
			return;
		}
		
		if(rightIndex>number-1) {
			result.add(running);
			return;
			
		}

		if(leftIndex<(number/2)) {
			getParenthesis(running+"(", leftIndex+1, rightIndex, result, number);	
		}
		
		if(leftIndex>rightIndex) {
			getParenthesis(running+")", leftIndex, rightIndex+1, result, number);	
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateParenthesis(3);
	}

}
