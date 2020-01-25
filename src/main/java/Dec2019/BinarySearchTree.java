package Dec2019;

public class BinarySearchTree {

public static boolean isBalanced(TreeNode root){	
	
	if(root.left==null && root.right==null) {

		  return true;
		}


		if(root.left!=null) {
		 
		 if(root.val < root.left.val) {
		   return false; 
		 }
		  else {
		    return isBalanced(root.left);
		  }
		}

		if(root.right!=null) {
		   if(root.val> root.right.val) {
		     return false;
		   }
		  else {
		     return isBalanced(root.right);
		  }
		}

		return false;

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(50);
		TreeNode ten = new TreeNode(10);
		TreeNode twenty = new TreeNode(200);
		TreeNode forty = new TreeNode(40);
		root.left = twenty;
		root.right = forty;
		twenty.left = ten;
		BinarySearchTree bsTree = new BinarySearchTree();
		System.out.println(bsTree.isBalanced(root));
		
	}

}
