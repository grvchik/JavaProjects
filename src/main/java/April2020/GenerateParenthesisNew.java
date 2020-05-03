package April2020;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisNew {

	
	public static void addParenthesis(List<String> list, char[] str,int leftrem,int rightrem,int index) {
		if(leftrem <0 || rightrem < leftrem) {
			return;
		}
		if(leftrem==0 && rightrem==0) {
			list.add(String.copyValueOf(str));
		}
		else {
			str[index] = '(';
			if(leftrem >0) {
				addParenthesis(list, str, leftrem-1, rightrem, index+1);
			}
			
			
			str[index] = ')';
			if(rightrem >0) {
				addParenthesis(list, str, leftrem, rightrem-1, index+1);
			}
		
			
			
		}
	}
	
	
	public static void generateParen(int num) {
		char str[] = new char[num*2];
		List<String> list = new ArrayList<String>();
		
		addParenthesis(list, str, num, num, 0);
		for(String str1: list) {
			System.out.println(str1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateParen(3);
	}

}
