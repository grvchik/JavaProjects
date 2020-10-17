package Sep2020;

public class SwapEveryTwoRecursion {

	public static ListNode  swapEveryTwoNodes(ListNode head) {
		if(head==null || head.next==null) {
			return head;
		}
		
		   ListNode second = head.next;
	         ListNode third = second.next;
	        second.next = head;
		
	        head.next = swapEveryTwoNodes(third);
		
		
		
		return second;
	}
	
	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		one.next = two;
	//	two.next=three;
	//	three.next=four;
		
		ListNode swapNode = swapEveryTwoNodes(one);
		System.out.println(swapNode);	

	}

}
