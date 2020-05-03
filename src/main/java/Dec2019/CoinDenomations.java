package Dec2019;

public class CoinDenomations {

	public static int noOfPossibilities(int[] coinDenominations,int amount) {
			
		int [] coinCoitainer = new int[amount+1];
		
		coinCoitainer[0] = 1;
		
		for(int i=1;i<coinCoitainer.length;i++) {
			int max = 0;
			for(int coin : coinDenominations) {

				int amountRemainder = i-coin;
				if(amountRemainder>=0) {
					coinCoitainer[i] = coinCoitainer[i] +coinCoitainer[amountRemainder] ;	
				}
				
				
			}
			
			
			
		}	
		System.out.println(coinCoitainer[amount]);
		return coinCoitainer[amount];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,5};
		int amount = 5;
		System.out.println(noOfPossibilities(num, amount));
	}

}
