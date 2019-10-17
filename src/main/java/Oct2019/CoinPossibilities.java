package Oct2019;

public class CoinPossibilities {

	
	  public static int changePossibilitiesBottomUp(int amount, int[] denominations) {
		    int[] waysOfDoingNCents = new int[amount + 1];  // array of zeros from 0..amount
		    waysOfDoingNCents[0] = 1;

		    for (int coin : denominations) {
		        for (int higherAmount = coin; higherAmount <= amount; higherAmount++) {
		            int higherAmountRemainder = higherAmount - coin;
		            waysOfDoingNCents[higherAmount] += waysOfDoingNCents[higherAmountRemainder];
		        }
		    }
		    System.out.println(waysOfDoingNCents[amount]);
		    return waysOfDoingNCents[amount];
		    
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 38;
		int coins[] = {5,1,10,25};
		changePossibilitiesBottomUp(amount, coins);
	}

}
