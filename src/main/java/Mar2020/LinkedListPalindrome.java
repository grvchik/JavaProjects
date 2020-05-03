package Mar2020;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListPalindrome {

	public static boolean isPalindrome(ListNode node) {
		
		ListNode current = node;
		
		
		if(node.next==null) {
			return true;
		}
		
		ListNode runner = node;
		Deque<Integer> stack1 = new LinkedList<Integer>();
		while(runner!=null && runner.next!=null ) {
			stack1.push(current.value);
			current = current.next;
			runner = runner.next.next;
		}
		
		if(runner!=null) {
			current = current.next;
		}
		
		while(!stack1.isEmpty() && current!=null) {
			if(current.value != stack1.pop()) return false;			
		}
		
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode root = new ListNode(2);
		ListNode one = new ListNode(1);
		ListNode three = new ListNode(3);
		root.next = one;
		System.out.println(isPalindrome(root));
		
	}

}
