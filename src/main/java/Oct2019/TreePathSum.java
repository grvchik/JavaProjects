package Oct2019;

import java.util.HashSet;
import java.util.Set;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val) {
		this.val = val;
	}
}

public class TreePathSum {

	public int getCountNodesWirhSum(TreeNode root,int targetSum) {
		
		  	
		  if(root==null ) {
		    return 0;	  
		  }

		  int pathsFromRoot = countSumsFromNode(root, targetSum,0);
		  
		  int leftPath = getCountNodesWirhSum(root.left, targetSum);
		  
		  int rightPath = getCountNodesWirhSum(root.right, targetSum);
		 
		  return pathsFromRoot + leftPath +rightPath;
		}
	
	
	public int countSumsFromNode(TreeNode node, int targetSum,int runningSum) {
		int totalPaths=0;
		
		if(node==null) {
			return 0;
		}
		runningSum += node.val;
		if(targetSum==runningSum) {
			totalPaths++;
		}
		
		int leftCount = countSumsFromNode(node.left, targetSum,runningSum);
		int rightCount= countSumsFromNode(node.right, targetSum,runningSum);
		
		totalPaths = totalPaths+leftCount+rightCount;
		return totalPaths;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		TreeNode left = new TreeNode(5);
		TreeNode right = new TreeNode(-3);
		TreeNode leftleft = new TreeNode(2);
		TreeNode rightLeft = new TreeNode(4);
		TreeNode rightright = new TreeNode(6);
		root.left = left;
		root.right = right;
		right.left = rightLeft;
		right.right = rightright;
		left.left = leftleft;
		TreePathSum tpSum =  new TreePathSum();
		tpSum.getCountNodesWirhSum(root, 7);
		
		
	}

}
