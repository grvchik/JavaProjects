package Jan2020;

public class SwapTreeNodes {

	private int k;
	
	public static TreeNode swapNodes(TreeNode root, int depth, int k) {
		if(root==null) {
			return null;
		}
		if(depth==k-1) {
			TreeNode temp=null;
			TreeNode left = root.left;
			TreeNode right = root.right;
			temp = left;
			left = right;
			right = temp;
			root.left = left;
			root.right=right;
			return root;
		}
		
		TreeNode left = swapNodes(root.left, depth+1,k);
		TreeNode right = swapNodes(root.right, depth+1,k);
		
		root.left = left;
		root.right=right;
		
		return root;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode six = new TreeNode(6);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode seven = new TreeNode(7);
		TreeNode eight = new TreeNode(8);
		root.left = three;
		root.right = six;
		three.left = four;
		four.left = seven;
		four.right = eight;
		three.right = five;
		swapNodes(root,1,4);		
		
	}

}
