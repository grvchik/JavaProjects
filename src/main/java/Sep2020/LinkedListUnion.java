package Sep2020;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListUnion {

	public static ListNode findLinkedListUnion(ListNode n1,ListNode n2) {
		
		ListNode sentilNode = new ListNode(-1);
		ListNode metgedNode = new ListNode(-1);
		sentilNode.next = metgedNode;
		Set<Integer> unique = new HashSet<Integer>();
		while(n1!=null && n2!=null) {
			
			if(!unique.contains(n1.value)) {
				metgedNode.next = new ListNode(n1.value);
				unique.add(n1.value);
				metgedNode = metgedNode.next;
			}
		
			
			if(!unique.contains(n2.value)) {
				metgedNode.next = new ListNode(n2.value);
				metgedNode = metgedNode.next;
				unique.add(n2.value);
			}	
		
			
			n1 = n1.next;
			n2 = n2.next;
			
		}
		
		
		while(n1!=null) {
			if(!unique.contains(n1.value)) {
				metgedNode.next = new ListNode(n1.value);
				metgedNode = metgedNode.next;
				unique.add(n1.value);
			}
			
			n1 = n1.next;
		}
		
		while(n2!=null) {
			if(!unique.contains(n2.value)) {
				metgedNode.next = new ListNode(n2.value);
				metgedNode = metgedNode.next;
				unique.add(n2.value);
			}	
					
			n2 = n2.next;
		}
		
		return sentilNode.next.next;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(9);
		ListNode n3 = new ListNode(6);
		ListNode n4 = new ListNode(9);
		ListNode n5 = new ListNode(8);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		ListNode n11 = new ListNode(3);		
		ListNode n12 = new ListNode(6);
		ListNode n13 = new ListNode(8);
		n11.next = n12;
		n12.next = n13;
		ListNode merged = findLinkedListUnion(n1, n11);
		System.out.println(merged);
	}

}
