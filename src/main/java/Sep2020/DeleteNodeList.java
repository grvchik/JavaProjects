package Sep2020;

public class DeleteNodeList {

	
	public static ListNode deleteNode(ListNode head,int value) {
		
		ListNode ret = new ListNode(-1);
		ret.next = head;
		while(head!=null) {
			ListNode prev = head;
			head = head.next;			
			
			if(head!=null && head.value == value) {
				prev.next = head.next;
				head = prev;
			}
				
		
			
			
			
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		ListNode deleted = deleteNode(n1,9);
		System.out.println(deleted);
		
	
	}

}
