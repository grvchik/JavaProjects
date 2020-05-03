package Feb2020;

import java.util.ArrayList;
import java.util.List;

public class MaxContigousArray {

	public static void addArray(int[] nums, int fromIndex,int toIndex,List<Integer> maxSumList) {
		if(fromIndex==toIndex || fromIndex>toIndex) {
			return;
		}
		findMaximum(nums, fromIndex, toIndex, maxSumList);
		findMaximum(nums, toIndex, nums.length-1, maxSumList);
		System.out.println("fromIndex"+fromIndex+" toIndex"+toIndex);
		addArray(nums, fromIndex, --toIndex, maxSumList);
		System.out.println("fromIndex L "+fromIndex+" toIndex L"+toIndex);
		addArray(nums, ++fromIndex, toIndex, maxSumList);
	}

	public static void  findMaximum(int[] nums) {
		int maxSum=0;
		int maxCurr=0;
		for(int i=0;i<nums.length;i++) {
			int num = nums[i];
			maxCurr = Math.max(maxCurr + num, num);
			//System.out.println("maxCur at index "+i+" is"+maxCurr);
			maxSum = Math.max(maxSum, maxCurr);
			//System.out.println("maxSum at index "+i+" is"+maxSum);
		}
		//System.out.println(maxSum);
	}
	
	private static void findMaximum(int[]nums,int fromIndex,int toIndex,List<Integer> maxSumList) {
		int sumSoFar=0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=fromIndex;i<=toIndex;i++) {
			sumSoFar+=nums[i];
			maxSum= Math.max(sumSoFar, maxSum);
			if(maxSumList.size()==0) {
				maxSumList.add(maxSum);
			}
			else {
				Integer currValue = maxSumList.get(0);
				maxSumList.set(0, Math.max(maxSum, currValue));
			}
		}
		
		
	}
	
	public static void main(String g[]) {
		int nums[] = {34,-50,42,14,-5,86};
		List<Integer> maxSumList = new ArrayList<Integer>();
		addArray(nums, 0, nums.length-2, maxSumList);
		//System.out.println(maxSumList.get(0));
		findMaximum(nums);
	}
}
