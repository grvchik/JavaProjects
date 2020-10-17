package June2020;

import java.util.Deque;
import java.util.LinkedList;

class NodeBounds {
	public TreeNode root;
	public int minValue;
	public int maxValue;
	
	public NodeBounds(TreeNode node, int minValue,int maxValue) {
		this.root = node;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}
}

public class BinsrySearchTreeIteration {

	
	public static boolean isBinarySearchTree(TreeNode root)  {
		
		if(root==null) {
			return true;
		}
		
		if(root.left==null && root.right==null ) {
			return true;
		}
		NodeBounds nb = new NodeBounds(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
		Deque<NodeBounds> stack = new LinkedList<NodeBounds>();
		stack.push(nb);
		
		
		while(stack.isEmpty()) {
			NodeBounds topElement = 	stack.pop();
			int minValue = topElement.minValue;
			int maxValue = topElement.maxValue;
			
			if(topElement.root.left!=null ) {
				if(topElement.root.left.valueIn >minValue) {
					return false;
				}
				else {
					NodeBounds leftnb = new NodeBounds(root.left, minValue,root.left.valueIn);
					stack.push(leftnb);
				}
			}
			if(topElement.root.right!=null ) {
				if(topElement.root.right.valueIn <maxValue) {
					return false;
				}
				else {
					NodeBounds rightnb = new NodeBounds(root.right, root.right.valueIn,maxValue);
					stack.push(rightnb);
				}
			}			
		}	
		
		return true;
	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
