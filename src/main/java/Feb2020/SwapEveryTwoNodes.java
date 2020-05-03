package Feb2020;

public class SwapEveryTwoNodes {

	public static void swapTwoNodes(ListNode head) {
		//2-1-3
		ListNode slow = head;
		ListNode fast = head.next;
		ListNode returnNode = new ListNode(-1);
		ListNode sentilNode = new ListNode(-1);
		sentilNode = returnNode;
		while(slow!=null && fast!=null) {
			System.out.println("Swap the values"+slow.val+" with "+fast.val);

			returnNode.next = new ListNode(fast.val);
			returnNode = returnNode.next;
			returnNode.next = new ListNode(slow.val);
			returnNode = returnNode.next;
			
			if(slow.next.next==null) {
				break;
			}
			else {
				slow = slow.next.next;
			}
			
			if(fast.next.next==null) {
				break;
			}
			else {
				fast = fast.next.next;
			}
		}
		System.out.println(sentilNode.next);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode root = new ListNode(2);
		ListNode four = new ListNode(4);
		ListNode one = new ListNode(1);
		ListNode three = new ListNode(3);
		root.next = four;
		four.next=one;
		one.next = three;
		swapTwoNodes(root);
	}

}
