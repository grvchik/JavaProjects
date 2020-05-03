package April2020;

import java.util.Stack;

public class SortStacks {
	public static Stack<Integer> sort(Stack<Integer> stack) {
		Stack <Integer> newStack = new Stack();
	
		newStack.push(stack.pop());
		
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			while(!newStack.isEmpty() && temp >newStack.peek() ) {
				stack.push(newStack.pop());
			}
			
			newStack.push(temp);
			
		}
		
		return newStack;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> stack = new Stack<Integer>();
		stack.push(8);
		stack.push(3);
		stack.push(9);
		stack.push(2);
		Stack <Integer> newStack= sort(stack);
		System.out.println(newStack);
	}

}
