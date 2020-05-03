package April2020;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrder {

	
	public static void printTreeInOrder(TreeNode root) {
		Queue<TreeNode> treeQueue = new LinkedList<TreeNode>();
		treeQueue.add(root);
		
		while(!treeQueue.isEmpty()) {
		 TreeNode front = treeQueue.poll();
		 System.out.print(front.value);
		 if(front.left!=null) {
			 treeQueue.add(front.left);	 
		 }
		 
		 if(front.right!=null) {
			 treeQueue.add(front.right);	 
		 }
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		root.left = two;
		root.right = three;
		two.left = four;
		two.right = six;
	
		printTreeInOrder(root);
	}

}
