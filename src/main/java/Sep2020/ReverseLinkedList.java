package Sep2020;



public class ReverseLinkedList {

	
	public static ListNode reverseList(ListNode l1) {
		ListNode prev=null;
		ListNode current = l1;
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
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(9);
		ListNode n3 = new ListNode(6);
		ListNode n4 = new ListNode(9);
		ListNode n5 = new ListNode(8);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode reverse = reverseList(n1);
		System.out.println(reverse);
	}

}
