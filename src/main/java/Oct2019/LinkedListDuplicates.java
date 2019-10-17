package Oct2019;

import java.util.HashSet;
import java.util.Set;

public class LinkedListDuplicates {
	public Node removeDuplicates(Node list) {
		
		Node worker =  new Node(list.val);
		Node retNode = worker;
		Set<Integer> dupSet =  new HashSet<Integer>();
		dupSet.add(list.val);
		while(list!=null) {
			list = list.next;
			if(list!=null && !dupSet.contains(list.val)) {
				worker.next = new Node(list.val);
				worker = worker.next;
				dupSet.add(list.val);
			}			
		}// while
		return retNode;
	}
	
	public static void main(String[] args) {
		
		Node one = new Node(1);
		Node two = new Node(1);
		Node three = new Node(2);
		Node four = new Node(2);
		one.next = two;
		two.next = three;
		three.next = four;
		LinkedListDuplicates ldup = new LinkedListDuplicates();
		Node res = ldup.removeDuplicates(one);
		System.out.println(res);
	}
}
