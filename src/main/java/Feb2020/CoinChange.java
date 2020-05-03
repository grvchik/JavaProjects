package Feb2020;

public class CoinChange {

	  public static int changePossibilitiesBottomUp(int amount, int[] denominations) {
		    int[] waysOfDoingNCents = new int[amount + 1];  // array of zeros from 0..amount
		    waysOfDoingNCents[0] = 1;
		    for (int higherAmount = 1; higherAmount <= amount; higherAmount++) {
		   
		    	int minValue = Integer.MAX_VALUE;
		    	 for (int coin : denominations) {
		            if(higherAmount >=coin) {
		            	if(higherAmount%coin==0) {
		            		if(higherAmount==10) {
		            			System.out.println(higherAmount);
		            		}
		            		waysOfDoingNCents[higherAmount] = higherAmount/coin;;
		            	}
		            	else {
		            		waysOfDoingNCents[higherAmount] = 1+ waysOfDoingNCents[higherAmount-1]; 
		            	}
		            	minValue = Math.min(minValue, waysOfDoingNCents[higherAmount]);
		            }
		        }
		        waysOfDoingNCents[higherAmount] = minValue;
		    }

		    return waysOfDoingNCents[amount];
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int[] coins = {1,5,10};
		int possibility = changePossibilitiesBottomUp(32,coins);
		System.out.println(possibility);
	}

}
