package May2020;

import java.util.Deque;
import java.util.LinkedList;

public class BracketValidator {

	public static boolean isValidBracket(String str) {
		
		char bracket[] = str.toCharArray();
		
		Deque<Character> stack = new LinkedList<Character>();
		
		for(char ch: bracket) {
			
			if(ch=='(' || ch=='{' || ch=='[' ) {
				stack.push(ch);
			}
			else {
				char top = stack.peek();
				
				if(ch==')' && top!='(') {
					return false;
				}
				if(ch==']' && top!='[') {
					return false;
				}				
				if(ch=='}' && top!='{') {
					return false;
				}	
				stack.pop();
			}
		}
		
		
		return stack.isEmpty();
		
		
	}
	
	
	
	public static void main(String g[]) {
		
		String str = "([])";
		boolean isValid = isValidBracket(str);
		System.out.println(isValid);
	}
	
}
