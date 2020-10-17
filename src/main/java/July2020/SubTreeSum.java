package July2020;

import java.util.HashMap;
import java.util.Map;

public class SubTreeSum {

	public static int  findMaximumSubTreeSum(TreeNode root,int subSum,Map<Integer,Integer> subSumCount) {
		
		if(root==null) {
			return 0;
		}
		
		if(root.left==null && root.right==null) {
			subSum+=root.valueIn;

		
			if(subSumCount.get(root.valueIn)==null) {
				subSumCount.put(root.valueIn, 1);
			}
			else {
				subSumCount.put(root.valueIn, subSumCount.get(root.valueIn)+1);
			}	
			
			
			
			return subSum;
		}
	
		
		subSum = subSum+root.valueIn +findMaximumSubTreeSum(root.left, subSum, subSumCount) +findMaximumSubTreeSum(root.right, subSum, subSumCount);
		
		if(subSumCount.get(subSum)==null) {
			subSumCount.put(subSum, 1);
		}
		else {
			subSumCount.put(subSum, subSumCount.get(subSum)+1);
		}	
		
		return subSum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		TreeNode left2 = new TreeNode(2);
		TreeNode rightminus5 = new TreeNode(-5);
		TreeNode left4 = new TreeNode(4);
		TreeNode right5 = new TreeNode(5);
		
		root.left = left2;
		root.right = rightminus5;
		left2.left = left4;
		left2.right = right5;
		Map<Integer,Integer> sumCount = new HashMap<Integer, Integer>();
		findMaximumSubTreeSum(root, 0, sumCount);
	}

}
