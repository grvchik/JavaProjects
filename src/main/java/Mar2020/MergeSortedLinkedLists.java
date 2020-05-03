package Mar2020;
class ListNode {
	public int value;
	public ListNode next;
	ListNode(int value) {
		this.value = value;
	}
	
}

public class MergeSortedLinkedLists {

	
	public static ListNode mergeLists(ListNode node1,ListNode node2) {
		ListNode temp = null;
		
		if(node1==null && node2!=null) {
			temp = node2;
			return temp;
		}
		if(node2==null && node1!=null) {
			temp = node1;
			return temp;
		}
		
		if(node1.value<node2.value) {
			temp = node1;
			temp.next = mergeLists(node1.next, node2);
		}

		if(node1.value>node2.value) {
			temp = node2;
			temp.next = mergeLists(node1, node2.next);
		}
		
		return temp;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode evenHead = new ListNode(2);
		ListNode even4 = new ListNode(4);
		ListNode even6 = new ListNode(6);
		
		evenHead.next = even4;
		even4.next = even6;
		
		ListNode oddHead = new ListNode(1);
		
		ListNode oddOne = new ListNode(1);
		ListNode oddThree = new ListNode(3);
		ListNode oddFive = new ListNode(5);
		oddHead.next = oddOne;
		oddOne.next = oddThree;
		oddThree.next = oddFive;
	
		ListNode merged = mergeLists(oddOne, evenHead);
		System.out.println("merged"+merged);
		
	}

}
