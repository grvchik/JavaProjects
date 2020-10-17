package May2020;

public class LongestPalindromic {

	public static int getLongestPalindromicString(String str) {
		
		StringBuilder   sd = new StringBuilder(str.length());
		int count = str.length()-1;
		while(count>=0) {
			sd.append(str.charAt(count));
			count--;
		}
		int length=0;
		String revString = sd.toString();
		int [][] results = new int[str.length()][str.length()];
		int rows = results.length;
		int cols = results[0].length;
		
		/**
		 *     b a n a n a s
		 *   s 
		 *   a  
		 *   n
		 *   a
		 *   n
		 *   a
		 *   b
		 */
		int max = 0;
		for(int j=0;j<cols;j++) {
		for(int i = 0;i<rows;i++) {
			
			
				
				if(i==0 && j==0) {
					results[i][j] = 0;
					
				}
				if(str.charAt(i)==revString.charAt(j)) {
					System.out.print("character at"+i+" is "+str.charAt(i));
					System.out.println("character at"+j+" is "+revString.charAt(j));
					if(i==0 || j==0) {
						results[i][j] = 1;
					}
					else {
						results[i][j] = results[i-1][j-1]+1;
					}
					
					max = Math.max(max, results[i][j]);
				}
//				else {
//					results[i][j] = results[i-1][j-1];
//				}
				
			}

		}
		
		return results[rows-1][cols-1] ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcdcb";
		           
				  
		int len = getLongestPalindromicString(str);
		System.out.println(len);
	}

}
