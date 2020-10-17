package July2020;

import java.util.ArrayList;
import java.util.List;

public class MinPathSum {
  public static int minimum = Integer.MAX_VALUE;
	public static int findMinimumPath(TreeNode root,int sum) {
		
		if(root==null) {
			minimum = Math.min(minimum, sum);
			return minimum;
		}
		
		if(root.left==null && root.right==null) {
			minimum = Math.min(minimum, sum+root.valueIn);
			return minimum;
		}		
		return Math.min(findMinimumPath(root.left, sum+root.valueIn),findMinimumPath(root.right, sum+root.valueIn));
		
		
		
		
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(10);
		TreeNode left5 = new TreeNode(5);
		TreeNode right5 = new TreeNode(5);
		TreeNode two	 = new TreeNode(2);
		TreeNode one = new TreeNode(1);
		TreeNode minus1 = new TreeNode(-3);
		root.left = left5;
		root.right = right5;
		left5.right = two;
		right5.right = one;
		one.left = minus1;
		List<Integer> sumList = new ArrayList<Integer>();
		int res = findMinimumPath( root, 0);
		System.out.println(res);
		
	}

}
