package Oct2020;

class LinkedList {
	public int value;
	public LinkedList next;
	public LinkedList(int val) {
		this.value = val;
	}
}

public class LinkedListImplementation {
	LinkedList head;
	LinkedList tail;

	
	public LinkedListImplementation() {
		this.head=null;
		this.tail=null;
	}
	

	
	public void append(int value) {
		LinkedList newNode = new LinkedList(value);
		if(this.head==null) {
			this.head = newNode;
			this.tail = newNode;
		}
		else {
			this.tail.next = newNode;
			this.tail = this.tail.next;
			
		}
		System.out.println("done");
	}
	
	
	public void prepend(int value) {
		LinkedList newNode = new LinkedList(value);
		if(head==null) {
			head = newNode;
		}
		else {
			newNode.next = this.head;
			this.head = newNode;
		}
		if(this.tail==null) {
			this.tail = newNode;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImplementation limpl = new LinkedListImplementation();
		limpl.append(1);
		limpl.append(2);
		limpl.append(3);
		limpl.prepend(4);
		limpl.prepend(5);
		limpl.prepend(6);
		
	}

}
