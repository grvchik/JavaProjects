package July2020;

public class MaximumProfitKTransactions {

	
	public static int getMaxProfit(int[] nums,int k) {
		int maxProfit = 0;
		
		int [] buyArray = new int[nums.length-1];
		int [] sellArray = new int[nums.length-1];
		
		int buyCounter=0;
		int sellCounter=0;
		for(int i=0;i<nums.length;i++) {
			if(i==0) {
				buyArray[buyCounter] = nums[i];
				buyCounter++;
			}
			else if(i==nums.length-1) {
				sellArray[sellCounter] = nums[i];
				sellCounter++;
			}
			else {
				buyArray[buyCounter] = nums[i];
				sellArray[sellCounter] = nums[i];
				buyCounter++;
				sellCounter++;
			}
		
			
		}
		boolean transactionHappened = false;
		int transactionCounter=0;
		for(int i=0;i<buyArray.length;i++) {
			int buyingPrice = buyArray[i];
			int maxprofitForThis=0;
			transactionHappened = false;
			for(int j = i;j<sellArray.length;j++) {
				int sellingPrice = sellArray[j];
				if(sellingPrice>buyingPrice) {
					maxprofitForThis = Math.max(maxprofitForThis, (sellingPrice-buyingPrice));
			
					transactionHappened=true;
				
				}
				
				
			}
			if(transactionHappened) {
				maxProfit = maxProfit+maxprofitForThis;
				transactionCounter++;
			}
		
			
		}
		if(transactionCounter==k) {
			return maxProfit;
		}	
		System.out.println("Kuch to hai");
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] stocks = {5,2,4,0,1,3};
		int profit = getMaxProfit(stocks, 2);
		System.out.println(profit);
	}

}
