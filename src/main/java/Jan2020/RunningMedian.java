package Jan2020;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class RunningMedian {

	
	
	public static int  addNumberAndGetMedian(PriorityQueue<Integer> low,PriorityQueue<Integer> high,int num) {
	
		
		if(low.isEmpty()&& high.isEmpty()) {
			low.add(num);
			return getMedian(low, high);
		}
		
	
		if(low.size()==1 && high.size()==0) {
			if(num<low.peek()) {
				high.add(low.poll());
				low.add(num);
			}
			else {
				high.add(num);
			}
			return getMedian(low, high);
		}
		
		//Now priority queue are of same length
		 int difflow = Math.abs(num-low.peek());
		 int diffhigh = Math.abs(num-high.peek());
		 
		
		   if(diffhigh<difflow) {
			   if(high.size()>low.size()) {
				   low.add(high.poll());
			   }
			   
				   high.add(num);   
			   
		   }
		   else {
			   if(high.size()>low.size()) {
				   high.add(low.poll());
			   }
			   low.add(num);
			   
		   }
			
	
		
		return getMedian(low,high);
	}
	
	
	public static int getMedian(
			PriorityQueue<Integer> lowBucket,
			PriorityQueue<Integer> highBucket )
								
	{
		if (lowBucket.size()==0)
		{
			return highBucket.peek();
		}
		
		if(highBucket.size()==0) {
			return lowBucket.peek();
		}
		
		
		if(lowBucket.size()>highBucket.size()) {
			return lowBucket.peek();
		}
		
		if(lowBucket.size()<highBucket.size()) {
			return highBucket.peek();
		}
		
		
		
		
		return ( lowBucket.peek() + highBucket.peek() )/2;
		
	}
	
	
	public static void calculateMedian() {
		
		int[] nums = {2,4,8,6,10,14};
		PriorityQueue<Integer> low = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> high = new PriorityQueue<Integer>();
		
		for(int i=0;i<nums.length;i++) {
			
			int number = nums[i];
		//	high.add(number);
		//	low.add(number);
			int median = addNumberAndGetMedian(low, high, number);
			System.out.println(median);
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateMedian();
	}

}
