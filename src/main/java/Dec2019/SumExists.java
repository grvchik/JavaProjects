package Dec2019;

import java.util.HashSet;
import java.util.Set;

public class SumExists {

	public static boolean doesSumExists(int[] nums, int sum) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int num : nums) {
			set.add(num);
		}
		
		
		for(int i=0;i<nums.length;i++) {
			
			int remaining = sum - nums[i];
			if(set.contains(remaining)){
				return true;
			}
			
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {10, 15, 3, 7};
		int sum  = 12;
		boolean res = doesSumExists(nums, sum);
		System.out.println(res);
	}

}
