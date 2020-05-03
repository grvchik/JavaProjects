package Mar2020;

import java.util.Deque;
import java.util.LinkedList;

class TreeNode {
	
	public int value;
	public TreeNode left;
	public TreeNode right;
	
	TreeNode(int val) {
		this.value = val;
	}
}

class NodeDepth {
	
	TreeNode root;
	int depth;

	NodeDepth(TreeNode rootIn,int depthIn) {
		this.root = rootIn;
		this.depth = depthIn;		
	}
}

public class DeepestNodeOfTree {

	public static TreeNode getDeepestNode(TreeNode root) {
		Deque<NodeDepth> stack = new LinkedList<NodeDepth>();
		NodeDepth nd = new NodeDepth(root, 1);
		
		stack.push(nd);
		int depthMax = Integer.MIN_VALUE;
		TreeNode maxDepthNode = null;
		while(!stack.isEmpty()) {
			
			NodeDepth top = stack.pop();
			int newDepth = top.depth;
			if(top.root.left!=null) {				
				NodeDepth left = new NodeDepth(top.root.left, newDepth+1);			
				stack.push(left);
			}

			if(top.root.right!=null) {				
				NodeDepth right = new NodeDepth(top.root.right, newDepth+1);				
				stack.push(right);
			}
			
			
			if(newDepth > depthMax) {
			 maxDepthNode = top.root;
			 depthMax = newDepth;			 
			}
			
			
		}
		
		return maxDepthNode;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		TreeNode four = new TreeNode(4);
		TreeNode three = new TreeNode(3);
		TreeNode two = new TreeNode(2);
		TreeNode one = new TreeNode(1);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		
		root.left = four;
		four.left=three;
		three.left =two;
		two.left = one;
		root.right = six;
		six.right = seven;
		
		TreeNode deep = getDeepestNode(root);
		System.out.println(deep);
		
	}

}
