package April2020;
class TreeNode {
	int value;
	
	public TreeNode(int valueIn) {
		this.value = valueIn;
	}
	
	public TreeNode left;
	public TreeNode right;
}
public class InOrderTraversal {

	
	public static void printInOrder(TreeNode root) {
		if(root.left==null && root.right==null) {
			System.out.println(root.value);
			return;			
		}
		
		if(root.left!=null) {
			
			printInOrder(root.left);
			System.out.println(root.value);
		}
		if(root.right!=null) {
			//System.out.println(root.value);
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
