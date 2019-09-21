package Sept2019;

import java.util.ArrayList;
import java.util.List;

public class PartitionList {

public static ListNode partitionListNew(ListNode node,int pivot) {
	ListNode  head = node;
	ListNode  tail = node;
	
	while(node!=null) {
		ListNode next = node.next;
		if(node.val< pivot) {
			node.next = head;
			head  = node;
		}
		else {
			tail.next = node;
			tail = node;
		}
		node = next;
	}
	tail.next = null;
	return head;
}
	
	
	public static ListNode partitionList(ListNode head,int pivot) {
		
		List<Integer> beforePivot = new ArrayList<Integer>();
		List<Integer> afterPivot = new ArrayList<Integer>();
		ListNode sentilNode = new ListNode(-1);
		
		ListNode runner = head;
		ListNode maker = null;
		while(runner!=null) {
			int value = runner.val;
			if(value<pivot) {
				beforePivot.add(value);
			}
			else if(value>pivot) {
				afterPivot.add(value);
			}
			runner = runner.next;
		}		
		beforePivot.add(pivot);
		
		
		for(int i=0;i<beforePivot.size();i++) {
			if(i==0) {
				maker = new ListNode(beforePivot.get(i));
				sentilNode.next =maker;
			}
			else {
				maker.next = new ListNode(beforePivot.get(i));	
				maker = maker.next;
			}
			
		}
		
		for(int i=0;i<afterPivot.size();i++) {

			maker.next = new ListNode(afterPivot.get(i));				
			
			maker = maker.next;
		}
		
		return sentilNode.next;
	
	}
	
	
	
	
	public static void main(String[] args) {
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
	
		ListNode partition = partitionList(n1, 5);
		ListNode partition1 = partitionListNew(n1, 5);
		System.out.println(partition1);
	}
}
