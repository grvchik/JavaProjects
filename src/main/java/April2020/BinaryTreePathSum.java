package April2020;

public class BinaryTreePathSum {

	public static int countPathsFromNode(TreeNode root,int targetSum) {
		if(root==null) {
			return 0;
		}
		int totalPathsFromNode = countPathsFromNode(root, 0, targetSum);
	    int leftPath = countPathsFromNode(root.left, targetSum);
	    int rightPath = countPathsFromNode(root.right, targetSum);
		if(totalPathsFromNode>=0) {
			return totalPathsFromNode+1+leftPath+rightPath;
		}
		return -1;
	}
	
	
	public static int countPathsFromNode(TreeNode root, int runnSum, int targetSum) {
		if(root==null){
			return -1;
		}
		
		if(runnSum==targetSum) {
			return 0;
		}
		
		if(root.left==null && root.right==null && runnSum!=targetSum) {
			return -1;
		}
		
		int leftSum = countPathsFromNode(root.left, runnSum+root.value, targetSum);
		int rightSum = countPathsFromNode(root.right, runnSum+root.value, targetSum);
		
		if(leftSum==0) {
			++leftSum;
		}
		
		if(rightSum==0) {
			++rightSum;
		}
		
		if(leftSum>=0 ||rightSum>=0) {
			return leftSum+rightSum;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode ten = new TreeNode(10);
		TreeNode minusthree = new TreeNode(-3);
		TreeNode eleven = new TreeNode(11);
		TreeNode five = new TreeNode(5);
		TreeNode two = new TreeNode(2);
		TreeNode one = new TreeNode(1);
		TreeNode threeone = new TreeNode(3);
		TreeNode threetwo = new TreeNode(3);
		TreeNode minustwo = new TreeNode(-2);
		ten.left = five;
		ten.right = minusthree;
		minusthree.right = eleven;
		five.right = two;
		two.right = one;
		five.left = threeone;
		threeone.left = threetwo;
		threeone.right = minustwo;
		int res = countPathsFromNode(ten, 22);
		System.out.println(res);
	}

}
