package Sep2020;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
	Queue<Integer> pushQ = null;
	Queue<Integer> popQ = null;
	public StackUsingQueues() {		
		pushQ = new LinkedList<Integer>();
		popQ = new LinkedList<Integer>();
	}
	
	public void push(Integer elem1) {
		pushQ.add(elem1);
	}

	public Integer pop() {
		
		if(pushQ.size()==1) {
			return pushQ.poll();
		}
		else {
			while(pushQ.size()>1) {
				popQ.add(pushQ.poll());
			}
		}
		Integer retValue = pushQ.poll();
		//move everything back to pushQ
		while(!popQ.isEmpty()) {
			pushQ.add(popQ.poll());
			
		}
		return retValue;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingQueues sq = new StackUsingQueues();
		sq.push(1);
		System.out.println(sq.pop());
		sq.push(1);
		sq.push(2);
		sq.push(3);
		sq.push(4);
		System.out.println(sq.pop());	
		System.out.println(sq.pop());		
		System.out.println(sq.pop());		
	}

}
