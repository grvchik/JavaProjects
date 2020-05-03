package Jan2020;

import java.util.HashSet;
import java.util.Set;

public class FindSubSet {
	
	private static int[] nums = {12,61,5,2,9,1};
	
	public static Set<Integer> findSubSet(int begIndex,int endIndex,int targetSum,Set<String> keySet) {
		// base condition
		String key = begIndex+":"+endIndex;
		if(keySet.contains(key)) {
			Set<Integer> subSet = new HashSet<Integer>();
			return subSet;
		}
		else {
			keySet.add(key);
		}
		if(begIndex+1 == endIndex ) {
			Set<Integer> subSet = new HashSet<Integer>();
			if(targetSum-nums[begIndex]==0) {
				subSet.add(nums[begIndex]);	
			}
			
			return subSet;
		}
		
		if(begIndex+1 == endIndex ) {
			Set<Integer> subSet = new HashSet<Integer>();
			if(targetSum-nums[endIndex]==0) {
				subSet.add(nums[endIndex]);
			}			
			return subSet;
		}
		
		if(targetSum-nums[begIndex]>0) {
			Set <Integer> beginSet =  findSubSet(begIndex+1, endIndex, targetSum-nums[begIndex],keySet);
			if(beginSet!=null && beginSet.size()>0) {
				beginSet.add(nums[begIndex]);
				return beginSet;
			}
			else {
				beginSet =  findSubSet(begIndex+1, endIndex, targetSum,keySet);
				return beginSet;
			}
		}
		else if(targetSum-nums[begIndex]==0) {
			Set <Integer> beginSet  = new HashSet<Integer>();
			beginSet.add(nums[begIndex]);
			return beginSet;		
		}
		
		
		
		
		if(targetSum-nums[endIndex]>0) {
			Set <Integer> endSet =  findSubSet(begIndex, endIndex-1, targetSum-nums[endIndex],keySet);
			if(endSet!=null && endSet.size()>0) {
				endSet.add(nums[endIndex]);
				return endSet;
			}
			else {
				endSet =  findSubSet(begIndex, endIndex-1, targetSum,keySet);
				return endSet;
			}
		}
		else if(targetSum-nums[endIndex]==0) {
			Set <Integer> endSet  = new HashSet<Integer>();
			endSet.add(nums[endIndex]);
			return endSet;
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> keyset = new HashSet<String>();
		Set<Integer> subset = findSubSet(0, nums.length-1, 24,keyset);
		System.out.println(subset);
	}

}
