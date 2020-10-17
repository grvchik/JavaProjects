package Oct2020;

public class ReverseLinkedListRecursion {

	
	public static LinkedList reverseList(LinkedList head) {
		
		// base condition
		if(head==null || head.next==null) {
			return head;
		}
		
		LinkedList next = head.next;
		
		
		LinkedList rest = reverseList(next);
		next.next = head;
		head.next = null;
		return rest;
		
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

		LinkedList rev = reverseList(l1);
		System.out.println(rev);
	}

}
