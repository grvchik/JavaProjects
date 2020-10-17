package Aug2020;

import java.util.HashSet;
import java.util.Set;

public class PerfectSquaresSum {

	public static Set<Integer> perfectSquaresSum(int number) {
		
		Set<Integer> perfectSquares = new HashSet<Integer>();
		
		int result = (int)Math.sqrt(number);
		
		for(int i=1;i<=result+1;i++) {
			int firstNumber = i;
			int remainder = number-i;
			if(isPerfectSuqare(firstNumber) &&  isPerfectSuqare(remainder)) {
				perfectSquares.add(firstNumber);
				perfectSquares.add(remainder);		
			}
		
		}
		
		return perfectSquares;
	}
	
	
	public static boolean isPerfectSuqare(int number) {
		
		double result = Math.sqrt(number);
		int intRes = (int)result;
		double divRes=result/intRes;
		if(divRes==1.0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> res = perfectSquaresSum(13);
		System.out.println(res);
		System.out.println(isPerfectSuqare(9));		
	}

}
