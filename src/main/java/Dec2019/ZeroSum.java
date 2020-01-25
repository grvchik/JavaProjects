package Dec2019;

import java.util.Arrays;
import java.util.HashMap;

public class ZeroSum {

	public static int[] zeroSum(int[] arr) {
	    HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();

	    int sum = 0;
	    for (int i = 0; i <= arr.length; i++) {
	        Integer oldIndex = sums.get(sum);
	        if (oldIndex == null && i == arr.length) {
	            return null;
	        } else if (oldIndex == null) {
	            sums.put(sum, i);
	            sum += arr[i];
	        } else {
	            return Arrays.copyOfRange(arr, oldIndex, i);
	        }
	    }

	    return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,-5,1,2,-1};
		int[] res = zeroSum(nums);
		System.out.println(res);
	}

}
