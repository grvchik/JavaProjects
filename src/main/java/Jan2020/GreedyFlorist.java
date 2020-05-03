package Jan2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GreedyFlorist {

	
	   static int getMinimumCost(int k, int[] c) {

	       int firstHalf = c.length-k;
	       Arrays.sort(c);
	       Map <Integer,Integer> friendExpenseMap = new HashMap<Integer,Integer>(); 
	        int friendCounter=1;
	       int moneySpent = 0; 
	       for(int i=c.length-1;i>=firstHalf;i--) {
	           int price = c[i];
	           friendExpenseMap.put(friendCounter, 1);
	           friendCounter++; 
	           moneySpent = moneySpent + price;
	       }
	      System.out.println(moneySpent);
	     friendCounter = 1;
	     int minValue = 1;
	     int friendMin = 1;
	    for(int i=firstHalf-1;i>=0;i--) {
	        int flowerCost = c[i];
	        //give it to first friend
	        Integer key =null;
            Integer val = null;
	        for( Map.Entry <Integer,Integer> obj : friendExpenseMap.entrySet()) {
	             key = obj.getKey();
	             val = obj.getValue();
	            
	            
	                if(val<=minValue) {
	                    friendMin = key;
	                    minValue = val;
	                    break;
	                }
	            }// end for
	            System.out.println("moneySpent+ flowerCost*(minValue+1)"+moneySpent);
	               moneySpent = moneySpent+ flowerCost*(minValue+1);
	           // now add price to sum and update map of the firned with usagecounter
	            friendExpenseMap.put(key,minValue+1);            
	        }
	      

	       return moneySpent;


	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,3,4};
		int cost = getMinimumCost(3, num);
		System.out.println(cost);
	}

}
