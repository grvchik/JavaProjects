package Sep2020;

public class DeleteNodesLinkedList {

	public static ListNode deleteNodes(ListNode head,int value) {
		
		ListNode prev = new ListNode(-1);
		ListNode sentilNode = new ListNode(-1);
		sentilNode.next = prev;
		while(head!=null) {
			if(head.value!=value) {
				prev.next = new ListNode(head.value);
				prev= prev.next;			
			}

			
			head = head.next;
		}
		return sentilNode.next;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(9);
		ListNode n3 = new ListNode(6);
		ListNode n4 = new ListNode(9);
		ListNode n5 = new ListNode(8);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		ListNode deleted = deleteNodes(n1,9);
		System.out.println(deleted);
		
	}

}
