package Aug2020;

public class ReverseLinkedList {
 static class ListNode {
	 public int value;
	 public ListNode(int val) {
		 value = val;
	 }
	 public ListNode next;
 }
 
 
   public static ListNode  reverseList(ListNode curr) {;
	   ListNode head = curr;
	   ListNode prev = null;
	   ListNode next = null;
	   
	   while(head!=null) {
		   next = head.next;
		  //move head's next pointer to prev node
		   head.next = prev;
		   prev = head;
		   head = next;
	   }
	   
	   return prev;
   }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(4);
		ListNode n2 = new ListNode(8);
		ListNode n3 = new ListNode(9);
		n1.next = n2;
		n2.next = n3;
		ListNode rev = reverseList(n1);
	}

}
