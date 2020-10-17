package July2020;



public class SymmetricTree {

	public static boolean isSymmetricTree(TreeNode left,TreeNode right) {

		if(left==null && right==null) {
			return true;
		}
		
		if(left.valueIn!=right.valueIn) {
			return false;
		}
		
		
		if(left.left==null && left.right==null && right.left==null && right.right==null) {
			if(left.valueIn==right.valueIn) {
				return true;
			}
			else {
				return false;
			}
		}
		
		
		if(left.valueIn==right.valueIn) {
			
			if(    left.left!=null && right.right!=null 
			    && left.right==null && right.left==null 
			    && left.left.valueIn == right.right.valueIn ) {
			       return 	isSymmetricTree(left.left, right.right);
		  	     }
	
			   if(    left.right!=null && right.left!=null 
				    && left.left==null && right.right==null 
				    && left.right.valueIn == right.left.valueIn ) {
				    return 	isSymmetricTree(left.right, right.left);
				   }			
			
			
			   return isSymmetricTree(left.right, right.left) && isSymmetricTree(left.left, right.right); 
			
		}
		   		
				
			
		
		return false;
	}
	
	public static void main(String[] args) {

		TreeNode root = new TreeNode(4);
		TreeNode leftThree = new TreeNode(3);
		TreeNode leftNine = new TreeNode(9);
		
		TreeNode nineright = new TreeNode(4);
		TreeNode rightThree = new TreeNode(3);
		TreeNode rightNine = new TreeNode(9);
		root.left = leftThree;
		root.right = rightThree;
		leftThree.left = leftNine;
		leftNine.right = nineright;
		rightNine.left = nineright;
		rightThree.right = nineright;
		boolean res = isSymmetricTree(root.left,root.right);		
		System.out.println(res);
	}

}
