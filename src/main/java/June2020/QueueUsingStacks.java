package June2020;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class Queue {
	private Deque<Integer> stack1;
	private Deque<Integer> stack2;
	public Queue() {
		this.stack1 = new ArrayDeque<Integer>();
		this.stack2 = new ArrayDeque<Integer>();
	}
	
	public void enqueue(Integer value) {
		//put everything in stack1
		this.stack1.push(value);
	}
	
	public Integer  dequeue() {
		if(!stack2.isEmpty()) {
			return stack2.pop();
		}
		while( !this.stack1.isEmpty()) {
			this.stack2.push(this.stack1.pop());
		}
		Integer top = this.stack2.pop();
	
		return top;
	}
	
}

public class QueueUsingStacks {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.enqueue(1);
		int top = queue.dequeue();
		System.out.println(top);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		top = queue.dequeue();
		System.out.println(top);
		top = queue.dequeue();
		System.out.println(top);	
		top = queue.dequeue();
		System.out.println(top);			
	}

}
