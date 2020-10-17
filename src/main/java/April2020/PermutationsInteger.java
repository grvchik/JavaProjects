package April2020;

import java.util.ArrayList;
import java.util.List;

public class PermutationsInteger {

	public static List<List<Integer>> container = new ArrayList<List<Integer>>();
	
	
	public static void permutateInteger(int [] nums) {
	
		
		permutateWithIndex(nums, 0, nums.length-1);
		
		
	}
	
	public static void permutateWithIndex(int [] nums,int left, int right) {
		
		if(left==right) {
			List<Integer> result = new ArrayList<Integer>();
			for(int num :nums) {
				result.add(num);
			}
			container.add(result);
			return;
		}
		else {
			
			for(int i=left;i<=right;i++) {
				int newNums[] = swap(nums, left, right);
				permutateWithIndex(newNums, left+1, right);
			}
			
		}
	}
	
	public static int[] swap(int[] nums,int left,int right) {
		
		int[] newNums = nums.clone();
		
		int temp = newNums[left];
		newNums[left] = newNums[right];
		newNums[right] = temp;
		return newNums;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,4,5,2};
		permutateInteger(nums);
		System.out.println(container);
	}

}
