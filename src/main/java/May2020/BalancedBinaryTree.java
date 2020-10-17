package May2020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



class TreeHeight {
	public TreeNode node;

	public int depth;
	public TreeHeight(TreeNode nodeIn,int depthIn) {
		this.depth = depthIn;
		this.node = nodeIn;
	}
}
public class BalancedBinaryTree {

	public static boolean isValidBinaryTree(TreeNode root) {
		List<Integer> depths = new ArrayList<>();
		if(root==null) {
			return false;
		}
		
		if(root.left==null && root.right==null) {
			return true;
		}
		Queue<TreeHeight> treeQ = new LinkedList<TreeHeight>();
		TreeHeight th = new TreeHeight(root,0);
	
	
		treeQ.add(th);
		while(!treeQ.isEmpty()) {
			TreeHeight thtop  = treeQ.poll();
			
			if(depths.size()>3) {
				return false;
			}
			if(!depths.contains(thtop.depth)) {
				depths.add(thtop.depth);
			}
			if(thtop.node.left!=null) {
				TreeHeight thleft = new TreeHeight(thtop.node.left,thtop.depth+1);
				treeQ.add(thleft);
			}
			if(thtop.node.right!=null) {
				TreeHeight thright = new TreeHeight(thtop.node.right,thtop.depth+1);
				treeQ.add(thright);
			}			
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(8);
		TreeNode seven = new TreeNode(7);
		TreeNode nine = new TreeNode(9);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
	    root.left = left;
	    root.right = right;
//	    right.left = seven;
//	    right.right = nine;
//	    left.left = four;
//	    four.left=five;
//	    four.right = six;
	    boolean res = isValidBinaryTree(root);
	    System.out.println(res);
	}

}
