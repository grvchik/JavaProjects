package Feb2020;

public class RemoveLastNthNode {

	public static int getLength(ListNode node) {
		int length=0;
		while(node!=null) {
			node = node.next;
			++length;
		}
		return length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		int length = getLength(node1);
		
		System.out.println(length);
		System.out.println(node1);
	}

}
