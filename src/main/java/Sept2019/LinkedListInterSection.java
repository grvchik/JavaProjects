package Sept2019;

public class LinkedListInterSection {

	
	public static ListNode findIntersectingNode(ListNode first,ListNode second) {
		
		int firstSize = getSize(first);
		int secondSize = getSize(second);
		
		
		ListNode fastNode = null;
		ListNode slowNode = null;
		boolean firstListLonger =false;
		if(firstSize>secondSize) {
		// move first list by the steps equal to difference between these sizes
		 
			fastNode = getKthNode(first,Math.abs(firstSize-secondSize));
			firstListLonger = true;
		}
		else if(firstSize <secondSize) {
		// move second list by the steps equal to difference between szes
			fastNode = getKthNode(second,Math.abs(secondSize-firstSize));
		}
		
		
		if(firstListLonger) {
			slowNode = second;
		}
		else {
			slowNode = first;
		}
		
		while(fastNode!=slowNode) {
			fastNode = fastNode.next;
			slowNode = slowNode.next;
		}
		return slowNode;
	}
	
	
	public static ListNode getKthNode(ListNode head, int k) {
		
		while(k>=0 && head!=null) {
			
			head = head.next;
			--k;
		}
		return head;
	}
	
	

	public static int getSize(ListNode n) {
		
		ListNode temp = n;
		int size = 0;
		while(temp!=null) {
			temp = temp.next;
			++size;
		}
		
		return size;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(18);
		ListNode n2 = new ListNode(14);
		ListNode n3 = new ListNode(8);
		ListNode nmiddle = new ListNode(5);
		ListNode n4 = new ListNode(19);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(1);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		nmiddle.next = n4;
		n4.next = n5;
		n5.next = n6;
		
	
		ListNode second1 = new ListNode(8);
		ListNode second2 = new ListNode(5);
		ListNode second3 = new ListNode(19);
		ListNode second4 = new ListNode(4);
		ListNode second5 = new ListNode(1);
		second1.next = second2;
		second2.next = second3;
		second3.next = second4;
		second4.next = second5;
	
		ListNode intersectNode = findIntersectingNode(n1, second1);
		System.out.print(intersectNode);
	}

}
