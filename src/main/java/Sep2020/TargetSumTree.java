package Sep2020;

import java.util.ArrayList;
import java.util.List;

public class TargetSumTree {

	public static void buildTree(int[]nums,int index,int runningSum,TreeNode root,List<Integer> counter ,int targetSum) {
		
		if(index==nums.length) {
			if(root.value==targetSum) {
				counter.set(0, counter.get(0)+1);
			}
			return;
		}
		
		int leftSum = runningSum +nums[index];
		root.left = new TreeNode(runningSum);
		buildTree(nums, index+1, leftSum, root.left,counter,targetSum);
		int rightSum= runningSum -nums[index];
		root.right= new TreeNode(runningSum);
		buildTree(nums, index+1, rightSum, root.right,counter,targetSum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,3,2};
		TreeNode root = new TreeNode(0);
		int runningSum=0;
		List<Integer> counter = new ArrayList<Integer>();
		counter.add(0);
		buildTree(nums, 0, runningSum, root,counter,2);
		
		System.out.println(counter);
		
	}

}
