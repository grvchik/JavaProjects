package Oct2020;

public class PreOrderTraversal {

	public static void printPreOrder(TreeNode root) {
		
		if(root==null) {
			return;
		}
		System.out.println(root.valueIn);
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		
		root.left = three;
		root.right = four;
		four.left = five;
		four.right = six;
		printPreOrder(root);
	
	}

}
