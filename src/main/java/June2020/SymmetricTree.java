package June2020;

import java.util.Deque;
import java.util.LinkedList;

public class SymmetricTree {

	public static boolean isSymmetricTree(TreeNode left,TreeNode right) {
		
		if(left==null && right!=null) {
			return false;
		}
		
		if(right!=null && left==null) {
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
		
		
		if(left.left==null && right.right!=null) {
			return false;			
		}

		if(left.right==null && right.left!=null) {
			return false;			
		}

		if(right.right==null && left.left!=null) {
			return false;
		}

		
		if(right.left==null && left.right!=null) {
			return false;
		}
	
		
		if(left.left!=null && right.right!=null && left.left.valueIn==right.right.valueIn && left.right==null && right.left==null) {
			return isSymmetricTree(left.left, right.right) ;
		}
		
		if(left.right!=null && right.left!=null && left.right.valueIn==right.left.valueIn && left.left==null && right.right==null) {
			return isSymmetricTree(left.right, right.left) ;
		}	

		
		if(left.right.valueIn==right.left.valueIn && left.left.valueIn==right.right.valueIn ) {
			return isSymmetricTree(left.right, right.left) && isSymmetricTree(left.left, right.right) ;
		}		
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		rightThree.right = rightNine;
		boolean res = isSymmetricTree(root.left,root.right);
		System.out.println(res);
	}

}
