package Dec2019;

import java.util.Deque;
import java.util.LinkedList;

public class LowestCommonAncestor {

	
	
	
	
	public static Deque<TreeNode> getPathtoNode(TreeNode root,TreeNode target) {
		if(root==null) {
			return null;
		}
		
		if(root.val==target.val && root.left==null && root.right==null) {
			
			Deque<TreeNode> stack = new LinkedList<TreeNode>();
			stack.push(target);
			return stack;
		}
		
		Deque<TreeNode> lefStack = getPathtoNode(root.left, target);
		if(lefStack!=null && lefStack.size()>0) {
			lefStack.push(root);
		}
		
		Deque<TreeNode> rightStack = getPathtoNode(root.right, target);
		if(rightStack!=null && rightStack.size()>0) {
			rightStack.push(root);
		}	
		
		if(lefStack==null && rightStack!=null) {
			return rightStack;
		}
		if(rightStack==null && lefStack!=null) {
			return lefStack;
		}		
		
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode three = new TreeNode(3);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		root.right = three;
		three.left = six;
		three.right = seven;
		
		Deque<TreeNode> leftPath = getPathtoNode(root, seven);
		Deque<TreeNode> leftPath2 = getPathtoNode(root, six);	
		
		System.out.println(leftPath);
		System.out.println(leftPath2);
		
	}

}
