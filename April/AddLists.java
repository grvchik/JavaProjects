


public class AddLists {

	 static class ListNode {
	      Integer val;
	      ListNode next;
	      ListNode(Integer x) { val = x; }
	  }
		
	
	 public static ListNode addTwoLists(ListNode l1,ListNode l2) {
		 
		 ListNode sentil = new ListNode(-1);
		 
		 ListNode construct = sentil;
		 int sum=0;
		 int carry=0;
		 
		 while(l1!=null || l2!=null) {
			 if(l1!=null && l2!=null) {
				 sum+=l1.val+l2.val+carry;
				 l1 = l1.next;
				 l2 = l2.next;
			 }
			 
			 if(l2!=null && l1==null) {
				 sum+=l2.val+carry;
				 l2 = l2.next;
			 }
			 
			 if(l1!=null && l2==null) {
				 sum+=l1.val+carry;
				 l1 = l1.next;
			 }

			 if(carry>0) {
				 carry=0;
			 }
			

			 
			 carry= sum/10;
			 sum = sum%10;
			
			 construct.next = new ListNode(sum);
			 construct = construct.next;
			 
			 if(sum>0) {
				 sum=0;
			 }	 
		 }
		 
		 if(carry>0) {
			 construct.next = new ListNode(carry);
			 construct = construct.next;
		 }
		 
		 
		 return sentil.next;
	 }
	 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1a = new ListNode(3);
		ListNode l1b = new ListNode(1);
		ListNode l1c = new ListNode(4);
		
		l1a.next = l1b;
		l1b.next = l1c;
		
		ListNode l2a = new ListNode(7);
		ListNode l2b = new ListNode(0);
		ListNode l2c = new ListNode(9);

		l2a.next = l2b;
		l2b.next = l2c;
		
		addTwoLists(l1a,l2a);
		
	}

}
