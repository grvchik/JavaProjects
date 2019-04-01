



public class OddEvenList {

	 static class ListNode {
	      Integer val;
	      ListNode next;
	      ListNode(Integer x) { val = x; }
	  }
	
	public static ListNode mergeOddEvenList(ListNode node) {
	
		ListNode sentilEvenNode = new ListNode(-1);
		ListNode sentilOddNode = new ListNode(-1);
		ListNode evenNode = sentilEvenNode;
		ListNode oddNode = sentilOddNode;
		
		ListNode iterNode = node;
		
		while(iterNode!=null) {
			
			if(iterNode.val%2!=0) {
				oddNode.next = iterNode;
				oddNode = oddNode.next;
			}
			else {
				evenNode.next = iterNode;
				evenNode = evenNode.next;
			}			
			iterNode  = iterNode.next;
		}
			evenNode.next = null;	
			oddNode.next = sentilEvenNode.next;
			//evenNode
			
		System.out.println("odd evel");
		
		return sentilOddNode.next;
	}
	 
	 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		mergeOddEvenList(n1);
	}

}
