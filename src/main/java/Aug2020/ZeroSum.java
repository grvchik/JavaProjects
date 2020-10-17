package Aug2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ZeroSum {

	
	
	public static List<Set<Integer>> geSublist(int[] nums) {
		Set<Integer> listSet  = new HashSet<Integer>();
		List<Set<Integer>> result = new ArrayList<Set<Integer>>();
		for(int num :nums) {
			listSet.add(num);
		}
		
		int sum = 0;
		Set<Integer> uniqueSet = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			sum = sum+nums[i];
			uniqueSet.add(nums[i]);
			int oppositeNumber = -(sum);
			if(listSet.contains(oppositeNumber)) {
				uniqueSet.add(oppositeNumber);
				result.add(uniqueSet);
				uniqueSet = new HashSet<Integer>();
				sum = 0;
			}
		}// for
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,5,-2,-4,7,-1,6,8,-8,4};
		
		List res = geSublist(nums);
		System.out.println(res);
	}

}
