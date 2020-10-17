package Aug2020;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumberArray {

	public static int findMissingNumberArray(int [] nums,int lower,int upper) {

		Arrays.sort(nums);
		for(int i = nums.length-1;i>=0;i--) {
			int currElement = nums[i];
			int nextElement = nums[i-1];
			if(currElement-1!=nextElement) {
				return nextElement;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {14,12,16,11,15};
		int lower = 11;
		int upper = 16;
		int res = findMissingNumberArray(nums, lower, upper);
		System.out.println(res);
	}

}
