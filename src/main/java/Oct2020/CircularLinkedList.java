package Oct2020;

public class CircularLinkedList {

	public static boolean isCircular(LinkedList head) {
		
		LinkedList slow = head;
		LinkedList fast = head.next;
		
		while(slow!=null && fast!=null) {
			
			if(slow.value==fast.value) {
				return true;
			}
			
			if(fast.next!=null) {
				fast = fast.next.next;
			}
			else {
				return false;
			}
			slow = slow.next;
			
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList(1);
		LinkedList l2 = new LinkedList(2);
		LinkedList l3 = new LinkedList(3);
		LinkedList l4 = new LinkedList(4);
		LinkedList l5 = new LinkedList(5);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next=l5;
		l5.next = l1;
		boolean res = isCircular(l1);
		System.out.println(res);
	}

}
