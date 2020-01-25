package Oct2019;

public class CoinDenominations {

	public static int getNumOfPossobilitoes(int amount, int[]denominations) {
		
		int possibilityArray[] = new int[amount+1];
		
		possibilityArray[0] = 1;
		
		for(int coin : denominations) {
			
			for(int stepamount = coin;stepamount<=amount;stepamount++) {
				int remainderAmount = amount-stepamount;
				possibilityArray[amount] = possibilityArray[amount] + possibilityArray[remainderAmount];
			}
			
		}
		return possibilityArray[amount];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 4;
		int []denominations = {1,2,3};
		int possibilities = getNumOfPossobilitoes(amount, denominations);
		System.out.println(possibilities);
	}

}
