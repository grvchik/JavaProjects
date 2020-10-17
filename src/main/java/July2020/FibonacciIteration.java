package July2020;

public class FibonacciIteration {

	public static int getFibonacci(int n) {
		
		if(n<=1) {
			return 1;
		}
		
		int prevprev = 1;
		int prev = 1;
		int curr = 0;
		for (int i =1;i< n;i++) {
			curr = prevprev +prev;
			prevprev = prev;
			prev = curr;
		}
		return curr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = getFibonacci(4);
		System.out.println(res);
	}

}
