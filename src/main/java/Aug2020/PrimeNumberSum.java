package Aug2020;

import java.util.PriorityQueue;

public class PrimeNumberSum {

	 static class ValueHolder implements Comparable<ValueHolder> {
		 public int fromVal1;
		 public int toVal11;
		 
		 public ValueHolder(int fromValue1,int toValue1) {
			 this.fromVal1 = fromValue1;
			 this.toVal11 = toValue1;
		 }
		 
		@Override
		public int compareTo(ValueHolder o) {
			// TODO Auto-generated method stub
			return this.fromVal1=o.fromVal1 +this.toVal11-o.toVal11;
			
		}
		
	}
	public static boolean isPrime(int number) {
		double limit = Math.sqrt(number);
		for(int i=2;i<=limit;i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void findLeastSum(int nums) {
		
	 int begIndex = 2;
	 int endIndex = nums-2;
	 PriorityQueue<ValueHolder> pq = new PriorityQueue<ValueHolder>();
	  while(begIndex<=endIndex) {
		   
		  if(isPrime(begIndex) && isPrime(endIndex)) {
			  ValueHolder vh = new ValueHolder(begIndex, endIndex);
			  pq.add(vh);
		  }
		  ++begIndex;
		  --endIndex;
		}
	
	    while(!pq.isEmpty()) {
	    	 ValueHolder vh  = pq.poll();
	    	 System.out.println(vh.fromVal1);
	    	 System.out.println(vh.toVal11);
	    	 return ;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findLeastSum(10);
		
	}

}
