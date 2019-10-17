package Oct2019;
class Node {
	int val;
	Node next;
	public Node(int valIn) {
		val = valIn;
	}
}

public class LinkedListKthElement {

	
	public Node getFirstPart(Node list) {
		
		 if (list == null) return null;
		    Node runner = list.next;
		    Node ret = new Node(list.val);
		    Node toRet = ret;
		    while (runner != null) {
		    	 ret.next = new Node(runner.val);
		        runner = runner.next;
		        if (runner == null) break;
		      
		        ret = ret.next;
		        runner = runner.next;
		        list = list.next;
		    }

		 
		    return toRet;
	}
	
	public Node getKthFromEnd(Node root,int n) {
		
		Node temp = root;
		
		int size = getSize(temp);
		
		Node sentil = root;
		
		int locationFronFront = size-n;
		int counter = 0;
		
		while(sentil!=null) {
			sentil = sentil.next;
			++counter;
			if(counter==locationFronFront) {
				break;
			}
		}
		
		//System.out.println(root);
		
		return sentil;
	}
	
	
	public int getSize(Node node) {
		Node current = node;
		
		if(node==null) {
			return 0;
		}
	
		int size = 0;;
		while(current!=null) {
			++size;
			current = current.next;
		}
		return size;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		Node next = new Node(2);
		Node three = new Node(3);	
		root.next = next;
		next.next = three;
		LinkedListKthElement kthElement = new LinkedListKthElement();
		Node remp = kthElement.getKthFromEnd(root,1);
		System.out.println(remp);
		Node n = kthElement.getFirstPart(root);
		System.out.println(n);
	}

}
