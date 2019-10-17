package Oct2019;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateList {

	
	public static List<Integer> findDuplicates(int[] arr) {
	    // Use a set for results to avoid duplicates
	    Set<Integer> resultSet = new HashSet<Integer>();
	        
	    for (int i = 0; i < arr.length; i++) {
	        // Translate the value into an index (1 <= x <= len(arr))
	        int index = Math.abs(arr[i]) - 1;
	            
	        // If the value at that index is negative, then we've already seen
	        // that value so it's a duplicate. Otherwise, negate the value at
	        // that index so we know we've seen it
	        if (arr[index] < 0) {
	            resultSet.add(Math.abs(arr[i]));
	        } else {
	            arr[index] = -arr[index];
	        }
	    }
	        
	    // Return the array to it's original state
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = Math.abs(arr[i]);
	    }
	        
	    return new ArrayList(resultSet);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,2,1,2,1}; 
		
		List<Integer> duplicates = findDuplicates(nums);
		System.out.println(duplicates);
		
	}

}
