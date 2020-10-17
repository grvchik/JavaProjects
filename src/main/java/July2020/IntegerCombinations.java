package July2020;

import java.util.ArrayList;
import java.util.List;

public class IntegerCombinations {
public static List<int[]> result = new ArrayList<int[]>();
	public static List<int[]> getCombinations(int start,int[] nums) {
		
		if(start>=nums.length-1) {
			result.add(nums.clone());
			return result;
		}
		
		for(int i=start;i<nums.length;i++) {
			swap(nums, start, i);
			getCombinations(start+1, nums);
			swap(nums, i, start);
			
		}
		printCombinations(result);
		return result;
	}
	
	public static void swap(int[]nums,int start,int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}
	public static  List<int[]>getCombinations(int[] nums) {
		
		result = getCombinations(0, nums);
		return result;
	}
	
	
	public static void printCombinations( List<int[]> combin) {
		for (int[] nums : combin) {
			System.out.println();
			for(int num :nums) {
				System.out.print(num);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,2,4};
		result = getCombinations(nums);
		System.out.println(result);
	}

}
