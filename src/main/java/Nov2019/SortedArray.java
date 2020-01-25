package Nov2019;

import java.util.PriorityQueue;

public class SortedArray {

	
  public void sortArray(int[] input) {
	  
	  PriorityQueue<Integer> pq = new PriorityQueue();
	  
	  for(int num :input) {
		  pq.add(num);
	  }
	  
	  int minimum = pq.poll();
	  System.out.println(minimum);
  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {6,4,8,9};
		SortedArray sa = new SortedArray();
		sa.sortArray(num);
	}

}
