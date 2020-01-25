package Dec2019;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class TreeNode {
	public  int val;
	public TreeNode(int val) {
		this.val = val;
	}
	public TreeNode left;
	public TreeNode right;
}

class NodeDepth {
	public TreeNode node;
	public int depth;
	public NodeDepth(TreeNode node,int depth) {
		this.node = node;
		this.depth = depth;
	}
}

public class BalancedTree {

	
	public boolean isBalanced(TreeNode root) {
		
		if(root==null) {
			return true;
		}
		
		Deque<NodeDepth> nodeQueue = new ArrayDeque<NodeDepth>();
		List <Integer> depths = new ArrayList<Integer>();
		
		nodeQueue.add(new NodeDepth(root, 0));
		
		while(!nodeQueue.isEmpty()) {
			NodeDepth front = nodeQueue.pop();
			Integer curDepth = front.depth;
			if(front.node.left==null && front.node.right==null) {
				if(!depths.contains(curDepth)) {
					depths.add(curDepth);
				}
				
				if(depths.size()>2) {
					return false;
				}
				
			}
			else {
				if(front.node.left!=null) {
					nodeQueue.add(new NodeDepth(front.node.left, curDepth+1));
				}
				if(front.node.right!=null) {
					nodeQueue.add(new NodeDepth(front.node.right, curDepth+1));
				}				
			}
		}
		return true;
	}
	
	
	
	public static void main(String g[]) {
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
	    right.left = seven;
	    right.right = nine;
	    left.left = four;
	    four.left=five;
	    four.right = six;
		
		BalancedTree btree = new BalancedTree();
		btree.isBalanced(root);
		
	}
}
