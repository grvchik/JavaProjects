package June2020;

public class CoinchangeBottomUp {

	public static int changePossibilitiesBottomUp(int amount, int[] denominations) {
		int [] noOfWays = new int[amount+1];
		noOfWays[0] = 1;
		
		for(int i=1;i<amount+1;i++) {
			int amountElement = i;
			System.out.println(amountElement);
			
			int minimumWays = Integer.MAX_VALUE;
			for(int j=0;j<denominations.length;j++) {
				System.out.println("denominations"+denominations[j]);
				if(denominations[j]<=amountElement) {
					
					int accurateCount = amountElement%denominations[j];
					if(accurateCount==0) {
						noOfWays[i] =  amountElement/denominations[j];
					}
					// increment by 1 and put value from remainder
					else {
						System.out.println("remainder"+(amountElement-noOfWays[i] ));
						noOfWays[i] = 1 + noOfWays[amountElement-1 ];
					}	
					minimumWays = Math.min(minimumWays, noOfWays[i]);
				}				
			}// end for loop for j
			noOfWays[i] = minimumWays;
		}
		
		return noOfWays[amount];
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int[] coins = {1,5,10};
		int possibility = changePossibilitiesBottomUp(32,coins);
		System.out.println("possibility"+possibility);
	}

}
