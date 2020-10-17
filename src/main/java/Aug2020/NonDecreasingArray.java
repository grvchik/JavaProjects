package Aug2020;

public class NonDecreasingArray {

	public static boolean isNonDecreasing(int [] nums) {
		
		if (nums==null || nums.length<=1) {
			return false;
		}
		
		int end = nums.length-1;
		int left = nums.length-2;	
		int changeCounter=0;
		int pivotlocation=-1;
		while(end>=1 && left>=0) {
			
			if(pivotlocation ==-1 && nums[left]>nums[end]) {
				pivotlocation = end;
				changeCounter++;
			}
			else {
				if( pivotlocation >=0 && nums[left]>nums[pivotlocation]) {
					changeCounter++;
				}
			}
			
			end--;
			left--;
		}
		
		if(changeCounter==1) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {	1,2,3,4};
		boolean res = false;
		res = isNonDecreasing(nums);
		System.out.println(res);
	}

}
