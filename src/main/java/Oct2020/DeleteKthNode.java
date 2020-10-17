package Oct2020;

public class DeleteKthNode {

	public static LinkedList deleteKthNode(LinkedList head, int k) {
		LinkedList sentilNode = new LinkedList(-1);
		
		LinkedList slow = head;
		LinkedList fast = head;
		sentilNode.next = slow;
		int counter=0;
		while(counter<k) {
			fast = fast.next;
			counter++;
		}
		
		while(fast.next!=null) {
			slow = slow.next;
			fast = fast.next;			
		}
		
		slow.next = null;
		return sentilNode.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l1 = new LinkedList(1);
		LinkedList l2 = new LinkedList(2);
		LinkedList l3 = new LinkedList(3);
		LinkedList l4 = new LinkedList(4);
		LinkedList l5 = new LinkedList(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next=l5;
		
		LinkedList updatedList = deleteKthNode(l1, 2);
		System.out.println(updatedList);
	}

}
