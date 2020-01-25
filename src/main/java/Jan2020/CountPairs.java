package Jan2020;

public class CountPairs {
	  public static int numberPairs(int[] ar) {
	        int result[] = new int[101];
	        int counter=0;
	        for(int i=0;i<ar.length;i++) {
	            int index = ar[i];
	            result[index] = result[index]+1;
	            if(result[index]>=2) {
	                int temp = result[index]/2;
	              
	                	 counter = counter +temp;
	                	 result[index] =result[index]-(temp*2);
	                }
	            }
	         
	        
	        return counter;
	    }
	
	  public static void main(String g[]) {
		  int nums[] = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
		  int coounter = numberPairs(nums);
		  System.out.println(coounter);
	  }
}
