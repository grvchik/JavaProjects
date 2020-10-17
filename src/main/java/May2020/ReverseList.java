package May2020;



public class ReverseList {

	public static ListNode reverseList(ListNode n1) {
		
		ListNode current = n1;
		ListNode nextNode = null;
		ListNode prevNode = null;
   		
	
		while(current!=null) {
			nextNode = current.next;
			current.next = prevNode;
			prevNode = current;
			current = nextNode;
		   		
		}
		return prevNode;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		ListNode rev = new ListNode(-1);
		rev.next = n1;
		reverseList(n1);
	}

}
