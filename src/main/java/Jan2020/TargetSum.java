package Jan2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TargetSum {

	public static void targetSumCount(Integer begIndex,Integer endIndex, int target, int[] nums, Set<String> keySet,List<Integer> count) {

		 if(begIndex>=endIndex) {
		    return;
		 }


		String key = begIndex+","+endIndex;
	
		if(keySet.contains(key)) {
			
		    return;
				}
				else {
			 keySet.add(key);
			}
		 if(Math.abs(nums[begIndex]-nums[endIndex])==target) {
			 if(count.size()==0) {
				 count.add(1);
			 }
			 else {
				 count.set(0, count.get(0)+1);
			 }
		  }
		 
		
		 

		 int newIndex = endIndex-1;
		 targetSumCount(begIndex,newIndex,target,nums,keySet,count);
		 
		 newIndex = begIndex+1;
			 targetSumCount(newIndex,endIndex,target,nums,keySet,count);	 

		 
		
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <String> keySet = new HashSet<String>();
		int nums[] = {2,5,3,4,1};
		int target = 2;
		List<Integer> count = new ArrayList<Integer>();
		targetSumCount(0, nums.length-1,target, nums, keySet, count);
		System.out.print(count.get(0));
	}
	

}
