package Jan2020;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxkArrays {

	
	 public static  int[] maxSlidingWindow(int[] nums, int k) {
	        int len = nums.length;
	        if (len == 0) return new int[0];
	        int result[] = new int[len+1-k];
	        PriorityQueue<Integer> PQ = new PriorityQueue<Integer>(Collections.reverseOrder());
	        
	        int idx = 0, start = 0;
	        for (int i = 0; i < len; i++) {
	            PQ.offer(nums[i]);
	            if (PQ.size() > k) {
	                PQ.remove(nums[start++]);
	            }
	            
	            if (i >= k-1) {
	                result[idx++] = PQ.peek();
	            }
	        }
	        
	        return result;
	    }
	
	public static int[] getMaxSubArray(int[] nums,int k) {
		int beg =0;
		int end = beg + k;
		
		if(nums.length==k) {
			return nums;
		}
		int res[] = new int[k];
		int max=Integer.MIN_VALUE;
		int i=0;
		int firstELement = -1;
		int secondELement = -1;
		int thirdELement = -1;
		while(beg <= end-1) {
			 firstELement = nums[beg];
			 if(beg+1<=end) {
				 secondELement = nums[beg+1];	 
			 }
			 if(beg+2<=end) {
				 thirdELement = nums[beg+2];	 
			 }
			 
			max =Math.max(Math.max(firstELement, secondELement),thirdELement);
			if(i<=res.length-1) {
				res[i] = max;	
			}
			
			beg++;
			i++;
			if(beg==end-1 ) {
				if(beg+k<nums.length) {
					end = beg+k	;
				}
				else {
					break;
				}
			}
		}
		System.out.println(res);
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 5, 2, 7, 8, 7};
		int[] subArray = getMaxSubArray(nums, 3);
		System.out.println(subArray);
		subArray = maxSlidingWindow(nums, 3);
		System.out.println(subArray);
	}

}
