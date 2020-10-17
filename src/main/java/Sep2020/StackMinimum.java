package Sep2020;

import java.util.Deque;
import java.util.LinkedList;

public class StackMinimum {
	Deque<Integer> actualStack = null;
	Deque<Integer> minStack = null;
	public StackMinimum() {
		actualStack = new LinkedList<Integer>();
		minStack = new LinkedList<Integer>();
	}
	
	
	public void push(Integer value) {
		if(minStack.isEmpty()) {
			minStack.push(value);
		}
		else {
			Integer peekMin = minStack.peek();
			if(value<peekMin) {
				minStack.push(value);
			}
		}
		actualStack.push(value);
		
	}
	
	public Integer pop() {
		if(actualStack==null && actualStack.isEmpty()) {
			return -1;
		}
		Integer top = actualStack.pop();
		if(top==minStack.peek()) {
			minStack.pop();
		}
		return top;
	}
	
	public Integer getMinimum() {
		Integer min = -1;
		if(!minStack.isEmpty()) {
			min = minStack.peek();
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackMinimum smin = new StackMinimum();
		smin.push(4);
		smin.push(7);
		smin.push(3);
		smin.push(2);
		smin.push(6);
		System.out.println(smin.getMinimum());
		smin.pop();
		System.out.println(smin.getMinimum());
		smin.pop();
		System.out.println(smin.getMinimum());		
		smin.pop();
		System.out.println(smin.getMinimum());	
		smin.pop();
		System.out.println(smin.getMinimum());			
	}

}
