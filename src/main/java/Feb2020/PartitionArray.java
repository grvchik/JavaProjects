package Feb2020;

import java.util.Arrays;

public class PartitionArray {

	public static boolean canPartition(int [] nums) {
		
		Arrays.sort(nums);
		return isSum(nums, 1, 0, 0);
	}

	
	public static boolean isSum(int[] nums ,int  partitionIndex,int leftSum,int rightSum) {
		
		if(partitionIndex==nums.length-1 ) {
			return (leftSum==rightSum);
		}

		for(int i=0;i<=partitionIndex;i++) {
			leftSum = leftSum+nums[i];
		}
		for(int j=partitionIndex+1;j<nums.length;j++) {
			rightSum = rightSum+nums[j];
		}

		if(leftSum<rightSum) {
			return isSum(nums, ++partitionIndex, 0, 0);
		}
		return leftSum==rightSum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] =  {15, 5, 20, 10, 35, 15, 10};
		System.out.println(canPartition(nums));
	}
// 0  1  2  3  4  5  6	
// 5,10,10,15,15,20,35
}
