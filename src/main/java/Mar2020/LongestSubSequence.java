package Mar2020;

import java.util.HashSet;
import java.util.Set;

public class LongestSubSequence {

	
	public static int lengthOfLongestSubsequence(int[] nums) {


		  

		  int dp[] = new int[nums.length];
		  int longestSubsequenceLength = -1; 
		  for(int i=0;i<nums.length;i++) {
			  int longestSubsequenceSoFar = 1;
			  int current = nums[i];
			  if(current==15) {
				  System.out.println(current);
			  }
			 for(int j=0;j<i;j++) {
				
				 if (nums[j] < current) {
				        int currLongestSubsequence = dp[j];
				        longestSubsequenceSoFar = Math.max(
				          longestSubsequenceSoFar,	
				          currLongestSubsequence + 1
				        );
			 }
			  
		  }
			 dp[i] = longestSubsequenceSoFar;
			    longestSubsequenceLength = Math.max(
			      longestSubsequenceLength,
			      longestSubsequenceSoFar
			    );
		  }
		  
		  return longestSubsequenceLength;
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		                   
		long res = lengthOfLongestSubsequence(nums);
		System.out.println(res);
	}

}
