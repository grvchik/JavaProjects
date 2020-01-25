package Jan2020;
class ListNode {
	
	ListNode(int val) {
		this.value = val;
	}
	
	public int value;	
	public ListNode next;
	
}

public class LinkedListInterSection {

	public ListNode getIntersectionNode(ListNode node1,ListNode node2) {
		
		//base case
		if(node1==null || node2==null) {
			return null;
		}
		
		if(node1.value==node2.value) {
			return node1;
		}
		
		ListNode firstMovement = getIntersectionNode(node1.next, node2);
		ListNode secondMovement = getIntersectionNode(node1, node2.next);
		
		if(firstMovement==null && secondMovement!=null) {
			return secondMovement;
		}
		if(secondMovement==null && firstMovement!=null) {
			return firstMovement;
		}

		return getIntersectionNode(node1.next, node2.next);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListInterSection interSection = new LinkedListInterSection();
		ListNode list1 = new ListNode(2);
		ListNode seven = new ListNode(7);
		ListNode eight = new ListNode(8);	
		
		list1.next = seven;
		seven.next = eight;
		
		ListNode list2 = new ListNode(1);
		
		ListNode node2 = new ListNode(8);
		list2.next = node2;
		
		
		ListNode inter =interSection.getIntersectionNode(list1, list2);
		System.out.println(inter);
	}

}
