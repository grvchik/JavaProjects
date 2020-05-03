package April2020;


public class BlanacedTree {

	public static boolean isBalanced(TreeNode root) {
		
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		
		double difference = leftHeight-rightHeight;
		if(Math.abs(difference)>1) {
			return false;			
		}
		return true;
	}
	
	public static int getHeight(TreeNode root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null) {
			return 1;
		}
		
		int leftHeight = getHeight(root.left)+1;
		int rightHeight = getHeight(root.right)+1;
		
		return Math.max(leftHeight, rightHeight);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		one.left=two;
	//	one.right = three;
		two.left=four;
		two.right = five;
	//	three.left = six;
		boolean res = isBalanced(one);
		System.out.println(res);
	}

}
