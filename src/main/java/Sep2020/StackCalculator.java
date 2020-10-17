package Sep2020;

import java.util.Deque;
import java.util.LinkedList;

public class StackCalculator {

	
	public int getResult(String expression) {
	
		char oper[] = expression.toCharArray();
		Deque<Integer> stack = new LinkedList<Integer>();
		Deque<Integer> operation = new LinkedList<Integer>();
		int sign = 1;
		int result =0;
		for(int i=0;i<oper.length;i++) {
			
			char element = oper[i];
			switch(element) {
			
				case ' ':
					   continue;
				case '+':
					sign = 1;
				case '-':
					sign = -1;
				case '(':
					stack.push(result);
					result = 0;
					operation.push(sign);
					sign = 0;
				case ')':
					result = operation.pop()*result + stack.pop();
					sign = 1;
					
				default:
				      String num = Character.toString(element);
				      while (i + 1 < oper.length &&  oper[i+1] >= '0' && oper[i+1]  <= '9') {
		                    num += oper[i+1];
		                    i++;
		                }	
				      result += sign * Integer.parseInt(num);				      
			}
			
		}
		return result;
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
