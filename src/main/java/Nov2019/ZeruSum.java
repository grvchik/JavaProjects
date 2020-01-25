package Nov2019;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZeruSum {

	public int[] zeroSumArray(int[] nums) {
		
		Map<Integer,Integer> valueIndex = new HashMap<Integer, Integer>();
		int sum = 0;
		
		for(int i=0;i<nums.length;i++) {
			
			Integer oldIndex = valueIndex.get(sum);
			if(oldIndex==null && i==nums.length-1) {
				return null;
			}
			else if(oldIndex==null) {
				valueIndex.put(sum,i );
			}
			else {
				return Arrays.copyOfRange(nums, oldIndex, i);
			}
		}
		
		return null;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
