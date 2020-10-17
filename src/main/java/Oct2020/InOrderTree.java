package Oct2020;



public class InOrderTree {

	public static void printInOrder(TreeNode root) {
		
		if(root==null) {
			return;
		}
		
		if(root.left==null && root.right==null) {
			System.out.println(root.valueIn);
			return;
		}
		if(root.left!=null) {
			printInOrder(root.left);
		}
		
		System.out.println(root.valueIn);
		if(root.right!=null) {
			printInOrder(root.right);
		}
		
	}
	
	
	public static void main(String[] args) {
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
		printInOrder(root);
	}

}
