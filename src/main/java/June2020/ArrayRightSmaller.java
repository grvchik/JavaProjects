package June2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayRightSmaller {

	public static List<Integer> getListRightSmaller(int[] nums) {
		
		List<Integer> retList = new ArrayList<Integer>();
		Map<Integer,Integer> posValMap = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			if(i>0) {
				posValMap.put(i,nums[i]);	
			}
		}
		
		
		
		for(int i=0;i<nums.length;i++) {
			
			int counter=0;
			for(Map.Entry<Integer, Integer> obj : posValMap.entrySet())  {
				if(obj.getValue() <nums[i]) {
					++counter;
				}
			}
			retList.add(counter);
			posValMap.remove(i);
			
		}
		
		return retList;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,9,6,1};
		getListRightSmaller(nums);
	}

}
