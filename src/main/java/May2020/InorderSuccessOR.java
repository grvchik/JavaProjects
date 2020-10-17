package May2020;

import java.util.LinkedList;
import java.util.Queue;

class NodeParent {
	
	public int parentValue;
	public int currentValue;
	
	public TreeNode left;
	public TreeNode right;
	
	public NodeParent(int value,int parentValue,TreeNode left,TreeNode right) {
		this.currentValue = value;
		this.parentValue = parentValue;
		this.left = left;
		this.right = right;
	}
}


public class InorderSuccessOR {

	public static int 	findInOrderParent(TreeNode root, int value) {
		
		NodeParent node = new NodeParent(root.valueIn,-1,root.left,root.right);
		
		Queue<NodeParent> nQueue = new LinkedList<NodeParent>();
		nQueue.add(node);
		while(!nQueue.isEmpty()) {
			NodeParent frontNode = nQueue.poll();
			//find left child
			if(frontNode.currentValue > value) {
				TreeNode left = frontNode.left;
				if(left!=null) {
					int parentValue = frontNode.currentValue;
					NodeParent leftNode = new NodeParent(left.valueIn,parentValue,left.left,left.right);
					nQueue.add(leftNode);
				}
			}
			else if(frontNode.currentValue < value) {
				TreeNode right = frontNode.right;
				if(right!=null) {
					int parentValue = frontNode.currentValue;
					NodeParent rightNode = new NodeParent(right.valueIn,parentValue,right.left,right.right);
					nQueue.add(rightNode);
				}		
			}
			else {
				return frontNode.parentValue;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		TreeNode five = new TreeNode(5);
		TreeNode thirty = new TreeNode(30);
		TreeNode twenty2 = new TreeNode(22);
		TreeNode thirty5 = new TreeNode(35);
		TreeNode twenty5 = new TreeNode(25);
		root.left = five;
		root.right = thirty;
		thirty.left = twenty2;
		twenty2.right = twenty5;
		thirty.right = thirty5;
		int parentVal = findInOrderParent(root, 25);
		System.out.println(parentVal);
	}

}
