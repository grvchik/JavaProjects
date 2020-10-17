package Oct2020;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	public static void generateAll(int number) {
		int leftRemainder = number;
		int rightRemainder = number;
		char [] result = new char[2*number];
		List <String> combinations = new ArrayList<String>();
		generateParenthesis(combinations, result, leftRemainder, rightRemainder, 0);
		printCombinations(combinations);
	}
	
	
	public static void generateParenthesis(List <String> combinations,char[] set,
			int leftRemainder,int rightRemainder,int index ) {
		
		if(leftRemainder<0 || rightRemainder<leftRemainder) {
			return;
		}
		
		if(leftRemainder==0 && rightRemainder ==0) {
			combinations.add(String.valueOf(set));
			return;
		}
		
		if(leftRemainder>0) {
			set[index] = '(';
			generateParenthesis(combinations, set, leftRemainder-1, rightRemainder, index+1);
		}
		
		if(rightRemainder>0) {
			set[index] = ')';
			generateParenthesis(combinations, set, leftRemainder, rightRemainder-1, index+1);
		}
		
	}
	
	public static void printCombinations(List<String> combinations) {
		for(String str: combinations) {
			System.out.println(str);
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateAll(4);
	}

}
