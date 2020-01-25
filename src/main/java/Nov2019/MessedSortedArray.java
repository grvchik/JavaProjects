package Nov2019;

import java.util.PriorityQueue;

public class MessedSortedArray {
	
	 public static int[] sortKMessedArrayQueue(int[] arr, int k) {
	        int n = arr.length;

	        // create an empty min-heap
	        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

	        // build the min-heap from the first k+1 elements of arr
	        for (int i = 0; i <= k; i++) {
	            priorityQueue.add(arr[i]); // insert an element into priority queue is O(logK)
	        }

	        // extract the top element from the min-heap and assign it to the next available array index, push the next array element into the min-heap
	        for (int i = k + 1; i < arr.length; i++) {
	            arr[i - (k + 1)] = priorityQueue.poll(); // remove an element from priority queue is O(logK)
	            priorityQueue.add(arr[i]);
	        }

	        // extract all remaining elements from the min-heap and assign them to the next available array index
	        for (int i = 0; i <= k; i++) {
	            arr[n - k - 1 + i] = priorityQueue.poll();
	        }

	        return arr;
	    }

	
	
	 static int[] sortKMessedArray(int[] arr, int k) {
		    // your code goes here
		    for(int i=1;i<=arr.length-1;i++) {
		      int prevElement = arr[i-1];
		      int currElement = arr[i];
		      
		      if(currElement>=prevElement) {
		        System.out.println("Element is at correct posiition"+i);
		        continue;
		      }
		      // element is k positions ahead of its actual posiition
		      else {
		        // from this posiition to posiition-k find the minimum element
		        int endIndex = i-k;
		        if(endIndex<0) {
		          System.out.println("End index is negative"+endIndex);
		          continue;
		        }
		        else {
		         
		         int beg = i-k;
		         int end = i;
		         
		         while(beg<=end) {
		        	 if(arr[beg]>arr[end]) {
		        		 int temp = arr[beg];
		        		 arr[beg] = arr[end];
		        		 arr[end] = temp;
		        	 }
		        	 ++beg;		        	
		         }
		          System.out.println("Curr Element swapped");
		        }		        
		      } // out else		      
		    }
		    return arr;
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int num[] = {1, 4, 5, 2, 3, 7, 8, 6, 10, 9};
		      sortKMessedArrayQueue(num,2);
	}

}
