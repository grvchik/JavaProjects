package Jan2020;

import org.w3c.dom.Node;



public class ReverseLinkedList {

	public static ListNode reverseList(ListNode head) {
		
	ListNode lastNode = null;	
	ListNode retNode = null;	
		
	  while(head!=null) {
		  
		  retNode = new ListNode(head.value) ;
		  if(lastNode!=null) {
			  retNode.next= lastNode;
		  }
		  lastNode = retNode;
		  head = head.next;
	  }
	
		return retNode;

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
		reverseList(n1);
	}

}
