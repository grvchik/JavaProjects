package Feb2020;
class ListNode {
	public int val;
	public ListNode next;
	ListNode(int value) {
		this.val = value;
	}
}
public class MergeLinkedLists {

	
	static ListNode mergeRecursion(ListNode n1,ListNode n2) {
		ListNode temp=null;
		if(n1==null) {
			return n2;
		}
		
		if(n2==null) {
			return n1;
		}
		
		if(n1.val<n2.val) {
			temp = new ListNode(n1.val);
			temp.next = mergeRecursion(n1.next, n2);
		}
		else {
			temp = new ListNode(n2.val);
			temp.next = mergeRecursion(n2.next, n2);
			
		}
		return temp;
	}
	
	static void mergeLists(ListNode n1,ListNode n2) {
		ListNode sentil = new ListNode(-1);
		ListNode temp = null;
		
		while(n1!=null && n2!=null) {
			
			if(n1.val<n2.val) {
				if(temp==null) {
					temp = new ListNode(n1.val);
					sentil = temp;
				}
				else {
					temp.next = new ListNode(n1.val);
					temp = temp.next;
				}
				n1 = n1.next;
			}
			
			else {
				if(temp==null) {
					temp = new ListNode(n2.val);
					sentil = temp;
				}
				else {
					temp.next = new ListNode(n2.val);
					temp = temp.next;
				}				
				n2 = n2.next;
			}			
		}
		
		
		if(n1==null) {
			temp.next = n2;
		}
		else {
			temp.next = n1;
		}
		System.out.println(sentil);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list1 = new ListNode(2);
		ListNode list13 = new ListNode(3);
		ListNode list14 = new ListNode(4);
		list1.next = list13;
		list13.next = list14;
		
		ListNode list2 = new ListNode(1);
		ListNode list25 = new ListNode(5);
		list2.next = list25;
	//	mergeLists(list1,list2);
		mergeRecursion(list1,list2);
	}

}
