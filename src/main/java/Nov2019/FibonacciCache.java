package Nov2019;

public class FibonacciCache {


	
	public int getFibonacci(int i) {

		 int cache[] = new int[i+1];

		 cache[0] = 1;
		 cache[1] = 1;
		 
		 if(i==0 || i ==1) {
		    return 1;
		 }
		 return   getFibonacci(i,cache);
		}	
	
	public int getFibonacci(int i, int cache[]) {

		  if(cache[i]!=0) {
		    return cache[i];
		  }

		 cache[i] = this.getFibonacci(i-1,cache) + this.getFibonacci(i-2,cache);
		 return cache[i];
		 
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciCache cache = new FibonacciCache();
		
		System.out.println(cache.getFibonacci(4));
	}

}
