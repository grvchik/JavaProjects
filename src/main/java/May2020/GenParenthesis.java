package May2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenParenthesis {


	public static void backTrack2(List<String > result, String running,int leftRemaining, int rightremaining, int limit) {
		
		if(running.length()==limit*2) {
			result.add(running);
			return;
		}
		
		
		if(leftRemaining<limit) {
			backTrack2(result, running+("("), leftRemaining+1, rightremaining, limit);
		}
		if(rightremaining <leftRemaining) {
			backTrack2(result, running+(")"), leftRemaining+1, rightremaining+1, limit);
		}
		
	}
	
	
	public static void backtrack(List<String> ans, String resultSoFar, int beg, int end, int number) {

		if (resultSoFar.length() == number * 2) {
			ans.add(resultSoFar);
			return;
		}

		if (beg < number) {
			backtrack(ans, resultSoFar + "(", beg + 1, end, number);

		}

		if (end < beg) {
			backtrack(ans, resultSoFar + ")", beg, end + 1, number);

		}

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ans = new ArrayList<String>();
		backtrack(ans, "", 0, 0, 3);
		StringBuffer result= new StringBuffer(6);
		List<String> ans2 = new ArrayList<String>();
		backTrack2(ans2, "", 0, 0, 3);
		System.out.println(ans2);
		System.out.println(ans);
	}

}
