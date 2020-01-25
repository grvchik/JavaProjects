package Oct2019;

public class LinkedLIstCycle {


public boolean hasCycle(Node node) {

	Node slow = node;
	Node fast = node;

   while(slow!=null && fast.next!=null) {
 
         slow = slow.next;       
         fast = fast.next.next;
         	
         
     	if(fast.val==slow.val) {
     	   return true;
          }         
    }

  return false;

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		first.next = second;
		second.next = third;
		third.next = first;
		LinkedLIstCycle lCycle = new LinkedLIstCycle();
		System.out.println(lCycle.hasCycle(first));
		
	}

}
