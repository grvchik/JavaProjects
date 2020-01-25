package Nov2019;

import java.util.ArrayList;
import java.util.List;

public class NoOfPaths {








	
static int numOfPathsToDest (int n) {
    // base case
    if (n == 0) return 0;
    if (n == 1) return 1;

    int[] dp = new int[n];
    dp[0] = 1;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            if (j != 0) {
                dp[j] += dp[j - 1];
            }
        }
    }

    return dp[n-1];
}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.out.println(numOfPathsToDest(4));
    		
    }
	}


