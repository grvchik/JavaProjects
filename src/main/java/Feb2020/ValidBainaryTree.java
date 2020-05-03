package Feb2020;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

class NodeDepth {
	TreeNode root;
	int lowerbound;
	int upperbound;
	
	NodeDepth(TreeNode root, int minValue,int maxValue) {
		this.root = root;
		this.lowerbound = minValue;
		this.upperbound = maxValue;
	}
}

 

public class ValidBainaryTree {

	public static boolean isValidBainarySearchTree(TreeNode root) {
		
		if(root==null || (root.left==null && root.right==null)) {
			return true;
		}
		
		Deque <NodeDepth> st = new LinkedList<NodeDepth>();
		NodeDepth nd = new NodeDepth(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		st.push(nd);
		while(!st.isEmpty()) {
			NodeDepth top = st.pop();
			int lowerBound = top.lowerbound;
			int upperbound = top.upperbound;
			
			
			TreeNode left = top.root.left;
			TreeNode right = top.root.right;
			
			if(top.root.val<=lowerBound || top.root.val>= upperbound) {
				return false;
			}
			
			if(left!=null) {
				NodeDepth ndleft = new NodeDepth(left, lowerBound, top.root.val);
				st.push(ndleft);
			}
			if(right!=null) {
				NodeDepth ndRight = new NodeDepth(right, top.root.val,upperbound);
				st.push(ndRight);
			}
					
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(8);
		TreeNode five = new TreeNode(5);
		TreeNode four = new TreeNode(4);
		TreeNode six = new TreeNode(9);
		TreeNode eleven = new TreeNode(11);
		TreeNode twelve = new TreeNode(12);
		root.left = five;
		five.left = four;
		five.right = six;
		root.right = twelve;
		twelve.left = eleven;
		boolean res = isValidBainarySearchTree(root);
		System.out.println(res);
		
	}

}
