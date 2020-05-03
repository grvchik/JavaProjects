package Feb2020;

import java.util.ArrayList;
import java.util.List;

public class RiddleArray {
	   static long[] riddle(long[] arr) {
	        // complete this function
	     List<Long> retArrayList = new ArrayList<Long>();

	     // take care of one element
	     long max = Long.MIN_VALUE;
	     long min = Long.MAX_VALUE;;
	     for(int i=0;i<arr.length;i++) {
	         max = Math.max(max, arr[i]); 
	         min = Math.min(min, arr[i]);
	     }   

	    retArrayList.add(max);
	    retArrayList.add(min);

	    if(arr.length <3) {
	       toLongArray(retArrayList) ;  
	    }

	    int size = 2;

	    

	    while(size<=arr.length-1) {
	        System.out.println("Find array of size"+size);
	        List <Long> arraySet = new ArrayList<Long>(size);
	        int begIndex = 0;
	        int endIndex = begIndex+size-1;
	        while(endIndex<=arr.length-1) {
	            min = Long.MAX_VALUE;
	            System.out.println("size"+size);
	           for(int k=begIndex;k<=endIndex;k++) {
	                System.out.println("element added"+arr[k]);
	               min = Math.min(min,arr[k]);
	               System.out.println("min added"+min);	            
	           }
	           arraySet.add(min);	
	            ++begIndex;
	            ++endIndex;
	        }
	        
	            max = Long.MIN_VALUE;
	            for(int f = 0;f<arraySet.size();f++) {
	                 max  = Math.max(max, arraySet.get(f));
	                  System.out.println("max value added"+max);
	            }
	            retArrayList.add(max); 	        
	        ++size;
	    }

	    

	     return toLongArray(retArrayList) ;  

	    }


	   public static long[] toLongArray(List<Long> intList){
	       long[] res = new long[intList.size()];
	       int i=0;
	       for(Long val: intList) {
	           res[i++] = val;
	       }
	     return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long [] nums = {2,6,1,12};
		riddle(nums);
	}

}
