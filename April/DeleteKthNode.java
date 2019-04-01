

public class DeleteKthNode {

	 static class ListNode {
	      Integer val;
	      ListNode next;
	      ListNode(Integer x) { val = x; }
	  }
	
	public static ListNode deleteKthNode(ListNode node,int k) {
	
		ListNode sentilEvenNode = new ListNode(-1);
		
		ListNode lengthNode = node;
		ListNode iterNode = node;
		sentilEvenNode.next = iterNode; 
		int length = getLength(lengthNode);
		
		int forwardIndex = length-k-1;
		int iterIndex=0;
		//sentilEvenNode = iterNode;
		while(node!=null) {
			
			if(iterIndex==forwardIndex && forwardIndex!=length-1) {
				ListNode prev = node.next;
				node.next = node.next.next;
				prev.next=null;
				break;
			}
			
			if(iterIndex==forwardIndex && forwardIndex==length-1) {
				node.next=null;
				break;
			}

			
			node = node.next;
			++iterIndex;
		}
		
		return sentilEvenNode.next;
	}
	 

	public static int getLength(ListNode node) {
		if(node==null) return 0;
		
		int counter = 0;
		
		while(node!=null) {
			node = node.next;
			++counter;
		}
		
		return counter;
	}
	 
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(3);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(5);
		ListNode n4 = new ListNode(7);
		ListNode n5 = new ListNode(8);
		ListNode n6 = new ListNode(9);
		ListNode n7 = new ListNode(11);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		deleteKthNode(n1, 1);
	}

}
