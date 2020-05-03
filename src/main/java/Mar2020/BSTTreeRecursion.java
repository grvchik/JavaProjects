package Mar2020;

public class BSTTreeRecursion {

	public static boolean isValidBST(TreeNode root) {
		
		int lowerBound = Integer.MIN_VALUE;
		int upperBound = Integer.MAX_VALUE;
	
		return isValidBSTree(root,lowerBound,upperBound);
		
	}
	
	
	public static boolean isValidBSTree(TreeNode root,int lowerBound,int upperBound) {
		
		if(root==null ) {
			return true;
		}
		
		
		if(root!=null && root.value==4) {
			System.out.println("mil gaya");
		}
		
		if(root.value<lowerBound || root.value>upperBound) {
			return false;			
		}
	
		boolean leftResult = isValidBSTree(root.left, lowerBound, root.value);
		boolean rightResult = isValidBSTree(root.right,  root.value+1,upperBound);
		
		return leftResult && rightResult;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		TreeNode three = new TreeNode(3);
		TreeNode two = new TreeNode(2);
		TreeNode four = new TreeNode(4);
		root.left = four;
		four.left = two;
		four.right = three;
		isValidBST(root);
	}

}
