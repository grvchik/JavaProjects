package April2020;

import java.util.LinkedList;
import java.util.Queue;

class LevelNode {
	
 public int levelIn;
 public TreeNode nodeIn;
 public LevelNode(int level ,TreeNode node) {
	 this.levelIn = level;
	 this.nodeIn = node;
 }
	
}

public class MinimumSumLevelTree {

	
	public static void printMinimumSum(TreeNode root) {
		
		Queue<LevelNode> nodeQueue = new LinkedList<LevelNode>();
		if(root==null) {
			return;
		}
		
		LevelNode lnode = new LevelNode(0, root);
		nodeQueue.add(lnode);
		int  prevLevel = 0;
		int minSum = Integer.MAX_VALUE;
		int currSum=0;
		while(!nodeQueue.isEmpty()) {			
			LevelNode node = 	nodeQueue.poll();
			int currLevel = node.levelIn;
			TreeNode currNode = node.nodeIn;
			if(currLevel==prevLevel) {
				currSum = currSum +currNode.value;
						
			}
			else {				
				currSum = node.nodeIn.value;
				prevLevel = currLevel;
			}
			minSum = Math.min(minSum, currSum);	
			
			if(currNode.left!=null) {
				LevelNode leftNode = new LevelNode(currLevel+1, currNode.left);
				nodeQueue.add(leftNode);
			}
			if(currNode.right!=null) {
				LevelNode rightNode = new LevelNode(currLevel+1, currNode.right);
				nodeQueue.add(rightNode);
			}							
		}	
		
		System.out.println(minSum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode six = new TreeNode(6);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		root.left = two;
		//two.left=six;
		root.right=three;
		three.left=four;
		three.right=five;
		printMinimumSum(root);
	}

}
