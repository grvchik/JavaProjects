package June2020;

public class FibinacciIteration {

	public static int getSum(int counter) {
		
		if(counter==0 ||counter==1) {
			return 1;
		}
		int fibo[] = new int[counter+1];
		fibo[0] = 1;
		fibo[1] = 1;
		int prevprev = 1;
		int prev = 1;
		int curr = 0;
		for(int i=2;  i<=counter;i++) {
			curr = prev +prevprev;
			fibo[i] = curr;
			prevprev = prev;
			prev = curr;
		}
		
		System.out.println(fibo);
		return fibo[counter];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = getSum(4);
		System.out.println(res);
	}

}
