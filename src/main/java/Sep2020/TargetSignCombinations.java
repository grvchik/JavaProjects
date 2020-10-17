package Sep2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSignCombinations {
	public static int targetSum=6;
	public static int getCombinations(int[]nums, int index,int runningSum,int[][]memo){
		
		if(index>=nums.length) {
			if(runningSum==targetSum) {
				return 1;
			}
			else {
				return 0;
			}			
		}
		

		
		int cachedSum = memo[index][runningSum+100];
		if(cachedSum!= Integer.MIN_VALUE) {
			return cachedSum;
		}
		
		 memo[index][runningSum+100] = 	getCombinations(nums, index+1, runningSum+nums[index], memo) +
				 					getCombinations(nums, index+1, runningSum-nums[index], memo) ;
		
		 return memo[index][runningSum+100];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,3,-2};
		int sum=0;
		int[][]memo = new int[nums.length+1][201];
		for(int  [] row :memo) {
			Arrays.fill(row, Integer.MIN_VALUE);
		}
		int runningSum=0;
		
		int res = getCombinations(nums, 0, runningSum, memo);
		System.out.println(res);
		
		
	}

}
