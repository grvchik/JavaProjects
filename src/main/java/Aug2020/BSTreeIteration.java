package Aug2020;

import java.util.Deque;
import java.util.LinkedList;

class NodeBounds {
	TreeNode root;
	int lower;
	int upper;
	
	public NodeBounds(TreeNode root,int lower,int higher) {
		this.root = root;
		this.lower = lower;
		this.upper = higher;
	}
	
}

public class BSTreeIteration {

	public static boolean isBinaryTree(TreeNode root,int lower,int upper) {
		
		NodeBounds nd = new NodeBounds(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		Deque<NodeBounds> ndStack = new LinkedList<NodeBounds>();
		ndStack.add(nd);
		
		while(ndStack.isEmpty()) {
			NodeBounds ndTop = ndStack.pop();
			int currValue = ndTop.root.valueIn;
			
			if(currValue<nd.lower || currValue >nd.upper) {
				return false;
			}
			
			if(nd.root.left!=null) {
				NodeBounds ndleft = new NodeBounds(nd.root.left, lower, nd.root.left.valueIn);
				ndStack.add(ndleft);
			}
			if(nd.root.right!=null) {
				NodeBounds ndRight = new NodeBounds(nd.root.right, nd.root.right.valueIn,upper );
				ndStack.add(ndRight);				
			}			
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		TreeNode three = new TreeNode(1);
		TreeNode three1 = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		root.left = three;
		root.right = four;
		four.left = three1;
		four.right = five;		// TODO Auto-generated method stub
		boolean res = isBinaryTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println(res);
	}

}
