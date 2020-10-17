package Aug2020;

 class TreeNode1{
	public TreeNode1 left;
	public TreeNode1 right;
	public int valueIn;
	public TreeNode1(int value) {
		this.valueIn = value;
	}
}



public class BSTValidator {

	
	public static boolean isBSTTree(TreeNode1 root,int minVal,int maxVal) {
		if(root==null) {
			return true;
		}
		if(root.left==null && root.right==null) {
			if(root.valueIn>maxVal ||root.valueIn<minVal) {
				 return false;	
				}
			else {
				return true;
			}
		}
		
		if(root.left!=null && root.right==null) {
			return isBSTTree(root.left, minVal, root.valueIn);
		}
		
		if(root.right!=null && root.left==null) {
			return isBSTTree(root.right, root.valueIn,maxVal);
		}	
		
		boolean left = isBSTTree(root.left, minVal, root.valueIn);
		boolean right = isBSTTree(root.right, root.valueIn,maxVal);
		return left && right;
	}
	
	public static void main(String[] args) {
		
		TreeNode1 root = new TreeNode1(2);
		TreeNode1 three = new TreeNode1(1);
		TreeNode1 three1 = new TreeNode1(3);
		TreeNode1 four = new TreeNode1(4);
		TreeNode1 five = new TreeNode1(5);
		root.left = three;
		root.right = four;
		four.left = three1;
		four.right = five;
		boolean res = isBSTTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println(res);
	}

}
