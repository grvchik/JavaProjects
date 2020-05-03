package Jan2020;

public class StairCase {

	
	  static int stepPerms(int n) {
	       int[] cache = new int[n+1];

	       if(n==0) {
	           return 0;
	       } 

	 
	    
	      return  stepPerms(n,cache);

	    }


	    public static int stepPerms(int n, int cache[]) {
	        if(n==1) {
		          cache[1]=1;
		       } 
		   
		      if(n==2) {
		          cache[2]=2;
		      }
		      if(n==3){
		          cache[3] = 4;
		      }
		   	    	
	        if(n<=3) {
	            return cache[n];
	        }
	        cache[n-1] = stepPerms(n-1,cache);
	        System.out.println( cache[n-1]);
	        cache[n-2] = stepPerms(n-2,cache);
	         System.out.println( cache[n-2]);
	        cache[n-3] = stepPerms(n-2,cache);
	        

	        cache[n] = cache[n-1] +cache[n-2]+cache[n-3];  
	        System.out.println( cache[n]);
	        return cache[n];
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stepPerms(4);
	}

}
