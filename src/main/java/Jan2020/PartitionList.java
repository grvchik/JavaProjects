package Jan2020;



public class PartitionList {

	public static void partitionList(ListNode node,int val) {
		
		ListNode before = new ListNode(-1);
		ListNode after = null;
		
		while(node!=null) {
			
			if(node.value<val){

					before.next = new ListNode(node.value);	
				
				
				before = before.next;
				
			}
			
			node = node.next;
		}
		
		System.out.println(before.next);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		
		ListNode n4 = new ListNode(5);
		ListNode n5 = new ListNode(6);
		ListNode n6 = new ListNode(7);
		ListNode n7 = new ListNode(8);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		
		partitionList(n1, 5);
		
	}

}
