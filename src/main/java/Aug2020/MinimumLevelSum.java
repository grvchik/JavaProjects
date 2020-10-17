package Aug2020;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class TreeNode{
	public int valueIn;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int value) {
		this.valueIn = value;
	}
}

class LevelContainer {
	
	public 	int level;
     public TreeNode root;	
	
	public LevelContainer(int level,TreeNode root) {
		this.level = level;
		this.root = root;
	}
}

public class MinimumLevelSum {

	public static int getMinimumLevelSum(TreeNode root) {
		
		Map<Integer,Integer> levelSum = new HashMap<Integer,Integer>();
		Queue<LevelContainer> lsQueue = new LinkedList<LevelContainer>();
		
		LevelContainer lstop = new LevelContainer(0, root);
		lsQueue.add(lstop);
		int prevLevel = 0;
		while(!lsQueue.isEmpty()) {
			LevelContainer lsCurrent = lsQueue.poll();
			int currLevel = lsCurrent.level;
			TreeNode curnode = lsCurrent.root;
			
				Integer existingSum = levelSum.get(currLevel);
				if(existingSum==null) {
					levelSum.put(currLevel, lsCurrent.root.valueIn);
				}
				else {
					levelSum.put(currLevel, existingSum+ lsCurrent.root.valueIn);
				}
		
			
			if(curnode.left!=null) {
				LevelContainer lsLeft = new LevelContainer(currLevel+1, curnode.left);
				lsQueue.add(lsLeft);
			}
			if(curnode.right!=null) {
				LevelContainer lsRight = new LevelContainer(currLevel+1, curnode.right);
				lsQueue.add(lsRight);
			}	
			
		
				
		}
		
		int minSum = Integer.MAX_VALUE;
			
		for( Map.Entry<Integer, Integer> obj: levelSum.entrySet()) {
			int currSum = obj.getValue();
			minSum = Math.min(currSum, minSum);
		}
		return minSum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(8);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
	
		root.left = two;
		root.right = three;
		three.left = four;
		three.right = five;
		int minSum = getMinimumLevelSum(root);
		System.out.println(minSum);
	}

}
