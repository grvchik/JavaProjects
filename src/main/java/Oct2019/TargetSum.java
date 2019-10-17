package Oct2019;

public class TargetSum {

	public static int getNumberOfWays(int[] nums,int index, int target, int runningSum) {

		// make a placeholder array
		if(index==nums.length) {
			
			if(runningSum==target) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		int withSum =getNumberOfWays(nums, index+1, target, runningSum+nums[index]);
		--index;
		int withoutSum =getNumberOfWays(nums, index+1, target, runningSum-nums[index]) ; 
		
		return  withSum+withoutSum; 
		
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,5,6,4,7};
		int ans = getNumberOfWays(nums, 0,11,0);
		
		System.out.println(ans);
		
	}

}
