package Jan2020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class QueueMinSwaps {

	
    static void minimumSwaps(int[] q, int currIndex, int nextIndex, Map<Integer,Integer> swapMap, Set<String> memoSet) {

    	String key = currIndex+","+nextIndex;
    	
    	if(memoSet.contains(key)){
    		
    		return;
    	}
    	else {
    		memoSet.add(key);
    	}
         
    	// base case
    	if(nextIndex == q.length-1) {
    		if(q[nextIndex]<q[currIndex]) {
    	
    			
    			swap(currIndex,nextIndex,q);	
    			updateMap(currIndex, q, swapMap);
    			updateMap(nextIndex, q, swapMap);
    		
    			
    		}	
    		return;
    	}
    	
    	
   
		if(q[nextIndex]<q[currIndex]) {

			swap(currIndex,nextIndex,q);
			updateMap(currIndex, q, swapMap);
			updateMap(nextIndex, q, swapMap);			
		}	    	
    	
    	minimumSwaps(q, ++currIndex, ++nextIndex, swapMap, memoSet);
    	if(q[currIndex]>q[nextIndex]) {
    		swap(currIndex, nextIndex, q);
    		updateMap(currIndex, q, swapMap);
			updateMap(nextIndex, q, swapMap);
    	}
    	
    
    	
    	
     }

 

    public static void updateMap(int index,int[] q, Map<Integer,Integer>swapMap ) {
		Integer currcounter = swapMap.get(q[index]);
		if(currcounter==null) {
		
			swapMap.put(q[index], 1);
			
		}
		else {
		
			swapMap.put(q[index], currcounter+1);
		}  	
    }

    
    
    public static void swap(int curIndex, int nextIndex, int[] q) {
   	int temp = q[curIndex];
    	q[curIndex] = q[nextIndex];
    	q[nextIndex] = temp;
    	
    }
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,5,3,4,7,8,6};
		Map<Integer,Integer> swapCount = new HashMap<Integer, Integer>();
		Set<String> memoSet = new HashSet<String>();
	    minimumSwaps(num,0,1,swapCount,memoSet);
	    int sum = 0;
	    for(Map.Entry<Integer, Integer> obj: swapCount.entrySet()) {
	    	
	    	Integer val = obj.getValue();
	    	if(val>2) {
	    		System.out.println("not possible");
	    	}
	    	else {
	    		sum = sum+val;
	    	}	    	
	    }
	    System.out.println(sum/2);
	}

}
