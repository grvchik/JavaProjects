package July;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueUsingStack {

	private Deque<Integer> enqueue = new LinkedList<Integer>();
	private Deque<Integer> dequeue = new LinkedList<Integer>();
	
	public void enqueue(Integer x) {
		enqueue.push(x);
	}
	
	public int dequeue() {

		if(dequeue.isEmpty()) {
			while(!enqueue.isEmpty()) {
				dequeue.addFirst(enqueue.pop());
			}			
		}

		
		if(!dequeue.isEmpty()) {
			return dequeue.removeFirst();
		}
		throw new NoSuchElementException("cannot pop empty queue");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueUsingStack q1 = new QueueUsingStack();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		int firstGuy = q1.dequeue();
		System.out.println(firstGuy);
		q1.enqueue(4);
		firstGuy = q1.dequeue();
		
		System.out.println(firstGuy);
		
	}

}
