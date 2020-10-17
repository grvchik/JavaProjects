package May2020;

import java.util.HashSet;
import java.util.Set;

public class ConsecutiveArray {

	public static int getMaxConsecutive(int[] nums) {
		Set<Integer> uniqueSet = new HashSet<Integer>();
		for(int num:nums) {
			uniqueSet.add(num);
		}
		int maxLength = Integer.MIN_VALUE;
		int length = 0;
		for(int i=0;i<nums.length;i++) {
			int currNumber = nums[i];
			int prevNumber = currNumber-1;
			System.out.println(prevNumber);
			if(!uniqueSet.contains(prevNumber)) {
				length=1;
			}
			while(uniqueSet.contains(prevNumber)) {
				++length;
				maxLength = Math.max(maxLength, length);
				prevNumber = prevNumber-1;
			}
			
		}
		System.out.println(maxLength);
		return maxLength;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,2,1,6,5};
		int max = getMaxConsecutive(nums);
		System.out.println(max);
		
	}

}
