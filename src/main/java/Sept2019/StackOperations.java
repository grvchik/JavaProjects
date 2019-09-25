package Sept2019;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

class MinimumValue implements Comparable<MinimumValue> {
	
	public MinimumValue(int input) {
		this.minValue = input;
	}
	
	private Integer minValue;
	
	public Integer getMinValue() {
		return minValue;
	}

	public void setMinValue(Integer minValue) {
		this.minValue = minValue;
	}



	public int compareTo(MinimumValue o) {
		// TODO Auto-generated method stub

		return this.getMinValue()-o.getMinValue();
//		if(o.minValue<this.minValue) {
//			return 1;
//		}
//		if(o.minValue> this.minValue) {
//			return -1;
//		}
//
//		return 0;

	}
}

public class StackOperations {

	private static PriorityQueue<MinimumValue> pqueue = new PriorityQueue<MinimumValue>();
	
	public static int addMinimum(int input) {
		
		MinimumValue minValue = new MinimumValue(input);
		pqueue.add(minValue);
		
		MinimumValue exisMinValue = pqueue.peek();
		
		return exisMinValue.getMinValue();
		
	}
	
	public static int getMinimum() {
		MinimumValue exisMinValue = pqueue.peek();
		
		return exisMinValue.getMinValue();
	}
	
	public static void removeMinimum(int input){
		MinimumValue minValue = new MinimumValue(input);
		MinimumValue existing = pqueue.peek();
		if(existing.getMinValue()==minValue.getMinValue()) {
			pqueue.poll();	
		}
		
	}
	
	
	public static void sortStacks() {
		
		Deque<Integer> stack1 = new LinkedList<Integer>();
		stack1.push(8);
		stack1.push(9);
		stack1.push(5);
		stack1.push(7);
		
		int temp = -1;

		Deque<Integer> stack2 = new LinkedList<Integer>();
	
		while(!stack1.isEmpty()) {		
		if(stack2.isEmpty()) {
		
			if(temp!=-1) {
				stack2.push(temp);	
			}
			else {
				stack2.push(stack1.pop());
			}
						
		}
		else {			
			
				 temp = stack1.pop();
				 int top2 = stack2.peek();
				 
				 if(temp>top2) {
					 stack2.push(temp);
				 }
				 else {
					 while(!stack2.isEmpty()) {
						 top2 = stack2.peek();
						 if(temp>top2) {
							 stack2.push(temp);
							 break;
						 }
						 stack1.push(stack2.pop());						 
					 }
				 }						
		}// else
		}// while
	}
	
	
	
	public static void reverseStacks() {
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addMinimum(2);
		addMinimum(3);
		addMinimum(4);
		int minValue = addMinimum(1);
		System.out.println(minValue);
		removeMinimum(1);
		 minValue = getMinimum();
		//System.out.println(minValue);
		sortStacks();
	}

}


