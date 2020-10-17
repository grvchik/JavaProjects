package June2020;

import java.util.HashSet;
import java.util.Set;

public class LengthMaxContiguousArray {

	public static int getMaxContiguousArray(int[] nums) {
		Set<Integer> uniqueSet = new HashSet<Integer>();
		int maxLength = 0;
		int greatestSoFar = 0;
		for(int i =0;i<nums.length;i++) {
			if(uniqueSet.contains(nums[i])) {
				continue;
			}
			else {
			
				uniqueSet.add(nums[i]);
				
				maxLength = Math.max(uniqueSet.size(), maxLength);
				
			}
		}
		
		return maxLength;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] nums = {5,1,5,3,4,1,5,2};
			int maxL = getMaxContiguousArray(nums);
			System.out.println(maxL);
	}

}
