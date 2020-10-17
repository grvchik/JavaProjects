package Oct2020;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	TreeNode root;
	
	int MIN_VALUE;
	int MAX_VALUE;
	
	public Node(TreeNode root, int min,int max) {
		this.root = root;
		this.MIN_VALUE = min;
		this.MAX_VALUE = max;
	}
	
}




public class BinarySearchTreeIteration {

	
	public static boolean isBinarySearchTree(TreeNode root) {
		
		if(root==null) return false;
		
		if(root.left==null && root.right==null) return true;
		
		
		Node bstNode = new Node(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
	
		Queue<Node> popQ = new LinkedList<Node>();
		popQ.add(bstNode);
		
		
		while(!popQ.isEmpty()) {
			Node top = popQ.poll();
			int maxPossibleValue = top.MAX_VALUE;
			int minPossibleValue = top.MIN_VALUE;
			TreeNode current = top.root;
			
			if(current.right!=null) {
				
				if(current.right.valueIn <minPossibleValue || current.right.valueIn<current.valueIn) {
					return false;
				}
				else {
				
					Node newNode = new Node(current.right, current.valueIn, Integer.MAX_VALUE);
					popQ.add(newNode);
				}
			}
			
			if(current.left!=null) {
				
				if(current.left.valueIn >maxPossibleValue || current.left.valueIn >current.valueIn) {
					return false;
				}
				else {
					Node newNode = new Node(current.left, Integer.MIN_VALUE, current.valueIn);
					popQ.add(newNode);
				}
			}
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(8);
		TreeNode six = new TreeNode(6);	
		TreeNode seven = new TreeNode(7);	
		TreeNode nine = new TreeNode(9);	
		TreeNode ten = new TreeNode(10);	
		TreeNode eleven = new TreeNode(9);	
		TreeNode twelve = new TreeNode(12);	
		root.left = seven;
		seven.left = six;
		seven.right = nine;
		root.right = ten;
		ten.left=eleven;
		ten.right = twelve;
		boolean res = isBinarySearchTree(root);
		System.out.println(res);
	}

}
