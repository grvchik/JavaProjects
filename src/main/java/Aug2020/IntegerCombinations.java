package Aug2020;

import java.util.ArrayList;
import java.util.List;

public class IntegerCombinations {
 public static List<int[]> combinations = new ArrayList<int[]>();
 
 
 	public static List<int[]> getCombinations(int[] nums,int start ) {
 		if(start >=nums.length) {
 			combinations.add(nums.clone());
 			return combinations;
 		}
 		
 		for(int i=start;i<nums.length;i++) {
 			swap(nums, start, i);
 			getCombinations(nums, start+1);
 			swap(nums, i, start);
 		}
 		return combinations;
 	}
 
 	
 	public static void swap(int[] nums,int from ,int to) {
 		int temp = nums[from];
 		nums[from] = nums[to];
 		nums[to] = temp;
 	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,7};
		getCombinations(nums, 0);
	}

}
