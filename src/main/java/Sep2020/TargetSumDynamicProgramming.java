package Sep2020;

import java.util.Arrays;

public class TargetSumDynamicProgramming {

    public static int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int num: nums) sum += num;
        if (S > sum || -S < -sum) return 0;

        int[] dp = new int[2 * sum + 1];
        dp[sum] = 1;

        for (int num: nums) {
           System.out.println("current"+num);
           boolean operationFlag = false;
            for (int i = 0; i < dp.length; i++) {
                // Only branch out from reachable target sums\
            	if( operationFlag) {
            		break;
            	}
                if (dp[i] == 0  ) continue; 
                
                
                if(num==0) {
                	System.out.println("number is 0");
                }
                
                if(i+num>=0) {
                   dp[i+num] = 	dp[i+num] +dp[i];
                 
                   if(num!=0) {
                  	 operationFlag = true;
                  }                   
                }
                if(i-num>=0)  {
                    dp[i-num] = 	dp[i-num] +dp[i];
                    if(num!=0) {
                    	 operationFlag = true;
                    }
                   
                 }          
       
            }
         
        }

        return dp[sum + S];
        	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,3,-1,4,0,-2};
		long start = System.currentTimeMillis();
		int result = findTargetSumWays(nums, 2);
		long end = System.currentTimeMillis();
		System.out.println(result+" Time taken is "+(end-start)+" milliseconds");
	}

}
