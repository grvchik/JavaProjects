package Sep2020;



public class CloneLinkedList {

	
	public static ListNode cloneList(ListNode head) {
		
		ListNode current = head;
		ListNode ret = new ListNode(-1);
		ListNode sentil = new ListNode(-1);
		sentil.next = ret;
		while(current!=null) {	

			ret.next = new ListNode(current.value);		
			
				
			ret = ret.next;
			current = current.next;
		}
		return sentil.next.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(9);
		ListNode n3 = new ListNode(6);

		n1.next = n2;
		n2.next = n3;
		ListNode ret = cloneList(n1);
		System.out.println(ret);
	}

}
