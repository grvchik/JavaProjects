package May2020;

public class PartitionArray {

	public static void partitionArray(int[] nums, int pivot) {
		int lowerIndex = 0;
		int pivotIndex = 0;
		int higherIndex = nums.length-1;
		
		while(pivotIndex < higherIndex) {
			
			if(nums[pivotIndex]==pivot) {
				++pivotIndex;
			}
			else if(nums[pivotIndex]<pivot) {
				int temp = nums[pivotIndex];
				nums[pivotIndex] =nums[lowerIndex];
				nums[lowerIndex] = temp;
				++lowerIndex;
				++pivotIndex;
			}
			else {
				int temp = nums[higherIndex];
				nums[higherIndex] = nums[pivotIndex];
				nums[pivotIndex] = temp;
				++pivotIndex;
				--higherIndex;
			}
		}
		System.out.println(nums);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] nums = {13,9,14,10,5,2,10};
			partitionArray(nums, 10);
	}

}
