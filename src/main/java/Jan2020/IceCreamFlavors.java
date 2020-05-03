package Jan2020;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class IceCreamFlavors {

	public static void printFlavors(int[]cost, int money) {
		
		int []reversecost = Arrays.copyOf(cost, cost.length);
	   Map<Integer,Integer> valPosition = new HashMap<Integer, Integer>();
	   Arrays.sort(reversecost);
	   
	   for(int i=0;i<cost.length;i++) {
		   valPosition.put(cost[i], i);
	   }
	   
	   int beg = 0; int end = reversecost.length-1;
	  PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	
	   
	   while(beg<end) {
		   if(reversecost[beg]+reversecost[end]==money) {
			   int firstVal = valPosition.get(reversecost[beg]);
			   int secondVal = valPosition.get(reversecost[end]);
			   pq.add(firstVal);
			   pq.add(secondVal);
			   beg++;
			   end--;
		   }	
		   else if(reversecost[beg]+reversecost[end]>money) {
			   end--;
		   }
		   else {
			   beg++;
		   }
	   }
	   
	  
		   int firstVal = pq.poll()+1;
		   int secondVal = pq.poll()+1;
		   
		   System.out.println(firstVal+" "+secondVal);
	  
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int [] nums = {1,4,5,3,2};
		printFlavors(nums, 5);
		
		int[] unordered = {7,5,3,2,9};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int num:unordered) {
			pq.add(num);
		}
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}

}
