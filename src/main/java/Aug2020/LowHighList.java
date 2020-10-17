package Aug2020;

import Aug2020.ReverseLinkedList.ListNode;

public class LowHighList {

	public static void addLowerHigher(ListNode root) {
		
		ListNode head = root;
		ListNode senthilNode = new ListNode(-1);
		senthilNode.next = root;
		int counter=0;
		while(head!=null) {
			ListNode next = head.next;
			if(counter%2!=0 && next!=null && next.next!=null) {
				int temp = head.value;
				head.value = next.value;
				head.next.value = temp;
				//System.out.println("Swap "+counter+" and "+nextNumber+" nodes");
			}
			
			head = head.next;
			counter++;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode root = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		root.next = two;
		two.next = three;
		three.next = four;
		//four.next = five;
		addLowerHigher(root);
	}

}
