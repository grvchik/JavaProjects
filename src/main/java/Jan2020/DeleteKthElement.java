package Jan2020;

public class DeleteKthElement {

	public ListNode deleteKthNode(ListNode node,int k) {
		
		ListNode sentil = new ListNode(-1);
		
		sentil.next = node;

		if(k==1) {
			return node.next;
		}
		sentil.next = node;
		int count=1;
		while(node!=null) {
			ListNode prev = node;
			node = node.next;
			++count;
			if(count==k) {
				prev.next = node.next;
				node = prev;	
				break;
			}
		}
		
		return sentil.next;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode nodeOne = new ListNode(1);
		ListNode nodeTwo = new ListNode(2);
		ListNode nodeThree = new ListNode(3);
		nodeOne.next = nodeTwo;
		nodeTwo.next = nodeThree;
		DeleteKthElement delK = new DeleteKthElement();
		ListNode node = delK.deleteKthNode(nodeOne, 3);
		System.out.println("node"+node);
	}

}
