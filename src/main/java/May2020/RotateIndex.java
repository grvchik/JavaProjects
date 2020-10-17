package May2020;

public class RotateIndex {

	public static int findRotationIndex(int[] nums) {
		
		int begIndex = 0;
		int endInIndex = nums.length-1;
		
		while(begIndex <= endInIndex) {
			if(nums[begIndex]> nums[endInIndex]) {
				if(begIndex+1==endInIndex) {
					return endInIndex;
				}
				++begIndex;
			}
			else {
				--endInIndex;
			}
		}
		
		return begIndex;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {13,18,25,2,8,10};
		int index = findRotationIndex(nums);
		System.out.println(index);
	}

}
