package Oct2019;

import java.util.Deque;
import java.util.LinkedList;

public class InOrderTraversal {

	public static void printInOrderUsingStack(TreeNode root) {
	
		Deque<TreeNode> inOrderStack = new LinkedList<TreeNode>();
		pishLeftNodesIntoStack(root,inOrderStack);
		while(!inOrderStack.isEmpty()) {
			TreeNode top = inOrderStack.pop();
			System.out.println(top.val);
			if(top.right!=null) {
				pishLeftNodesIntoStack(top.right,inOrderStack);
			}
		}
		
		
	}	
	
	
	public static void pishLeftNodesIntoStack(TreeNode node,Deque<TreeNode> inOrderStack) {
		inOrderStack.push(node);
		if(node.left==null) {
			pishLeftNodesIntoStack(node.left,inOrderStack);				
		}
		return;	
	}
	
	
	public static void printPostOrder(TreeNode root) {
		if(root==null && root==null) {
		
			return;
		}
		
		printPostOrder(root.left);		
		printPostOrder(root.right);
		System.out.println(root.val);
	}	
	
	public static void printPreOrder(TreeNode root) {
		if(root==null) {
			
			return;
		}
		System.out.println(root.val);
		printPreOrder(root.left);		
		printPreOrder(root.right);
		
	}
	
	public static void printInOrder(TreeNode root) {
		if(root.left==null && root.right==null) {
			System.out.println(root.val);
			return;
		}
		
		printInOrder(root.left);
		System.out.println(root.val);
		printInOrder(root.right);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(7);
		TreeNode leftleft = new TreeNode(1);
		TreeNode leftright = new TreeNode(3);
		TreeNode rightleft = new TreeNode(6);
		TreeNode rightright = new TreeNode(8);
		root.left = left;
		root.right = right;
		left.left = leftleft;
		left.right = leftright;
		right.left = rightleft;
		right.right = rightright;
		//printInOrder(root);
		//printPreOrder(root);
		printPostOrder(root); 
	}

}
