package May2020;

public class CoinChange {

	public static int minimumNumber = Integer.MAX_VALUE;
	
	
	public static int getMinimumCoins(int amount,int []coins) {
		
	
		int []result = new int[amount+1];
		
		result[0] = 1;
		
		for(int i=1;i<=amount;i++) {
			int min = Integer.MAX_VALUE;;
			for(int j=0;j<coins.length;j++) {
				
				if (i>=coins[j]) {
				
					if(i%coins[j]==0) {
						result[i] = i/coins[j];
					}
					else{
						result[i] = 1+result[i-coins[j]];
					}
					min = Math.min(min, result[i]);
				}
				
			}
			result[i] = min;
		}
		
		return result[amount];
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] coins = {1,2,5,10,25};
       int amount = 6;
       int minimum = getMinimumCoins(amount, coins);
       System.out.println(minimum);
	}

}
