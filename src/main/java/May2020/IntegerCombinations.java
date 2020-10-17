package May2020;

import java.util.ArrayList;
import java.util.List;

public class IntegerCombinations {
	public static List<List<Integer>> container = new ArrayList<List<Integer>>();
	public static void getCombinations(int[] nums,int left, int right) {
	
		if(left==right) {
			List <Integer> resList = new ArrayList<Integer>();
			for(int num :nums) {
				resList.add(num);
			}
			container.add(resList);
			return;
		}
		
		for(int i=left;i<=right;i++) {
			int[] newnums = swap(nums,left,right);
			getCombinations(newnums, left+1, right);
		}
	}
	
	
	
	public static int[] swap(int[]nums,int left,int right) {
		int[] newnums = new int[nums.length];
		
		for(int i=0;i<nums.length;i++) {
			newnums[i] = nums[i];
		}
		
		int temp = newnums[left];
		newnums[left] = newnums[right];
		newnums[right] = temp;
		return newnums;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,4,5};
		getCombinations(nums, 0, nums.length-1);
		
		System.out.println(container);
		
	}

}
