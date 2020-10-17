package May2020;

public class BinarySearchTree {

	public static boolean isBST(TreeNode root) {
		
		return isBSTWithMinMax(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
	}
	
	public static boolean isBSTWithMinMax(TreeNode root,int lowerBound, int upperBound) {
		
		if(root==null) {
			return true;
		}
		
		if(root.left==null && root.right==null) {
			if(root.valueIn>=lowerBound && root.valueIn<=upperBound) {
				return true;
			}
			else {
				return false;
			}
		}
       
		boolean left = isBSTWithMinMax(root.left, lowerBound, root.valueIn);
		boolean right = isBSTWithMinMax(root.right, root.valueIn,upperBound);

		return left && right;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		TreeNode three = new TreeNode(2);
		TreeNode five = new TreeNode(5);
		root.left = three;
		root.right = five;
		boolean res = isBST(root);
		System.out.println(res);
	}

}
