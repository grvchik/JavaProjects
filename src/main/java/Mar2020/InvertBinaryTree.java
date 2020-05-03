package Mar2020;

import java.util.Deque;
import java.util.LinkedList;

class Node {
	
	public int value;
	public Node left;
	public Node right;
	public Node(int valueIn) {
		this.value = valueIn;
	}
		
}
public class InvertBinaryTree {

	public static Node invertTree(Node root) {
		Deque<Node> cont = new LinkedList<Node>();
	
		if(root ==null || (root.left==null && root.right==null)) {
			return root;
		}
		
		cont.push(root);
		while(!cont.isEmpty()) {
			
			Node top = cont.pop();
			Node left = top.left;
			Node right = top.right;
			
			if(left!=null) {				
				if(right==null) {
					top.right = left;
					top.left = null;
				}
				else {
					Node temp = right;
					top.right = left;
					top.left = temp;
				}
				cont.push(left);
			}
			// left is null
			else {
				
				if(right!=null) {
					top.left = right;
					top.right = null;
					cont.push(left);
				}
				
			}
							
		}
		
		return root;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		
		root.left = three;
		root.right = four;
		three.left = five;
		
		/**                   2
		 *                   / \
		 *                       4
		 *                  /   
		 *                 3
		 *                / 
		 *               5 
		 * 
		 */
		
		Node inverted = invertTree(root);
	}

}
