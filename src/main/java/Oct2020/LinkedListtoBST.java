package Oct2020;



public class LinkedListtoBST {


	public static TreeNode createBinaryTree(LinkedList node) {
		int length = length(node);
		TreeNode root = createBinaryTree(node,0,length);
		return root;
	}
	

	public static TreeNode createBinaryTree(LinkedList node,int beg,int end) {
		if(beg>=end) {
			return null;
		}
		
		int mid = (beg+end)/2;
		
		int value = getValueAt(node,mid);
		TreeNode root = new TreeNode(value);
		root.left = createBinaryTree(node,0,mid-1);
		root.right = createBinaryTree(node,mid+1,end);
		
		return root;
		
	}

	
	public static int getValueAt(LinkedList node,int index) {
		
		LinkedList temp = node;
		int counter=0;
		while(temp!=null) {
			if(counter==index) {
				return temp.value;
			}
			++counter;
			temp  =temp.next;
		}
		return -1;
	}
	

	public static int length(LinkedList node) {
		
		LinkedList temp = node;
		int counter=0;
		while(temp!=null) {
		
			++counter;
			temp  =temp.next;
		}
		return counter;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-9,2,3,4,5,6};
		LinkedList l1 = new LinkedList(-9);
		LinkedList l2 = new LinkedList(2);
		LinkedList l3 = new LinkedList(3);
		LinkedList l4 = new LinkedList(4);
		LinkedList l5 = new LinkedList(5);
		LinkedList l6 = new LinkedList(6);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		
		TreeNode root = createBinaryTree(l1);
		System.out.println(root);
	}

}
