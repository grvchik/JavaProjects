package Jan2020;

import java.util.LinkedList;
import java.util.Stack;

public class BalancedBrackets {
	 static String isBalanced(String s) {
	        Stack<String> stack = new Stack<String>();
	        String []str  = s.split("");
	        for (String st :str) {
	            switch(st) {
	                case "{":
	                stack.add(st);
	                break;
	                case "[":
	                stack.add(st);
	                break;
	                case "(":
	                stack.add(st);
	                break;
	                case ")":

	                if(!stack.isEmpty() && stack.peek().equals("(")) {
	                    System.out.println("( is deleted");
	                    stack.pop();
	                    
	                }
	                else {
	                    return "NO";
	                }
	                break;
	                case "]":
	                if(!stack.isEmpty() && stack.peek().equals("[")) {
	                   stack.pop();
	                }
	                else {
	                    return "NO";
	                }
	                break;
	                case "}":
	                if(!stack.isEmpty() && stack.peek().equals("{")) {
	                	 stack.pop();
	                }
	                else {
	                    return "NO";
	                }
	                break;

	            }
	        }

	        if(stack.isEmpty()) {
	            return "YES";
	        }
	        else {
	          return "NO";
	        }
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="{{[[(())]]}}";
		isBalanced(str);
	}

}
