package Aug2020;

import java.util.Arrays;
import java.util.HashSet;

public class LonelyNumber {

	  public static int lonelyNumber2(int[] numbers) {
	        HashSet<Integer> appearances = new HashSet<Integer>();

	        for (int num : numbers) {
	            if (appearances.contains(num)) {
	                appearances.remove(num);
	            } else {
	                appearances.add(num);
	            }
	        }

	        return appearances.iterator().next();
	    }

	  public static int lonelyNumberMapReduce(int[] numbers) {
	        return Arrays.stream(numbers).reduce((int x, int y) -> (x ^ y)).getAsInt();
	    }	
	
	public static int lonelyNumber(int[] nums) {
		int minNumber = Integer.MAX_VALUE;
		int maxNumber = Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			minNumber = Math.min(nums[i], minNumber);
			maxNumber = Math.max(nums[i], maxNumber);
		}
		
		int res1=0;
		for(int i=minNumber;i<=maxNumber;i++) {
			res1 = (res1^i);
			System.out.println(res1);
		}
		System.out.println("final"+res1);
		int res2=0;
		for(int j=0;j<nums.length;j++) {
			res2 = (res2^nums[j]);
			System.out.println("final 2"+res2);
		}
		
		
		System.out.println("final  is "+(res1^res2));
		
		return res1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,1,4,7,9,4,7,1};
		int res = lonelyNumber(nums);
		int ret = lonelyNumberMapReduce(nums);
		lonelyNumber2(nums);
		System.out.println(ret);
		int ret3 = lonelyNumber2(nums);
		System.out.println(ret3);
		
	}

}
