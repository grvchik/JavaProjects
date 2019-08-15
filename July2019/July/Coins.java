package July;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coins {

	static class Item {
		int value;
		int weight;
		
		Item(int value,int weight) {
			this.value = value;
			this.weight = weight;
		}
	}
	
	
	public static int getCoins(int number) {
		int numCoins = 0;
		int []denomination = {25,10,5,1};
		if(number==0) {
			return numCoins;
		}
		
		int remainder = number;
		int i=0;
		while(remainder>0) {
			int divResult = remainder/denomination[i];
			remainder = remainder - (divResult*denomination[i]);
			numCoins+=divResult;
			if(i<=denomination.length) {
				i++;	
			}
			
		}
		
		return numCoins;
	}
	
	
	public int getPossibilitiesTopDown(int amountLeft, int currentIndex,int[]denominations) {
		 // base cases:
	    // we hit the amount spot on. yes!
	    if (amountLeft == 0) {
	        return 1;
	    }

	    // we overshot the amount left (used too many coins)
	    if (amountLeft < 0) {
	        return 0;
	    }

	    // we're out of denominations
	    if (currentIndex == denominations.length) {
	        return 0;
	    }

	    System.out.printf("checking ways to make %d with %s\n",
	        amountLeft, Arrays.toString(Arrays.copyOfRange(denominations,
	        currentIndex, denominations.length)));

	    // choose a current coin
	    int currentCoin = denominations[currentIndex];

	    // see how many possibilities we can get
	    // for each number of times to use currentCoin
	    int numPossibilities = 0;
	    while (amountLeft >= 0) {
	        numPossibilities += getPossibilitiesTopDown(amountLeft,currentIndex + 1, denominations );
	        amountLeft -= currentCoin;
	    }

	    return numPossibilities;
	}
	
	
	public static int changePossibilitiesBottomUp(int amount, int[] denominations) {
	    int[] waysOfDoingNCents = new int[amount + 1];  // array of zeros from 0..amount
	    waysOfDoingNCents[0] = 1;

	    for (int coin : denominations) {
	        for (int higherAmount = coin; higherAmount <= amount; higherAmount++) {
	            int higherAmountRemainder = higherAmount - coin;
	            waysOfDoingNCents[higherAmount] += waysOfDoingNCents[higherAmountRemainder];
	        }
	    }

	    return waysOfDoingNCents[amount];
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item quarter = new Item(25,25);
		Item dime =  new Item(10,10);
		Item cent = new Item(1,1);
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(quarter);
		itemList.add(dime);
		itemList.add(cent);
		int[] denominations = {1,10,25};
		int capacity = 31;
		Coins coin = new Coins();

		
		int res = getCoins(65);
		int res2 = coin.getPossibilitiesTopDown(capacity, 0, denominations);
		System.out.println(res2);
	}

}
