package Sep2020;

public class MergedLisnkedLIstsRecursion {
	
	
	public static ListNode mergeListsRecur(ListNode lst1,ListNode lst2) {
		ListNode temp=null;
		if(lst1 == null) {
			return lst2;
		}

		if(lst2 == null) {
			return lst1;
		}
		
		if(lst1.value<=lst2.value) {
			temp = lst1;
			temp.next = mergeListsRecur(lst1.next,lst2);
		}
		else {
			temp = lst2;
			temp.next = mergeListsRecur(lst1,lst2.next);		
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode evenListHead = new ListNode(2);
		ListNode evenList4 = new ListNode(4);
		ListNode evenList6 = new ListNode(6);
		ListNode evenList8 = new ListNode(8);
		evenListHead.next = evenList4;
		evenList4.next = evenList6;
		evenList6.next = evenList8;
		
		ListNode oddListHead = new ListNode(1);
		ListNode oddList3 = new ListNode(3);
		ListNode oddList5 = new ListNode(5);
		oddListHead.next = oddList3;
		oddList3.next = oddList5;
		ListNode result = mergeListsRecur(evenListHead, oddListHead);
	
		System.out.println(result);
	}

}
