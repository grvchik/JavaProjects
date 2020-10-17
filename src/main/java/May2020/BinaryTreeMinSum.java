package May2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class LevelSum {
	
	public TreeNode root;
	public int level;
	
	public LevelSum(int levelIn, TreeNode root) {
		this.level = levelIn;
		this.root = root;
	}
}




public class BinaryTreeMinSum {

	public static int findMinimumSum(TreeNode root) {
		int minimumSum = Integer.MAX_VALUE;
		List<TreeNode> childList = new ArrayList<TreeNode>();
	
		
		
		
		Queue<LevelSum> queueSum = new LinkedList<LevelSum>();

		
		LevelSum  ls = new LevelSum(1, root);
		
		queueSum.add(ls);
		int lastlevel = 1;
		int sum = 0;
		while(!queueSum.isEmpty()) {
			LevelSum top = queueSum.poll();
			if(top.level==lastlevel) {
				sum = sum+top.root.valueIn;
				minimumSum = Math.min(minimumSum, sum);
			}
			
			int newlevel = top.level+1;
			
			if(top.root.left!=null) {
				LevelSum newLeft = new LevelSum(newlevel, top.root.left); 
				lastlevel = newlevel;
				sum = 0;
				queueSum.add(newLeft);
			}
			
			if(top.root.right!=null) {
				LevelSum newRight = new LevelSum(newlevel, top.root.right); 
				lastlevel = newlevel;
				sum = 0;
				queueSum.add(newRight);
			}
			
		}
	
		return minimumSum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);	
		root.left = two;
		root.right = three;
		three.left = four;
		three.right = five;
		int minSum = findMinimumSum(root);
		System.out.println(minSum);
	}

}
