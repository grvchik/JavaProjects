package April2020;

import java.util.Deque;
import java.util.LinkedList;

class NodeVal {
	
	public TreeNode top;
	
	public int lowerBoundIn;
	public int upperBoundIn;
	
	public NodeVal(TreeNode root,int lowBound,int upBound) {
		this.top = root;
		this.lowerBoundIn = lowBound;
		this.upperBoundIn = upBound;
	}
}

public class BinarySearchTreeIteration {

	
	public static boolean isBindarySearchTree(TreeNode root) {
		
		Deque<NodeVal> stack = new LinkedList<NodeVal>();
		
		NodeVal rootNode = new NodeVal(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		stack.push(rootNode);
		
		while(!stack.isEmpty()) {
			NodeVal topNode = stack.pop();
			int lowerBound = topNode.lowerBoundIn;
			int upperBound = topNode.upperBoundIn;
			TreeNode topElement = topNode.top;
			if(topElement.value <= lowerBound || topElement.value>=upperBound) {
				return false;
			}
			
			if(topElement.left!=null) {
					NodeVal left = new NodeVal(topElement.left, lowerBound,topElement.value);	
					stack.push(left);
			}
			
			if(topElement.right!=null) {
				NodeVal left = new NodeVal(topElement.right, topElement.value,upperBound);	
				stack.push(left);
			}			
		}
		
		return true;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode six = new TreeNode(6);
		TreeNode two = new TreeNode(2);
		TreeNode seven = new TreeNode(7);
		TreeNode eight = new TreeNode(8);
		TreeNode one = new TreeNode(1);
		TreeNode three = new TreeNode(3);
		six.left = two;
		six.right = seven;
		two.left = one;
		two.right = three;
		seven.left = eight;
		boolean res = isBindarySearchTree(six);
		String amarin="aajhum";
		System.out.println(amarin.substring(0,200));
		System.out.println(res);
	}

}
