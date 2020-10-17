package Aug2020;

public class CountNoofPaths {

	public static int countPathWithSum(TreeNode root,int targetSum) {
		
		if(root==null) return 0;
		
		int pathsFrpmRoot = countPathWithSumsFromNode(root, targetSum, 0);
		int leftPath = countPathWithSumsFromNode(root.left, targetSum, 0);
		int rightPath = countPathWithSumsFromNode(root.right, targetSum, 0);
		
		return pathsFrpmRoot+leftPath+rightPath;
	}
	
	public static int countPathWithSumsFromNode(TreeNode root,int targetSum,int currentSum) {
		
		if(root==null) {
			return 0;
		}
		int totalPaths = 0;
		
		currentSum+=root.valueIn;
		if(currentSum==targetSum) {
			totalPaths++;
		}
		
		totalPaths += countPathWithSumsFromNode(root.left, targetSum, currentSum);
		totalPaths += countPathWithSumsFromNode(root.right, targetSum, currentSum);
		return totalPaths;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
