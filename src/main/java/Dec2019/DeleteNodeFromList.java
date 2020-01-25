package Dec2019;



class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
public class DeleteNodeFromList {

	public static ListNode removeNodeFromList(ListNode n1, int val) {
		
		if(n1==null) {
			return null;
		}
		
		if(n1!=null && n1.next==null) {
			if (n1.val == val) {
				return null;
			}
			else {
				return n1;
			}
		}
		
		
		ListNode sentilNode = new ListNode(-1);
		sentilNode.next = n1;
		
		if(n1.val==val) {
		  n1 = n1.next;
		  return n1;
		}
			
		while(n1!=null) {
			ListNode prev = n1;		
			n1 = n1.next;
			if(n1!=null && n1.val==val) {
				prev.next = n1.next;
				n1 = prev;
			}			
		}
//		if(contains(sentilNode, val)) {			
//			removeNodeFromList(sentilNode,val);
//		}
		return sentilNode.next;
	}
	
	
	public static boolean contains(ListNode n1,int val) {
		while(n1!=null) {
			if(n1.val==val) {
				return true;
			}
		  n1 = n1.next;	
		}
		return false;
	}
	
	public static void printList(ListNode node) {
		
		while(node!=null) {
			
			System.out.println(node.val);
			node  = node.next;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(4);
		ListNode l4 = new ListNode(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;		
	
		ListNode remNode = removeNodeFromList(l1, 4);
	
	   printList(remNode);
		
	}

}
