package July2020;

import java.util.LinkedList;
import java.util.Queue;

class LevelSum {
	
	public TreeNode root;
	public int level;
	public LevelSum(TreeNode root,int level) {
		this.root = root;
		this.level = level;
	}
	
}

public class MinimumLevelSum {

	
	public static int findMinimumLevel(TreeNode root) {
		Queue<LevelSum> qlSum = new LinkedList<LevelSum>();
		
		LevelSum lsmain = new LevelSum(root, 0);
		qlSum.add(lsmain);
		int prevLevel = 0;
		int minSum = root.valueIn;
		while(!qlSum.isEmpty()) {
			LevelSum lsCurr = qlSum.poll();
			TreeNode currentNode = lsCurr.root;
			int currSum=0;
			int currLevel = lsCurr.level;
			if(currentNode.left!=null && currentNode.right==null) {
				currSum+=currentNode.left.valueIn;
				LevelSum lsLeft = new LevelSum(currentNode.left, currLevel+1);
				prevLevel = currLevel+1;
				qlSum.add(lsLeft);
			}
			else if(currentNode.left==null && currentNode.right!=null ) {
				currSum+=currentNode.right.valueIn;
				LevelSum lsRight = new LevelSum(currentNode.right, currLevel+1);
				prevLevel = currLevel+1;
				qlSum.add(lsRight);				
			}
			else if(currentNode.left!=null &&  currentNode.right!=null) {
				currSum+=currentNode.right.valueIn+currentNode.left.valueIn;
				LevelSum lsLeft = new LevelSum(currentNode.left, currLevel+1);
				LevelSum lsRight = new LevelSum(currentNode.right, currLevel+1);
				prevLevel = currLevel+1;
				qlSum.add(lsLeft);		
				qlSum.add(lsRight);		
			}
			else {
				if(currLevel==prevLevel) {
					currSum+= root.valueIn;
				}
	
				
			}
			minSum = Math.min(minSum, currSum);
		}
		return minSum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeNode root = new TreeNode(1);
			TreeNode two = new TreeNode(2);
			TreeNode three = new TreeNode(3);
			TreeNode four = new TreeNode(4);
			TreeNode five = new TreeNode(5);
			root.left = two;
			root.right  = three;
			three.left = four;
			three.right = five;
			
			int levellSum = findMinimumLevel(root);
			System.out.println(levellSum);
			
	}

}
