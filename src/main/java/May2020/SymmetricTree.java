package May2020;

public class SymmetricTree {

	public static boolean isSymmetricTree(TreeNode left,TreeNode right) {
		
		if(left==null && right==null) {
			return true;
		}
		
		if(left==null && right!=null) {
			return false;
		}

		if(left!=null && right==null) {
			return false;
		}
		
		if(left.left!=null && right.right!=null) {
			if(left.left.valueIn==right.right.valueIn  &&   left.right.valueIn==right.left.valueIn) {
				isSymmetricTree(left.left, right.right);
			}
			else {
				return false;
			}
		}
	
			return left.valueIn==right.valueIn;
	
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(4);
		TreeNode leftthree = new TreeNode(3);
		TreeNode rightThree = new TreeNode(3);
		TreeNode nine = new TreeNode(9);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode ninet = new TreeNode(9);
		root.left=leftthree;
		root.right = rightThree;
		leftthree.left = nine;
		leftthree.right = four;
		rightThree.left = five;
		rightThree.right = ninet;
		
		boolean res = isSymmetricTree(leftthree,rightThree);
		System.out.println(res);
	}

}
