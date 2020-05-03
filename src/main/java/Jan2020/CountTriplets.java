package Jan2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {

	 static long countTriplets(List<Integer> arr, long r) {
		    long retCounter=0;
		    Map<Integer,Integer> countMap = new HashMap<Integer,Integer>(); 
		  
		    for(int num :arr) {		    	
		    	if(countMap.get(num)==null) {		    		
		    		countMap.put(num,1);
		    	}
		    	else {
		    		countMap.put(num,countMap.get(num)+1);
		    	}		    	
		    }
		    
		   
		    for(int num :arr) {
		    	System.out.println(num);
		    	
		    	int multiple = (int)(num*r);
		    	int nextMultiple =(int) (multiple*r);
		    	if(countMap.containsKey(multiple) && countMap.containsKey(nextMultiple)) {
		    		retCounter = retCounter+countMap.get(multiple);
		    	}
		    	
		    }
		    
		       return retCounter;
		    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> retList = new ArrayList<Integer>();
		retList.add(1);
		retList.add(2);
		retList.add(2);
		retList.add(4);
		//retList.add(27);
		//retList.add(81);
		long res = countTriplets(retList, 2);
		System.out.println(res);
	}

}
