package May2020;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	public static void generateParenthesis(int num) {
		char[] res = new char[num*2];
		List <String> resList = new ArrayList<String>();
		genPareenthesis(resList, res, num, num, 0);
		
		for(String st: resList) {
			System.out.println(st);
		}
	}
	
	
	public static void genPareenthesis(List <String> resList,char[]res,int leftBalance,int rightbalance,int index) {
		if(leftBalance<0  ) {
			return;
		}
			
		if(leftBalance==0 && rightbalance==0) {
			resList.add(String.valueOf(res));
			return;
		}
	
		if(leftBalance>0) {
			res[index] = '(';
			genPareenthesis(resList, res, leftBalance-1, rightbalance, index+1);			
		}

		if(rightbalance>0) {
			res[index] = ')';
			genPareenthesis(resList, res, leftBalance, rightbalance-1, index+1);			
		}

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateParenthesis(3);
	}

}
