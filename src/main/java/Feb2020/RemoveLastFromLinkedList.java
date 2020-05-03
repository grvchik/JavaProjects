package Feb2020;

public class RemoveLastFromLinkedList {

	public static ListNode removeLastFromList(ListNode head) {
		
		ListNode curr = head.next;
		ListNode secondLastNode = head;;
		ListNode sentilNode = new ListNode(-1);
		sentilNode.next  =secondLastNode;
		
		while(curr!=null && secondLastNode!=null) {		
			if(secondLastNode.next.next==null) {
				secondLastNode.next=null;
				break;
			}
			secondLastNode = secondLastNode.next;
			curr = curr.next;
		}
		
		curr.next = sentilNode.next;
		
		return curr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		removeLastFromList(n1);
	}

}
