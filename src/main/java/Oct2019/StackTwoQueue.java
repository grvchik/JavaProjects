package Oct2019;

import java.util.LinkedList;

class Stack {
	
	LinkedList<Integer> pushList;
	LinkedList<Integer> popList;
	
	public void push(Integer value) {
		pushList.add(value);
		while(!pushList.isEmpty()) {
			popList.add(pushList.removeLast());
		}		
	}

	public boolean isEmpty() {
		return pushList.isEmpty() && popList.isEmpty();
	}
	
	public Integer pop() throws Exception{
		while(!pushList.isEmpty()) {
			popList.add(pushList.removeLast());
		}
		if(popList.isEmpty()) { 
			throw new Exception("Empty Stack Exception");
		}
		return popList.remove();
	}
	
	public Integer peek() {

			while(!pushList.isEmpty()) {
				popList.add(pushList.removeLast());
			}		
		
		return popList.peekLast();	
	}
	
	public Stack() {
		pushList = new LinkedList<Integer>();
		popList = new LinkedList<Integer>();
	}
	
}

public class StackTwoQueue {

	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stack  st = new Stack();
		st.push(1);
		st.push(2);
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.push(3);
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.peek());
		
		
	}

}
