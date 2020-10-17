package June2020;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class ItemTime  implements Comparable<ItemTime>{
public int value;
public Timestamp timestamp;


	public ItemTime(int value) {;
		this.timestamp = new Timestamp(System.currentTimeMillis());
		this.value = value;
	}

	@Override
	public int compareTo(ItemTime o) {
	       return  o.timestamp.compareTo(this.timestamp);
	}
	
}

class Stack {
	
	public PriorityQueue<ItemTime>pq;
	
	
	
	public Stack() {
	   this.pq = new PriorityQueue<ItemTime>();
	}
	
	public void push(int valueIn) {
		ItemTime it = new ItemTime(valueIn);
		pq.add(it);
	}
	
	public int pop() {
		
		if(!pq.isEmpty()) {
			return pq.poll().value;
		}
		return -1;
	}
	
}

public class StackUsingPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(2);
		st.push(3);
		st.push(4);
		
		System.out.println(st.pop());
		
	}

}
