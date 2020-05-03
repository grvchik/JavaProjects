package Feb2020;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DuplicateArrayFronOriginalInN {

	public static List<Integer> findDuplicates(int[] nums) {
		
		List<Integer> res = new ArrayList<Integer>();
	
		for (int i=0;i<nums.length;i++) {
			
			int index = Math.abs(nums[i]) - 1;
			
			if(nums[index]<0) {
				res.add(Math.abs(nums[index]));
			}
			else {
				nums[index] = -nums[index];
			}			
			
		}
		 
		 return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = { 2,1,2,1};
		findDuplicates(nums);
		
		Queue<Integer> deq = new LinkedList<Integer>();
		deq.add(2);
		deq.add(3);
		System.out.println(deq.poll());
		
	}

}
