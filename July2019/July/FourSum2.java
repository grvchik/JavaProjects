package July;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;



public class FourSum2 {

	List<List<Integer>> retList  = new ArrayList();
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
		
		int start = 0;
		int end = nums.length-1;
		Set<String> rememberSet = new HashSet<String>();
		helper(nums, start, end, retList,rememberSet);
		System.out.println(rememberSet);
		System.out.println(retList);
		List<List<Integer>> finalList  = new ArrayList();
		rememberSet.clear();
		
		for(int i=0;i<retList.size()-1;i++) {
			List<Integer> firstPair = retList.get(i);
			for( int j = i+1;j<retList.size();j++) {
				List <Integer> secondPair = retList.get(j);
				int sum = firstPair.get(0)+firstPair.get(1)+secondPair.get(0)+secondPair.get(1);
				if(sum==0) {
					
					
					PriorityQueue<Integer> priorityQ = new PriorityQueue<Integer>();
					priorityQ.add(firstPair.get(0));
					priorityQ.add(firstPair.get(1));
					priorityQ.add(secondPair.get(0));
					priorityQ.add(secondPair.get(1));
					
					String key = priorityQ.remove()+","+ priorityQ.remove()+","+ priorityQ.remove()+","+ priorityQ.remove();
					if(!rememberSet.contains(key)) {
						List<Integer> combination = new ArrayList<Integer>(4);
						combination.add(firstPair.get(0));
						combination.add(firstPair.get(1));
						combination.add(secondPair.get(0));
						combination.add(secondPair.get(1));
						finalList.add(combination);
						rememberSet.add(key);
					}
				}
			}			
		}
		System.out.println(finalList);
		return finalList;
	}

	
	public void helper(int[] nums,int start,int end, List<List<Integer>> retList,Set rememberSet) {
		
		// base case
		if(start==end) {
			return;
		}
		
		List<Integer> pairList = new ArrayList<Integer>();
		
		String key = start+","+end;
		if(!rememberSet.contains(key)) {
			pairList.add(nums[start]);
			pairList.add(nums[end]);
			retList.add(pairList);
			rememberSet.add(key);
		}
		
		helper(nums,start+1,end,retList,rememberSet);	

		
		//System.out.print("value of start"+start);
		helper(nums,start,end-1,retList,rememberSet);
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 0, -1, 0, -2, 2,3 };
		FourSum2 fourSum = new FourSum2();
		fourSum.fourSum(nums, 0);
	}

}
