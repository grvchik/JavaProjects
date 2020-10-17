package Oct2020;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuMedian {
	 PriorityQueue < Integer > minHeap = null;
	 PriorityQueue < Integer > maxHeap = null;

	    public PriorityQueuMedian() {
	        minHeap = new PriorityQueue < > ();
	        maxHeap = new PriorityQueue < > (Comparator.reverseOrder());
	    }

	    public void addNum(int num) {
	        minHeap.offer(num);
	        maxHeap.offer(minHeap.poll());

	        if (minHeap.size() < maxHeap.size()) {
	            minHeap.offer(maxHeap.poll());
	        }
	    }

	    public double findMedian() {
	        if (minHeap.size() > maxHeap.size()) {
	            return minHeap.peek();
	        } else {
	            return (minHeap.peek() + maxHeap.peek()) / 2.0;
	        }
	    }

	    public static void main(String[] args) {
	        int[] nums = {
	            8,
	            7,
	            1,
	            5,
	            3,
	            8,
	            11,
	            6,
	            14
	        };
	        PriorityQueuMedian tht = new PriorityQueuMedian();
	        for (int i = 0; i < nums.length; i++) {
	            tht.addNum(nums[i]);
	        }

	        System.out.println(tht.findMedian());
	    }	
}
