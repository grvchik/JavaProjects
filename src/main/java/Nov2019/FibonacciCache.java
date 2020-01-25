package Nov2019;

public class FibonacciCache {


	
	public int getFibonacci(int i) {

		 int cache[] = new int[i+1];
		 
	

		 cache[0] = 0;
		 cache[1] = 1;
		 
		 if(i==0 ) {
		    return cache[i];
		 }
		 else {
			 return   getFibonacci(i,cache);	 
		 }
		 
		}	
	
	public int getFibonacci(int i, int cache[]) {

		  if(i<=1) {
		    return cache[i];
		  }

		 cache[i] = this.getFibonacci(i-1,cache) + this.getFibonacci(i-2,cache);
		 return cache[i];
		 
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciCache cache = new FibonacciCache();
		
		System.out.println(cache.getFibonacci(5));
	}

}
