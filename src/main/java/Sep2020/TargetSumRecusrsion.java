package Sep2020;

public class TargetSumRecusrsion {

	public static int findTragetSumCombinations(int[] nums,int targetSum) {
		
		return backTrack(nums, 0, 0, targetSum);
	}
	
	
	public static int backTrack(int[]nums,int index,int runningSum,int targetSum) {
		
		if(index==nums.length ) {
			if( runningSum==targetSum) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		

		
	int sum = backTrack(nums, index+1, runningSum+nums[index], targetSum) +
				  backTrack(nums, index+1, runningSum-nums[index], targetSum);
				
		return sum;
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
