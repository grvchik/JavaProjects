package April2020;

public class CoinChange {

	public static void getChange(int amount) {
		
		int []res = new int[amount+1];
		int coins[] = {1,5,10,25};
		res[0] = 1;
		
		for(int j = 1;j<res.length;j++) {
		  int maxvalue=0;	
			for(int i=0;i<=coins.length;i++) {
				int amountRemainder = j-coins[i];
				if(amountRemainder>=0) {
					res[i] = res[i] +res[amountRemainder] ;	
				}
					
				
			}		
		
		}
		System.out.println(res[amount]);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
       int amount = 3;
       getChange(amount);
	}

}
