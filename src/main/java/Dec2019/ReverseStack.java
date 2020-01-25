package Dec2019;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseStack {

	public static void reverseStack(Deque<Integer> stack) {
			if(stack.isEmpty()) {
				return ;
			}
			Integer top = stack.pop();
			reverseStack(stack);
			insertAtBottom(stack, top);
			System.out.println(stack);
			
	}
	
	public static void  insertAtBottom(Deque<Integer> stack,int value) {
		if(stack.isEmpty()) {
			stack.push(value);	
		}
		else {
			Integer top = stack.pop();
			insertAtBottom(stack, value);
			stack.push(top);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> st = new LinkedList<Integer>();
		st.add(1);
		st.add(2);
		st.add(3);
		reverseStack(st);
		
	}

}
