package Feb2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignTargetSum {

	public static int getPermutations(int [] nums,int target) {
		List<Integer> countList = new ArrayList<Integer>();
		Map<String,Integer> uniqueSet = new HashMap<String,Integer>();
		helper(nums, 0, nums[0], target, countList,uniqueSet);
		if(countList.size()>0) {
			return countList.get(0);
		}
		return -1;
	}
	
	
	public static int helper(int[] nums , int startIndex, int runningSum,int target,
			List<Integer> countList, Map<String,Integer> uniqueSet) {
		
		String key = startIndex+","+runningSum;

		if(uniqueSet.containsKey(key)) {
			return uniqueSet.get(key);
		}
		else {
			if(runningSum==target) {
				uniqueSet.put(key, 1);
			}
			else {
				uniqueSet.put(key, 0);
			}
		}
		
		if(startIndex==nums.length-1) {
			if (runningSum==target)
			return 1;
			else 
			return 0;	
		}
		

		

	
	 int positive=	helper(nums, ++startIndex, runningSum+nums[startIndex], target, countList,uniqueSet);
	 
	 int negative=	helper(nums, --startIndex, runningSum-nums[startIndex], target, countList,uniqueSet);
	 
	 uniqueSet.put(key, positive+negative);
	 return positive+negative;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,1,3,2};
		int target = 2;
		getPermutations(nums, target);
	}

}
