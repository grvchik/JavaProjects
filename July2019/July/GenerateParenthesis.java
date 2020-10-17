package July;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	public List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList();
		StringBuffer sb = new StringBuffer(n * 2);
		// backtrack(ans, "", 0, 0, n);
		System.out.println("Answer" + ans);
		generateAll(ans, sb, n, 0, 0);
		return ans;
	}

	public void backtrack(List<String> ans, String resultSoFar, int beg, int end, int number) {

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

	public void generateAll(List<String> ans, StringBuffer bracket, int n, int leftCounter, int rightCounter) {

		if (bracket.length() == 2 * n) {
			ans.add(bracket.toString());
			bracket.delete(1, bracket.length());
			return;
		}

		// case 1 left counter is less than equal to number
		if (leftCounter < n) {
			generateAll(ans, bracket.append("("), n, ++leftCounter, rightCounter);
		}
		if (rightCounter < n) {
			generateAll(ans, bracket.append(")"), n, ++rightCounter, rightCounter);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParenthesis gp = new GenerateParenthesis();
		gp.generateParenthesis(3);
	}

}
