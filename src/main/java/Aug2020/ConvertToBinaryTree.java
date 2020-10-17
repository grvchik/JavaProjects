package Aug2020;

public class ConvertToBinaryTree {

	
	
	public static void convertToBinaryTree(TreeNode root) {
		
		if(root==null) {
			return;
		}
		TreeNode left = root.left;
		TreeNode right = root.right;
		
	    if( isFull(left) && isFull(right)) {
	    	convertToBinaryTree(left);
	    	convertToBinaryTree(right);
	    }
	    
		
			root.left = getSubTreeOrLeaf(left);
		
			root.right = getSubTreeOrLeaf(right);
		
	}
	
	
	public static TreeNode getSubTreeOrLeaf(TreeNode root) {
		
		if(root==null) {
			return null;
		}
		
		if(root.left==null && root.right==null) {
			return root;
		}
		TreeNode left = getSubTreeOrLeaf(root.left);
		TreeNode right = getSubTreeOrLeaf(root.right);
		
		if(left==null) {
			return right;
		}
		if(right==null) {
			return left;
		}
		
		return root;
	}
	
	public static boolean isFull(TreeNode root) {
		
		if(root==null) {
			return false;
		}
		TreeNode left = root.left;
		TreeNode right = root.right;
		
		if(left==null && right==null) {
			return true;
		}
		
		if(left!=null && right!=null) {
			return true;
		}
		
		if(left==null && right!=null) {
			return false;
		}

		if(right==null && left!=null) {
			return false;
		}

		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode rootZero = new TreeNode(0);
		TreeNode one = new TreeNode(0);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		rootZero.left = one;
		rootZero.right = two;
		one.left = three;
		three.right = five;
		two.right = four;
		four.left = six;
		four.right = seven;
		
		convertToBinaryTree(rootZero);
	}

}
