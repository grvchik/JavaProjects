package Feb2020;

public class ReverseLinkedList {

	public static ListNode reverseList(ListNode n1) {
		
	ListNode current = n1;
	ListNode prev = null;

	while(current!=null) {
		ListNode next = current.next;
		current.next = prev;
		
		prev = current;
		current = next;
		
		
	}
		return prev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		ListNode rev = reverseList(n1);
		System.out.println(rev);
	}

}
