package Dec2019;

public class FibonacciNth {

	public static int getNoOfWays(int n,int[]cache) {
		
		
		if(cache[n]!=0) {
			return cache[n];
		}
		
		if(n==0) {
			cache[0] = 1;
		}
		if(n==1) {
			cache[1] = 1;
		}
		if(n>1) {
			cache[n] = getNoOfWays(n-1,cache) +getNoOfWays(n-2,cache);
		}
		return cache[n];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cache[] = new int[5];
		int res = getNoOfWays(4,cache);
		System.out.println(res);
	}

}
