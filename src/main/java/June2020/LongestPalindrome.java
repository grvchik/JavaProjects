package June2020;

public class LongestPalindrome {

	
	public static int findLongestPalindrome(String forward,String reverse) {
		
		char[] forwardArr = forward.toCharArray();
		char[] backwardArr = reverse.toCharArray();
		
		int[][] result = new int[forward.length()][reverse.length()];
		int max = 0;
		for(int i=0;i<result.length;i++) {			
			
			
			for(int j=0;j<result[0].length;j++) {
			    if(i==0 &&j==0) continue;	
			    
			    if(forwardArr[j]==backwardArr[i]) {
			    	if(i-1>=0 &&j-1>=0) {
			    		result[i][j]= result[i-1][j-1] + 1;
			    	}
			    	else {
			    		result[i][j]=  1;
			    	}
			    	max = Math.max(max, result[i][j]);
			    }
			}
			
		}
		
		return max;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String forward  ="banana";
		String backward ="ananab";
		int res  =findLongestPalindrome(forward, backward);
		System.out.println(res);
	}

}
