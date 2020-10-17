package May2020;

import java.util.List;

/**
 *           10 
 *          /  \
 *         /    16
 *        /     /  \
 *       2     12   19
 *      / \    /\
 *     1    3 11 18
 *    
 *    
 *    
 * @author I813402
 *
 */

public class SecondLargestBinaryTree {

	private static int findLargest(TreeNode rootNode) {
	    if (rootNode == null) {
	        throw new IllegalArgumentException("Tree must have at least 1 node");
	    }
	    if (rootNode.right != null)  {
	        return findLargest(rootNode.right);
	    }
	    return rootNode.valueIn;
	}

	
	public static int findSecondLargest(TreeNode rootNode) {
	    if (rootNode == null || (rootNode.left == null
	            && rootNode.right == null)) {
	        throw new IllegalArgumentException("Tree must have at least 2 nodes");
	    }

	    // case: we're currently at largest, and largest has a left subtree,
	    // so 2nd largest is largest in said subtree
	    if (rootNode.left != null && rootNode.right == null) {
	        return findLargest(rootNode.left);
	    }

	    // case: we're at parent of largest, and largest has no left subtree,
	    // so 2nd largest must be current node
	    if (rootNode.right != null
	            && rootNode.right.left == null
	            && rootNode.right.right == null) {
	        return rootNode.valueIn;
	    }

	    // otherwise: step right
	    return findSecondLargest(rootNode.right);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		TreeNode two = new TreeNode(2);
		TreeNode sixteen = new TreeNode(16);
		TreeNode twelve = new TreeNode(10);
		TreeNode eleven = new TreeNode(11);
		TreeNode eighteen = new TreeNode(18);
		TreeNode t19t = new TreeNode(19);
		root.left=two;
		root.right=sixteen;
		sixteen.left=twelve;
		sixteen.right=t19t;
		twelve.right =eighteen; 
		int secondLargest = findSecondLargest(root);
		System.out.println(secondLargest);
	}

}
