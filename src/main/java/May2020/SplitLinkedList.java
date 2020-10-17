package May2020;

public class SplitLinkedList {

	public static void splitLinkedList(ListNode root) {
		
	
		ListNode slow = root;
		ListNode fast = root.next;
		ListNode first = new ListNode(-1);
		ListNode firstPart  = first;
		while(slow!=null && fast.next!=null) {

				first.next = new ListNode(slow.value);
			
			slow = slow.next;
			System.out.println("slow="+slow.value);
			fast = fast.next;
			System.out.println("fast="+fast.value);
			first = first.next;
		}
		
		System.out.println(firstPart);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		splitLinkedList(one);
	}

}
