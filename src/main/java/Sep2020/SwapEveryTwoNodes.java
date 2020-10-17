package Sep2020;

public class SwapEveryTwoNodes {

	
	public static ListNode  swapEveryTwoNodes(ListNode head) {
		ListNode sentilNode = new ListNode(-1);
		ListNode slow = head;
		ListNode fast = head.next;
		sentilNode.next=head;
		int counter = 0;
		while(fast!=null  ) {
			
			if(counter%2==0) {
				int temp = slow.value;
				slow.value = fast.value;
				fast.value = temp;
				
			}
			
			slow = slow.next;
			fast = fast.next;
			counter++;
		}
		return sentilNode.next;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		one.next = two;
		two.next=three;
		three.next=four;
		
		ListNode swapNode = swapEveryTwoNodes(one);
		System.out.println(swapNode);
	}

}
