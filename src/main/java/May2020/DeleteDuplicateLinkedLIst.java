package May2020;

import java.util.HashSet;
import java.util.Set;

public class DeleteDuplicateLinkedLIst {

	public static void deleteDuplicatesFromLinkedList(ListNode one) {
		Set<Integer> uniqueValue = new HashSet<Integer>();
		ListNode sentilNode = new ListNode(-1);
		sentilNode.next = one;
		
		
		ListNode curr = one;
		if(one.next==null) {
			return ;
		}
		ListNode next = one.next;
		uniqueValue.add(curr.value);
		while(curr!=null && next!=null) {
			if(!uniqueValue.contains(next.value)) {
				curr = next;
				uniqueValue.add(next.value);
			}
			else {
				
				curr.next = next.next;
			}
			next = next.next;
		}
		System.out.println(sentilNode);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode one = new ListNode(2);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(2);
		ListNode five = new ListNode(5);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		deleteDuplicatesFromLinkedList(one);
	}

}
