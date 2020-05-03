package April2020;

public class MinPathSum {

	public static int findMinimumSum(TreeNode root) {
		// base case
		if(root==null) {
			return 0;
		}
		
		if(root.left==null && root.right==null)  {
			return root.value;
		}
		
		int leftSum = root.value+findMinimumSum(root.left);
		int rightSum = root.value+findMinimumSum(root.right);
		
		return Math.min(leftSum, rightSum);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode ten = new TreeNode(10);
		TreeNode five1 = new TreeNode(5);
		TreeNode five2 = new TreeNode(5);
		TreeNode two = new TreeNode(2);
		TreeNode one = new TreeNode(1);
		TreeNode minusOne = new TreeNode(-4);
		ten.left = five1;
		ten.right=five2;
		five1.right = two;
		five2.right = one;
		one.left = minusOne;
		int minSum = findMinimumSum(ten);
		System.out.println(minSum);
	}

}
