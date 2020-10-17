package Oct2020;

public class ConstructBST {

	
	public  static TreeNode removeNode(TreeNode root,int val) {
		if(root==null) {
			return null;
		}
		
		if(val == root.valueIn) {
			if(root.left==null && root.right==null) {
				return null;
			}
			if(root.left!=null) {
				TreeNode temp = root.left;
				root = null;
				root = temp;
				return root;
			}
			if(root.right!=null) {
				TreeNode temp = root.right;
				root = null;
				root = temp;
				return root;
			}		
			
			int min = getMinimum(root);
			root.valueIn=min;
			root.right = removeNode(root.right, min);
			return root;
		}
		else if(val<root.valueIn) {
			root.left= removeNode(root.left, val);
			return root;
		}
		else {
			root.right = removeNode(root.right, val);
			return root;
		}
		
	}
	
	private static int getMinimum(TreeNode root) {
		if(root.left==null ) {
			return root.valueIn;
		}
		
		
		while(root.left!=null) {
			root  = root.left;
		}
		
		return root.valueIn;
	}
	
	public static void insertValue(TreeNode root,TreeNode newNode) {
		
		if(root==null) {
			
			root = new TreeNode(newNode.valueIn);
			return;
		}
		if(newNode.valueIn <root.valueIn) {
			if(root.left==null) {
				
				root.left = new TreeNode(newNode.valueIn);
				
			}
			else {
				insertValue(root.left, newNode);
			}
		}
		else {
			if(root.right==null) {
				root.right = new TreeNode(newNode.valueIn);
			}
			else {
				insertValue(root.right, newNode);
			}
		}
	
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(2);
	
		TreeNode three = new TreeNode(1);
		TreeNode five = new TreeNode(5);
		TreeNode seven = new TreeNode(7);		
		insertValue(root, three);
		insertValue(root, five);
		insertValue(root, seven);
		TreeNode ret = removeNode(root, 5);
		System.out.println(ret);
	
		
	}

}
