package Aug2020;

import java.util.Deque;
import java.util.LinkedList;

public class HistogramUsingStack {

	
	public static int getLargestArea(int[] nums) {
		Deque<Integer> stack = new LinkedList<Integer>();
		int laregestArea = Integer.MIN_VALUE;
		int currentArea = nums[0];
		stack.push(nums[0]);
		laregestArea = Math.max(laregestArea, currentArea);
		int widthcounter=0;
		for(int i=1;i<nums.length;i++) {
			++widthcounter;
			int currElement = nums[i];
		    if(stack.isEmpty()) {
		    	stack.push(currElement);
		    	continue;
		    }
			int currTop = stack.peek();
			if(currTop<currElement) {
					while(!stack.isEmpty()) {
						currTop = stack.pop();
						int minHeight = Math.min(currTop, currElement);
					
						currentArea = minHeight*widthcounter;
						laregestArea = Math.max(laregestArea, currentArea);				
					}
					widthcounter=0;
				
			}
			else {
				stack.push(currElement);
			}
			System.out.println("Calculate max area using"+nums[i]);
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,1,4,2,2,2};
		int area = getLargestArea(nums);
	}

}
