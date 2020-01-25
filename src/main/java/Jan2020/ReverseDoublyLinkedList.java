package Jan2020;



 
 



class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;
    
    DoublyLinkedListNode(int data) {
    	this.data = data;
    }
}
public class ReverseDoublyLinkedList {

	static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

	    DoublyLinkedListNode reverse = null;
	    DoublyLinkedListNode lastNode = null;

	    if (head==null) {
	        return null;
	    }

	    while(head!=null) {

	        reverse = new DoublyLinkedListNode(head.data);
	        
	        if(lastNode!=null) {
	            reverse.next = lastNode;
	            lastNode.prev = reverse;
	        }
	        lastNode = reverse;
	        head = head.next;
	    }
	    return reverse;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListNode one = new DoublyLinkedListNode(1);
		DoublyLinkedListNode two = new DoublyLinkedListNode(2);
		DoublyLinkedListNode three = new DoublyLinkedListNode(3);
		DoublyLinkedListNode four = new DoublyLinkedListNode(4);
		one.next=two;
		two.prev=one;
		two.next=three;
		three.prev=two;
		reverse(one);
	}

}
