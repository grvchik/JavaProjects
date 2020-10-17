package Sep2020;

public class LinkedListIntersection {

	
	public static ListNode findInterSection(ListNode node1,ListNode node2) {
		ListNode mergedList = new ListNode(-1);
		ListNode sentilNode = new ListNode(-1);
		sentilNode.next = mergedList;
		ListNode backup = node2;
		while(node1!=null ) {
			int value1 = node1.value;
		
			while(node2!=null) {
				int value2 = node2.value;
				if(value1==value2) {
					mergedList.next = new ListNode(value1);
					mergedList = mergedList.next;
				}
				
				node2 = node2.next;
			}
			
			node2 = backup;
			
			node1 = node1.next;
		}
		
		return sentilNode.next.next;
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
		ListNode n11 = new ListNode(3);		
		ListNode n12 = new ListNode(6);
		ListNode n13 = new ListNode(8);
		n11.next = n12;
		n12.next = n13;
		
		ListNode node3 = findInterSection(n1, n11);
		System.out.println(node3);
	}

}
