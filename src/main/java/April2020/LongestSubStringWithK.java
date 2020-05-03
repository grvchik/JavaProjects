package April2020;

public class LongestSubStringWithK {

	
	public static int getLongest(String str, int k){
		int max = Integer.MIN_VALUE;
		 getLongestFrom(str,0,str.length()-1,k,max);
	   
		return max;
	}
	
	
	
	public static void getLongestFrom(String str,int fromIndex,int endIndex,int k,int max) {
		if(fromIndex==str.length()-1) {
			return ;
		}
		int count = 1;
		StringBuffer sb = new StringBuffer();
		
		for(int i=fromIndex;i<=str.length()-1;i++) {
			sb.append(str.charAt(i));
			if(i-1>=0) {
				char prevchar = str.charAt(i-1);
				if(count==k) {
					
					max = Math.max(max, sb.length());
					 getLongestFrom(str, fromIndex+1, endIndex, k, max);
				}
				if(str.charAt(i)==prevchar) {
					
					continue;
				}
				else {
					count++;	
					
				}
			}
		}
		

		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bchaamnbhai";
		int k = 4;
		int res = getLongest(str, k);
		System.out.println(res);
	}

}
