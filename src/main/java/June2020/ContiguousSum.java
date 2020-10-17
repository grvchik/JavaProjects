package June2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContiguousSum {

	
	public static List<Integer> findContiguousArray(int [] nums,int target) {
		List<Integer> retResult = new ArrayList<Integer>();
		Map <Integer,Integer> frontSumMap = new HashMap<Integer,Integer>();
		Map <Integer,Integer> backSumMap = new HashMap<Integer,Integer>();
		
		int frontIndex = 0;
		int backIndex = nums.length-1;
		int frontSum =0;
		int backSum = 0;
		while(frontIndex<=nums.length-1 && backIndex>=0) {
			frontSum = frontSum+ nums[frontIndex];
			frontSumMap.put(frontIndex, frontSum);
			backSum = backSum + nums[backIndex];
			backSumMap.put(backIndex, backSum);
			++frontIndex;
			--backIndex;
		}
		
		for(Map.Entry<Integer, Integer> obj : frontSumMap.entrySet()) {
			if(obj.getValue()==target) {
				System.out.println("front list from 0 to" +frontSumMap.get(target));
			}
		}
		
		for(Map.Entry<Integer, Integer> obj : backSumMap.entrySet()) {
			if(obj.getValue()==target) {
				System.out.println("back list from "+obj.getKey()+" to "+(nums.length-1));
			}
		}
		

		return retResult;
 	}
	
	public static void main(String args[]) {
		int []nums = {3,2,1,4,5};
		findContiguousArray(nums, 9);
	}
}
