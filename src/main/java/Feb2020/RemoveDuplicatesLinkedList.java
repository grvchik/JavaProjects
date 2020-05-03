package Feb2020;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesLinkedList {

	
	
	public static ListNode removeDuplicatesFromList(ListNode head) {
		
		ListNode curr = head.next;
		ListNode prev = head;
		ListNode temp;
		Set <Integer> values = new HashSet<Integer>();
		values.add(head.val);
		
	
		while(curr!=null) {
			
			if(!values.contains(curr.val)) {
				curr = curr.next;
				prev = curr;
			}
			else {
				values.add(curr.val);
				
				prev.next = curr.next;
				temp = curr;
				curr = curr.next;
				temp.next = null;
			}
			
		
		}
		return head;
	}
		
	
	public static ListNode removeDuplicates(ListNode head) {
		
		ListNode sentil = new ListNode(-1);
		ListNode backup = sentil;
		Set <Integer> values = new HashSet<Integer>();
		while(head!=null) {
		
			if(values.contains(head.val)) {
				head = head.next;
				continue;
			}
			else {
				values.add(head.val);
				ListNode node = new ListNode(head.val);
				sentil.next = node;
				sentil = sentil.next;
			}
			head = head.next;
		}
		return backup.next;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		removeDuplicatesFromList(n1);
	}

}
