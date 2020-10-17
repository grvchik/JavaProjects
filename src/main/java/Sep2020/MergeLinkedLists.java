package Sep2020;
class ListNode {
	public int value;
	public ListNode next;
	
	public ListNode(int valIn) {
		this.value = valIn;
	}
	
}
public class MergeLinkedLists {

	public static void mergeLists(ListNode list1,ListNode list2) {
		
		ListNode list1Head = list1;;
		ListNode list2Head = list2;
		ListNode mergedList=new ListNode(-1);
		ListNode resultList = mergedList;
		while(list1Head!=null && list2Head!=null) {
			
			if(list1Head.value<=list2Head.value) {
				System.out.println("advance list 1 as "+list1Head.value+" is smaller");
				mergedList.next = new ListNode(list1Head.value);
				list1Head = list1Head.next;
				
			}
			else {
				System.out.println("advance list 2 as "+list2Head.value+" is smaller");
				mergedList.next = new ListNode(list2Head.value);
				list2Head = list2Head.next;
			
			}
			mergedList = mergedList.next;
		}
		
		while(list1Head!=null) {
			mergedList.next = new ListNode(list1Head.value);
			list1Head = list1Head.next;
			mergedList = mergedList.next;
		}
		while(list2Head!=null) {
			mergedList.next = new ListNode(list2Head.value);
			list2Head = list2Head.next;
			mergedList = mergedList.next;
		}		
		
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
		mergeLists(evenListHead, oddListHead);
	}

}
