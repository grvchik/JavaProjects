package Sept2019;

public class PrintReversedList {

	public static void printReversedList(ListNode root) {
		if(root==null) {
			return;
		}
		
			
		
		
		printReversedList(root.next);
		System.out.println(root.val);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		printReversedList(node1);
	}

}
