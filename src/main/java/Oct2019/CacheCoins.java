package Oct2019;

public class CacheCoins {

	public int[] coins = {1,2,5};
	public int makeChange(int c) {
		int[] cache = new int[c + 1];
		for (int i = 1; i <= c; i++) {
		int minCoins = Integer.MAX_VALUE;
		// Try removing each coin from the total
		// and see which requires the fewest
		// extra coins
		for (int coin : coins) {
		if (i - coin >= 0) {
		int currCoins = cache[i-coin] + 1;
		 minCoins = Math.min(minCoins, currCoins);	
		}
		}
		cache[i] = minCoins;
		}
		return cache[c];	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CacheCoins coins = new CacheCoins();
      coins.makeChange(3);
     
	}

}
