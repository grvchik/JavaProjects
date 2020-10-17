package July2020;

public class MaximumProfit {

	public static int getMaximumProfit(int[]nums) {
		
		int maxProfit=0;
		int minimumSoFar=nums[0];
		int maximumSofar = 0;
		
		
		
		for(int i=0;i<=nums.length-1;i++) {
			if(i==0) {
				maximumSofar = nums[i];
				minimumSoFar = nums[i];
			}
			else {
				if(nums[i] <minimumSoFar) {
					minimumSoFar=nums[i];
					maximumSofar = nums[i];
				}
				else{
					maximumSofar = Math.max(maximumSofar, nums[i]);
					maxProfit = Math.max(maxProfit, (maximumSofar-minimumSoFar));
				}
				
			}
		}
		return maxProfit;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stockPrices = {9,11,8,5,7,10};
		int profit = getMaximumProfit(stockPrices);
		System.out.println(profit);
	}

}
