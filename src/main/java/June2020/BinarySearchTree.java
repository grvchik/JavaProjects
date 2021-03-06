package June2020;



class TreeNode{
	public TreeNode left;
	public TreeNode right;
	public int valueIn;
	public TreeNode(int value) {
		this.valueIn = value;
	}
}

public class BinarySearchTree {

	
	public static boolean isBST(TreeNode root) {
		return isBSTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean isBSTree(TreeNode root,Integer minValue,Integer maxValue) {
		if(root==null) {
			return true;
		}
		
		if(root.valueIn <Integer.MIN_VALUE || root.valueIn >Integer.MAX_VALUE) {
			return false;
		}
		
		if(root.left==null && root.right==null) {
			if(root.valueIn <maxValue && root.valueIn >minValue) {
				return true;
			}
			else {
				return false;
			}
		}
		
		boolean left= isBSTree(root.left, minValue, root.valueIn);
		
	
		boolean right =  isBSTree(root.right, root.valueIn, maxValue);
				
		
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
