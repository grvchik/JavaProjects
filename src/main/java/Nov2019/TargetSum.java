package Nov2019;

import java.util.ArrayList;
import java.util.List;

public class TargetSum {

	public static int getNumberOfWays(int[]nums,int target) {
		List<Integer> counter = new ArrayList<Integer>();
		counter.add(0);
		int runningSum=0;
		helper(0, nums, target,runningSum, counter);
		return counter.get(0);
	}
	
	public static void helper(int begIndex, int[] nums,int target, int runningSum, List<Integer> counter ) {
		if(begIndex==nums.length) {
			return;
		}		
		
		if(runningSum<target) {
			runningSum  = runningSum + nums[begIndex];	
		}
		
		if(runningSum==target) {
			counter.set(0, counter.get(0)+1);
		}
		
		for(int i = begIndex +1;i<nums.length;i++) {			
			if(runningSum+nums[i]> target) {
				continue;
			}
			else {
				runningSum =runningSum+nums[i];
				if(runningSum==target) {
					counter.set(0, counter.get(0)+1);
					runningSum =  nums[begIndex];
				}
			}			
		}
		helper(begIndex+1, nums, target, runningSum,counter);		
	}
	 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {6,2,4,10};
		int counter = getNumberOfWays(nums, 16);
		System.out.println(counter);
	}
}
