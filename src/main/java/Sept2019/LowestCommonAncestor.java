package Sept2019;

import java.util.Deque;
import java.util.LinkedList;


public class LowestCommonAncestor {

	public static TreeNode getLCA(TreeNode root,int val1,int val2) {
		
		Deque<TreeNode> stack1 = getPathToNode(root, val1);
		
		Deque<TreeNode> stack2 = getPathToNode(root, val2);
		TreeNode lca = null;
		if(stack1.size()<=stack2.size()) {
			while(!stack1.isEmpty()) {
				lca = stack1.pop();
			}
		}
		else {
			while(!stack2.isEmpty()) {
				lca = stack2.pop();
			}
			
		}
		
		
		return lca;
	}
	
	
	public static Deque<TreeNode> getPathToNode(TreeNode root,int val) {
		
		if(root==null) {
			return null;
		}
		
		if(root.val == val) {
			Deque<TreeNode> stack = new LinkedList<TreeNode>();
			stack.push(root);
			return stack;
		}
		
		
		if(root.left!=null) {
			 Deque<TreeNode> leftStack = getPathToNode(root.left, val);
			 if(leftStack!=null && !leftStack.isEmpty()) {
				 leftStack.push(root);
			 }
			 if(leftStack==null || leftStack.isEmpty()) {
				 leftStack = getPathToNode(root.right, val);
				 if(leftStack!=null && !leftStack.isEmpty()) {
					 leftStack.push(root);
				 }
				 return leftStack;
			 }
			 else {
				 return leftStack;	 
			 }
			 
			
		}
		else if(root.right!=null) {
		 Deque<TreeNode> rightStack = getPathToNode(root.right, val);
		 if(rightStack!=null && !rightStack.isEmpty()) {
			 rightStack.push(root);
		 }
		 
			 if(rightStack==null || rightStack.isEmpty()) {
				 rightStack = getPathToNode(root.left, val);
				 if(rightStack!=null && !rightStack.isEmpty()) {
					 rightStack.push(root);
				 }
				 return rightStack;
			 }
			 else {
				 return rightStack;	 
			 }
		 
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(5);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(6);
		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		node4.left = node5;
		node3.right=node6;
		TreeNode root = getLCA(node1, 3, 4);
		System.out.println(root);
	}

}
