package Sep2020;

import java.util.Arrays;

public class TragetRecursionMemoization {

	public static int findTragetSumCombinations(int[] nums,int targetSum) {
		int[][]memoArray = new int[nums.length+1][2001];
		for(int  [] row :memoArray) {
			Arrays.fill(row, Integer.MIN_VALUE);
		}
		return backTrack(memoArray,nums, 0, 0, targetSum);
	}
	
	
	public static int backTrack(int[][] memo,int[]nums,int index,int runningSum,int targetSum) {
		
		if(index==nums.length ) {
			if( runningSum==targetSum) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		if(memo[index][runningSum+1000]!=Integer.MIN_VALUE) {
			return memo[index][runningSum+1000];
		}
		
		int sum = backTrack(memo,nums, index+1, runningSum+nums[index], targetSum) +
				  backTrack(memo,nums, index+1, runningSum-nums[index], targetSum);
		
		memo[index][runningSum+1000] = sum;
		
		return memo[index][runningSum+1000];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,3,-1,4,0,-2};
		long start = System.currentTimeMillis();
		int result = findTragetSumCombinations(nums, 2);
		long end = System.currentTimeMillis();
		System.out.println(result+" Time taken is "+(end-start)+" milliseconds");
	}

}
