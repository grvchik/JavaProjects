package Sept2019;


public class DeleteListFromMiddle {

	
	public static ListNode  deleteListFromMiddle(ListNode head) {
		 int size = getSize(head);
		 int deleteLocation = 0;
		 if(size%2==0) {
			 deleteLocation = size/2;
		 }
		 else {
			 deleteLocation = size/2 + 1;
		 }	
		 
		 
		if(head==null) {
			return null;
		}
		
		if(head.val == deleteLocation) {
			return head.next;
		}
		int counter=0;
		ListNode sentilNode = new ListNode(-1);
		sentilNode.next = head;
		ListNode node = head;
		while(node.next!=null) {
			ListNode prev = node;
			node = node.next;
			if(deleteLocation==counter) {
				prev.next = node.next;
				break;
			}
			
			++counter;
			
		}
		
		return sentilNode.next;
	}
	
	
	

	public static int getSize(ListNode n) {
		
		ListNode temp = n;
		int size = 0;
		while(temp!=null) {
			temp = temp.next;
			++size;
		}
		
		return size;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		//ListNode nmiddle = new ListNode(5);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(1);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
	//	nmiddle.next = n4;
		n4.next = n5;
		n5.next = n6;
		deleteListFromMiddle(n1);
	}

}
