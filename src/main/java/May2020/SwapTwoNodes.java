package May2020;
class ListNode {
	
	public int value;
	public ListNode next;
	public ListNode(int val) {
		this.value = val;
		
	}
	
	
}

public class SwapTwoNodes {

	public ListNode swapNodes(ListNode main) {
		
		ListNode sentilNode = new ListNode(-1);
		sentilNode.next = main;
		ListNode curr = main;
		if(main.next==null) {
			return sentilNode.next;
		}
	
		
		ListNode next = main.next;
		int counter = 1;
		while(curr!=null && next!=null) {
			
			if(counter%2!=0) {
				int temp = curr.value;
				curr.value = next.value;
				next.value = temp;				
			}
		

			
			++counter;
			curr = curr.next;
			next = next.next;
		}
		return sentilNode.next;
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
		SwapTwoNodes swn = new SwapTwoNodes();
		swn.swapNodes(node1);
		
		}

}
