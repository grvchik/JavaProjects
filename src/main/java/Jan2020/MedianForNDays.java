package Jan2020;

import java.util.Arrays;

public class MedianForNDays {

	public static int getMedian(int [] nums,int d) {
		
		int begIndex = 0;
		int endIndex = d;
	
		int alert=0;
		while(endIndex<= nums.length) {
			int newNums[] = Arrays.copyOfRange(nums, begIndex, endIndex);
	
			
			Arrays.sort(newNums);
			int median = getMedian(newNums);
			if(endIndex<=nums.length-1) {
				if(nums[endIndex]> median) {
					++alert;
				}
			}
			endIndex++;
			begIndex++;
			printArray(newNums);
		}
		return alert;
	}
	
	
	public static int  getMedian(int[] nums) {
		
		int length = nums.length;
		
		if(length%2==0) {
			int mid = nums.length/2;
			int before = mid-1;
			return (nums[before]+nums[mid])/2;
		}
		else {
			return nums[nums.length/2];
		}						
	}
	
	public static void printArray(int[] nums) {
		for(int num:nums) {
			System.out.print(num)	;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = { 1,2,3,4,4};
		int alerts = getMedian(nums, 4);
		System.out.println(alerts);
		
	}

}
