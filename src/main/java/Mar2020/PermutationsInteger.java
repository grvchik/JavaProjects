package Mar2020;

import java.util.ArrayList;
import java.util.List;


public class PermutationsInteger {

	private static List<List<Integer>> result;
	
	public void pumutationExector(int[] nums) {
		permutate(nums, 0, nums.length-1);
	}
	
	public void permutate(int[] nums,int left,int right) {
		if(left==right) {
			List<Integer> item = new ArrayList<Integer>();
			for(int i=0;i<nums.length;i++) {
				item.add(nums[i]);
			}
			result.add(item);
		}
		else {
			
			for(int i=left;i<=right;i++) {
				int[] newNums = swap(nums, left, right);
				permutate(newNums, left, right);
			}
			
		}
	}
	
	
	public int[] swap(int[] nums,int left,int right) {
		
		int[] newNums = nums.clone();
		
		int temp = newNums[left];
		newNums[left] = newNums[right];
		newNums[right] = temp;
		return newNums;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,6,7,8 };
		PermutationsInteger permInteger = new PermutationsInteger();
		permInteger.pumutationExector(nums);
		
		for(int i=0;i<result.size();i++) {
			List<Integer> item = result.get(i);
			for(int k=0;k<item.size();k++) {
				System.out.println(item.get(k));
			}
		}
		
	}

}
