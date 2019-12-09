package Oct2019;

import java.util.Arrays;

public class CoinChange {
    
	public int[] coinArray = {1,2,3};
	
	
	
	public int makeChangeBottomUp(int c) {
		int[] cache = new int[c + 1];
		for (int i = 1; i <= c; i++) {
		int minCoins = Integer.MAX_VALUE;
		// Try removing each coin from the total
		// and see which requires the fewest
		// extra coins
		for (int coin : coinArray) {
			if (i - coin >= 0) {
				int currCoins = cache[i-coin] + 1;
			    minCoins = Math.min(minCoins, currCoins); 
			}
		}
		cache[i] = minCoins;
		}
		return cache[c];
		}
	
	
	public int makeChange(int change) {

		if(change==0) {
			return 0;
			
		}
		int minCoins = Integer.MAX_VALUE;
		
		for(int coin:coinArray) {
			if ((change-coin)>=0) {
				int currMin = makeChange(change-coin);
				minCoins = Math.min(minCoins, currMin);
			}
		}
		return minCoins +1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CoinChange coin = new CoinChange();
     
   //   System.out.println(coin.makeChange(3));
      
      System.out.println(coin.makeChangeBottomUp(3));
	}

}
