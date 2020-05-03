package Mar2020;

import java.util.PriorityQueue;

class ListNodeDetais implements Comparable<ListNodeDetais> {
	
	public int position;
	
	public ListNode node;

	public ListNodeDetais(int pos,ListNode node) {
		this.position = pos;
		this.node = node;
	}
	
	@Override
	public int compareTo(ListNodeDetais o) {

		return this.node.value-o.node.value;
	}
}

public class MergeKLists {

	
	public static ListNode mergeKLists(ListNode[] lists) {
				
		if(lists==null || lists.length==0) {
			return null;
		}
		
		PriorityQueue<ListNodeDetais> pq = new PriorityQueue<>();
		for(int i=0;i<lists.length;i++) {
		
			ListNode node = lists[i];
			ListNodeDetais lnd = new ListNodeDetais(i,node);
			pq.add(lnd);
		}
		
		ListNode temp = null;
		ListNode current = null;
		while(!pq.isEmpty()) {
			
			ListNodeDetais lnd = pq.poll();
			if(current==null) {
				temp = new ListNode(lnd.node.value);
				current = temp;
			}
			else {
			   current.next = new ListNode(lnd.node.value);
			   current = current.next;
			}
			
			lists[lnd.position] =lists[lnd.position].next;
			
			if (lists[lnd.position]!=null) {
				ListNodeDetais lnd1 = new ListNodeDetais(lnd.position, lists[lnd.position]);
				pq.add(lnd1);
			}
			
			System.out.println(pq);
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
		
		ListNode oddOne = new ListNode(3);
		ListNode oddThree = new ListNode(5);
		ListNode oddFive = new ListNode(7);
		oddHead.next = oddOne;
		oddOne.next = oddThree;
		oddThree.next = oddFive;

		ListNode thirdhead = new ListNode(11);
		ListNode thirdheadThree = new ListNode(13);
		thirdhead.next = thirdheadThree;
		
		
		
		
		ListNode[] lists = {evenHead,oddHead,thirdhead};
		
		ListNode merged =mergeKLists(lists);
		System.out.println(merged);
		
	}

}
