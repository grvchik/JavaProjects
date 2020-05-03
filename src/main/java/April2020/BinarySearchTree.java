package April2020;

class TreeNode1{
	public int value;
	public TreeNode1 left;
	public TreeNode1 right;
	TreeNode1(int valIn) {
		this.value = valIn;
	}
}

public class BinarySearchTree {

	public static boolean isBST(TreeNode1 root) {
		
		int minBound = Integer.MIN_VALUE;
		int maxBound = Integer.MAX_VALUE;
		
		return isBSTWithBounds(root, minBound, maxBound);
		
		
	}

	
	public static boolean isBSTWithBounds(TreeNode1 root,int minValue,int maxValue) {
		if(root==null) return true;
		
		if (root.left==null && root.right==null) {
			if(root.value>=minValue && root.value <=maxValue) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if(root.value<minValue ||root.value >maxValue) {
			return false;
		}
		
		boolean leftResult = isBSTWithBounds(root.left, minValue, root.value);
		boolean rightResult = isBSTWithBounds(root.right, root.value+1, maxValue);
		
		if(leftResult==true && rightResult==true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode1 root = new TreeNode1(6);
		TreeNode1 three = new TreeNode1(7);
		TreeNode1 two = new TreeNode1(2);
		TreeNode1 four = new TreeNode1(4);
		root.left = four;
		four.left = two;
		four.right = three;
		boolean res = isBST(root);
		System.out.println(res);
	}

}
