package Jan2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class MinimumSwapsToSortArray {

	
	public static int getMinimumSwaps(int[] nums) {
		
		Map<Integer,Integer> locMap = new HashMap<Integer, Integer>();
		Map<Integer,Integer> destinationMap = new HashMap<Integer, Integer>();
		buildExpectedOrderMap(locMap,  nums);
		destinationMap = buildDistanceOrderMap(locMap, nums);
		List<Integer> counterList = new ArrayList<Integer>();
	
		checkSorting(0,nums.length-1,nums,destinationMap,locMap,counterList);
		
		return -1;
	}
	
	
	
	public static void checkSorting(int begIndex,int endIndex,int nums[],
			Map<Integer,Integer> destinationMap,
			Map<Integer,Integer> locMap,
			List<Integer> counterList) {
		
		if(begIndex>=endIndex || destinationMap.isEmpty()) {
		   return ;	
		}
		
		// if left element at correct posisition then increment left counter
		if(destinationMap.get(nums[begIndex])==0) {
			checkSorting(++begIndex,endIndex,nums,destinationMap,locMap,counterList);
		}

		if(destinationMap.get(nums[endIndex])==0) {
			checkSorting(begIndex,--endIndex,nums,destinationMap,locMap,counterList);
		}
	    int currenIndexOfBeg = destinationMap.get(nums[begIndex]);
	    int currentIndexOfEnd = destinationMap.get(nums[endIndex]);
	    int proposedIndexOfBeg = endIndex-locMap.get(nums[begIndex]);
	    int proposedIndexOfEnd = begIndex-locMap.get(nums[endIndex]);

	    int currDelta = currenIndexOfBeg+currentIndexOfEnd;
	    int proposedDelta = proposedIndexOfBeg+proposedIndexOfEnd;
	    
	    if(currenIndexOfBeg==0) {
	    	checkSorting(++begIndex,endIndex,nums,destinationMap,locMap,counterList);
	    }
	    
	    if(currentIndexOfEnd==0) {
	    	checkSorting(begIndex,--endIndex,nums,destinationMap,locMap,counterList);
	    }
	    
	    if(nums[begIndex]>nums[endIndex] &&  Math.abs(currDelta)>=Math.abs(proposedDelta)) {
	    	swap(begIndex, endIndex, nums);
	    	updateDisplacementMap(begIndex, endIndex, locMap, destinationMap, nums);
	       }
	    
    	checkSorting(begIndex,--endIndex,nums,destinationMap,locMap,counterList);
    	checkSorting(++begIndex,endIndex,nums,destinationMap,locMap,counterList);  
	}
	
		
	
   public static void swap(int begIndex,int endIndex,int[]nums) {
	   int temp = nums[begIndex];
	   nums[begIndex] = nums[endIndex];
	   nums[endIndex] = temp;
   }
		
	public static Map buildDistanceOrderMap(Map<Integer,Integer> locMap,int [] nums) {
		Map <Integer,Integer> displaceMap = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			
			int element = nums[i];
			int expectedPoisition = locMap.get(element);
			int displacement = i-expectedPoisition;
			displaceMap.put(element, displacement);
		}
		return displaceMap;
	}
	
	
	public static void updateDisplacementMap(int beg, int end, 
			Map<Integer,Integer> locMap,
			Map<Integer,Integer> displaceMap,int [] nums
			) 
	{
	
		int elementBeg = nums[beg];
		int actualBegPosiition = beg;
		int elementEnd = nums[end];
		int actualEndPosition = end ;
		int expectedBegPosition = locMap.get(elementBeg);
		int expectedEndPosition = locMap.get(elementEnd);
		if(expectedBegPosition-actualBegPosiition==0) {
			displaceMap.remove(elementBeg);
		}
		
		if(expectedEndPosition-actualEndPosition==0) {
			displaceMap.remove(elementEnd);
		}
		
		displaceMap.put(elementBeg,expectedBegPosition-actualBegPosiition);
		displaceMap.put(elementEnd,expectedEndPosition-actualEndPosition);
	}
	
	
	public static void buildExpectedOrderMap(Map<Integer,Integer> locMap,  int[] nums) {
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>(
				 new Comparator<Integer>() {

					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o2.intValue()-o1.intValue();
					}
				}				
				);
		for(int num:nums) {
			pqueue.add(num);
		}
		
		while(!pqueue.isEmpty()) {
			int posiition= pqueue.size()-1;
			int key = pqueue.poll();
			locMap.put(key, posiition);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {6,2,3,4,9,8};
		getMinimumSwaps(nums);
	}

}
