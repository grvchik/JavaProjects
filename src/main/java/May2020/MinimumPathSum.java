package May2020;

public class MinimumPathSum {

	public static int getMinimumPathSum(TreeNode root, int minimumValue) {
		// if null is passed then there is no sum base case
		if(root==null) {
			return 0;
		}
		// if it is a leaf
		if(root.left==null && root.right==null) {
			return root.valueIn;
		}
		
		if(root.valueIn==1) {
			System.out.println("stop here");
		}
		int leftSum = getMinimumPathSum(root.left, minimumValue) + root.valueIn;
		
		int rightSum = getMinimumPathSum(root.right, minimumValue) + root.valueIn;
		
		minimumValue = Math.min(minimumValue, leftSum);
		minimumValue = Math.min(minimumValue, rightSum);
		return minimumValue;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		TreeNode fiveleft = new TreeNode(5);
		TreeNode fiveRight = new TreeNode(5);	
		TreeNode oneRight = new TreeNode(1);	
		TreeNode oneLeft = new TreeNode(-1);	
		TreeNode two = new TreeNode(2);
		TreeNode minustwo = new TreeNode(-2);
		root.left = fiveleft;
		root.right = fiveRight;
		fiveleft.right = two;
		fiveRight.right = oneRight;
		oneRight.left = oneLeft;
		oneRight.right = minustwo;
		int minimumSum = getMinimumPathSum(root, Integer.MAX_VALUE);
		System.out.println(minimumSum);
		
	}

}
