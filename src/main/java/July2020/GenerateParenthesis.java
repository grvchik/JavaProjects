package July2020;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	public static void generateAll(int number) {
		List<String> result = new ArrayList<String>();
		int leftRemainder = number;
		int rightRemainder = number;
		char [] charArray = new char[number*2];
		generateParenthesis(result, charArray,leftRemainder, rightRemainder, 0);
		
		printCombinations(result);
		
	}
	
	public static void printCombinations(List<String> combinations) {
		for(String str: combinations) {
			System.out.println(str);
		}
	}
	
	public static void generateParenthesis(List<String> result,	char [] charArray ,int leftRemainder,int rightRemainder, int index) {
		
		if(leftRemainder <0 || rightRemainder < leftRemainder) {
			return;
		}
		
		if(leftRemainder==0 && rightRemainder==0) {
			result.add(String.copyValueOf(charArray));
		}
		
		if(leftRemainder >0) {
			charArray[index] = '(';
			generateParenthesis(result, charArray, leftRemainder-1, rightRemainder, index+1);
		}
		
		if(rightRemainder >0) {
			charArray[index] = ')';
			generateParenthesis(result, charArray, leftRemainder, rightRemainder-1, index+1);
		}		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateAll(3);
	}

}
