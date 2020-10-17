package June2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayContainingDuplicates {
	public static List<Integer> findDuplicates(int[] nums) {
		Set<Integer> resultSet = new HashSet<Integer>();
        
	    for (int i = 0; i < nums.length; i++) {
	        // Translate the value into an index (1 <= x <= len(arr))
	        int index = Math.abs(nums[i]) - 1;
	            
	        // If the value at that index is negative, then we've already seen
	        // that value so it's a duplicate. Otherwise, negate the value at
	        // that index so we know we've seen it
	        if (nums[index] < 0) {
	            resultSet.add(Math.abs(nums[i]));
	        } else {
	        	nums[index] = -nums[index];
	        }
	    }
	        
	    // Return the array to it's original state
	    for (int i = 0; i < nums.length; i++) {
	    	nums[i] = Math.abs(nums[i]);
	    }
	        
	    return new ArrayList(resultSet);		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,5,4};
		List<Integer> res = findDuplicates(nums);
		System.out.println(res);
	}

}
