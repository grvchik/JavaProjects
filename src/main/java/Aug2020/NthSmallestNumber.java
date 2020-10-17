package Aug2020;

import java.util.PriorityQueue;

public class NthSmallestNumber {

	
	public static int getNthNumber(int n,int[] nums) {
	  PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
	  	for(int num :nums) {
			pq.add(num);
		}
		
	  	int num= 0;
	  	while(!pq.isEmpty() && n-1>=0) {	  		
	  		num = pq.poll();
	  		n--;
	  	}
		return num;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,2,1,4,6,0,2};
		int num = getNthNumber(1, nums);
		System.out.println(num);
		
	}

}
