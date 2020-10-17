package May2020;

public class MaxProfitKTransactions {

	public static int maxProfitKTransactions(int[]nums,int k ) {
		int transactionCounter=0;
		int [] result = new int[nums.length];
		result[0]=0;
		int maxProfit = 0;
		int minimumSoFar = Integer.MAX_VALUE;
		for(int i=1;i<=nums.length-1;i++) {
			int prevPrice = nums[i-1];
			if(prevPrice<nums[i]) {
				minimumSoFar = Math.min(minimumSoFar, prevPrice);
				maxProfit = maxProfit+ nums[i]-minimumSoFar;
				result[i] = Math.max(maxProfit, result[i]);
				transactionCounter++;
				minimumSoFar = Integer.MAX_VALUE;
				
			
			}
			else {
				result[i] =0;
			}
			if(transactionCounter>k) {
				continue;
			}
		}
		return result[result.length-1];
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {5,2,4,0,1};
		maxProfitKTransactions(nums, 2);
	}

}
