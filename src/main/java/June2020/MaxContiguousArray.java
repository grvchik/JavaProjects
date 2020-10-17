package June2020;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class MaxContiguousArray {

	
	public static List<Integer> findMaxContiguousArray(int[] nums) {
		Set<Integer> uniqueSet  = new HashSet<>();
		Queue<Integer> distinctQ = new LinkedList<>();
		
		
		for(int i=0;i<nums.length;i++) {
			int element = nums[i];
			if(!uniqueSet.contains(element)) {
				distinctQ.add(element);
				uniqueSet.add(element);
			}
			else {
				deleteFromQueue(distinctQ, element, uniqueSet);
				distinctQ.add(element);
				uniqueSet.add(element);				
			}
		}
		
			
			List<Integer> res = new ArrayList<Integer>();
			while(!distinctQ.isEmpty()) {
				res.add(distinctQ.poll());
			}
		 return res;
	}
	
	public static void deleteFromQueue(Queue<Integer> distinctQ, int num, Set<Integer> uniqueSet) {
		
		while(distinctQ.peek()!=num) {
			int top = distinctQ.poll();
			uniqueSet.remove(top);
		}
		uniqueSet.remove(distinctQ.poll());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums = {5,1,3,5,2,4,3,1};
		findMaxContiguousArray(nums);
	}

}
