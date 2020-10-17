package Aug2020;

import java.util.Deque;
import java.util.LinkedList;

public class MinInsertionsDeletions {

	public static String minInsertionsDeletions(String str) {
		
		Deque<Character> leftStack = new LinkedList<Character>();
		Deque<Character> rightStack = new LinkedList<Character>();	
		
		char[] charArray = str.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			
			char currentCh = charArray[i];
			if(currentCh=='(') {
				leftStack.push(currentCh);	
			}
			else {
				rightStack.push(currentCh);
			}			
		}
		
		StringBuffer sb = new StringBuffer(str.length()*2);
		while(!leftStack.isEmpty() && !rightStack.isEmpty()) {
			char topLeft = leftStack.pop();
			char topRight = rightStack.pop();
			sb.append(topLeft).append(topRight);
		}
		
		
		while(!leftStack.isEmpty()) {
			char topLeft = leftStack.pop();
			sb.append(topLeft).append(')');
		}
	
		
		while(!rightStack.isEmpty()) {
			char topRight = rightStack.pop();
			sb.append('(').append(topRight);
		}		
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "))()(";
		String bracketValidation = minInsertionsDeletions(str1);
		System.out.println(bracketValidation);
	
	}

}
