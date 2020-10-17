package Sep2020;

import java.util.ArrayList;
import java.util.List;

public class TargetSignCombinationsMemoization {
	public static int targetSum=3;
	public static void getCombinations(int[]nums, int index,int runningSum,List<Integer> counter){
		
		if(index>=nums.length) {
			return;
		}
		
	
		if(nums[index]+runningSum==targetSum) {
			if(counter.size()==0) {
				counter.add(1);
			}
			else {
				counter.set(0, counter.get(0)+1);
			}
		}
		
		if(nums[index]-runningSum==targetSum) {
			if(counter.size()==0) {
				counter.add(1);
			}
			else {
				counter.set(0, counter.get(0)+1);
			}
		}	
		getCombinations(nums, index+1, runningSum+nums[index], counter);
		getCombinations(nums, index+1, runningSum-nums[index], counter);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,3,-2};
		int runningSum=0;
		List<Integer> counter = new ArrayList<Integer>();
		getCombinations(nums, 0, runningSum, counter);
		System.out.println(counter);
	}

}
