package Jan2020;

import java.util.Arrays;

public class Toys {

	
	public static int getToys(int amount, int[] prices, int fromIndex) {
		
		if(fromIndex==prices.length-1) {
			if (amount >=prices[fromIndex]) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
		if(amount<prices[fromIndex] ) {
			return 0;
		}
		
		int amountLeft = amount-prices[fromIndex];
		int noOfToys = getToys(amountLeft,prices,++fromIndex) +1;
		return noOfToys;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices = {1, 12, 5, 111, 200, 1000, 10};
		int amount = 50;
		Arrays.sort(prices);
		int toys = getToys(amount, prices, 0);
		System.out.println(toys);
	}

}
