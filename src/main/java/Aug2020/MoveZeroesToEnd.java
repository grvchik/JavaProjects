package Aug2020;

public class MoveZeroesToEnd {

	public static void moveZerooesToEnd(int[] nums) {
		
		int nonZeroIndex = 0;
		int zeroCounter=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				zeroCounter++;
			}
			else {
				nums[nonZeroIndex] = nums[i];
				nonZeroIndex++;
			}
		}
		
		while(zeroCounter>0) {
			nums[nonZeroIndex]=0;
			nonZeroIndex++;
			zeroCounter--;
		}
	  
	System.out.println(nums);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,4,5,0,0,6,7};
		moveZerooesToEnd(nums);
	}

}
