package Aug2020;

import java.util.HashMap;

public class PefectSquaresAlgoDaily {




	    public static int howManySquares(int n) {
	        int perfectSqNumsLength = 1;
	        while (perfectSqNumsLength * perfectSqNumsLength < n) {
	            perfectSqNumsLength++;
	        }

	        if (perfectSqNumsLength * perfectSqNumsLength > n) {
	            perfectSqNumsLength--;
	        }

	        int[] perfectSqNums = new int[perfectSqNumsLength];

	        // Fill the array backwards so we get the numbers to work with
	        for (int i = perfectSqNumsLength - 1; i >= 0; i--) {
	            perfectSqNums[perfectSqNumsLength - i - 1] = (i + 1) * (i + 1);
	        }

	        // instantiate a hashmap of possible paths
	        HashMap<Integer, Integer> paths = new HashMap<Integer, Integer>();
	        paths.put(1, 1); // 1 = 1
	        paths.put(0, 0); // 0 means you need 0 numbers to get 0

	        return numSquares(paths, perfectSqNums, n);
	    }

	    private static int numSquares(HashMap<Integer, Integer> paths, int[] perfectSqNums, int n) {
	        if (paths.containsKey(n)) {
	            // we already knew the paths to add up to n.
	            return paths.get(n);
	        }

	        int min = Integer.MAX_VALUE;
	        int thisPath = 0;

	        for (int i = 0; i < perfectSqNums.length; i++) {
	            if (n - perfectSqNums[i] >= 0) {
	                int difference = n - perfectSqNums[i];
	                // this is key - recursively solve for the next perfect square
	                // that could sum to n by traversing a graph of possible perfect square sums
	                thisPath = numSquares(paths, perfectSqNums, difference);

	                // compare the number of nodes required in this path
	                // to the current minimum
	                min = Math.min(min, thisPath);
	            }
	        }

	        min++; // increment the number of nodes seen
	        paths.put(n, min); // set the difference for this number to be the min so far

	        return min;
	    }




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = howManySquares(9);
		System.out.println(res);
	}

}
