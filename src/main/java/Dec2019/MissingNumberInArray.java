package Dec2019;

import java.util.HashSet;
import java.util.Set;

public class MissingNumberInArray {

	public static int getFirstPositiveInteger(int[] nums) {
		
		
		Set<Integer> positiveNumbers = new HashSet<Integer>();
	
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				positiveNumbers.add(nums[i]);
			}
		
		}		
		
		int maximum = nums.length;
	
			while(positiveNumbers.contains(maximum)) {
				positiveNumbers.remove(maximum);
				maximum = maximum-1;
			}
		
			
		return maximum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,4,-1,1};
		System.out.println(getFirstPositiveInteger(nums));
	}

}
