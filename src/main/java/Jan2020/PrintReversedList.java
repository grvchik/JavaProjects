package Jan2020;

public class PrintReversedList {

	
	public static void printNextNode(ListNode node) {
		
		if(node.next==null) {
			System.out.println(node.value);
		}
		else {
			printNextNode(node.next);
			System.out.println(node.value);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		
		printNextNode(n1);
		
		
	}

}
