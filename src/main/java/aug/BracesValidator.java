package aug;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BracesValidator {

	public static boolean isBracketsValid(String input) {
		
		char inputArr[] = input.toCharArray();
		Map<Character,Character> symbol = new HashMap<Character,Character>();
		symbol.put('[',']');
		
		symbol.put('{','}');
				
		symbol.put('(',')');
	
		
		Deque<Character> stack = new LinkedList<Character>();
		
		
		 for( char c :inputArr) {
			 
			 if(symbol.containsKey(c)) {
				 stack.push(c);
			 }
			 else {
				char peekElement = stack.peek();
				if(symbol.get(peekElement)==c) {
					stack.pop();
				}
			 }
			 
		 }
		return stack.isEmpty();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "{[(])}" ;
		boolean result = isBracketsValid(input);
		System.out.println(result);

	}

}
