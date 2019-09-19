package aug;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubString {

 public static String longestCommonString(String arr1,String arr2){	

    Map<Integer,String> commonStringMap = new HashMap<Integer,String>();

      int minLength = arr1.length()>=arr2.length()?arr2.length():arr1.length();
      int maxSoFar = 0;
	StringBuffer sb = new StringBuffer();	
	 for(int i=0;i<minLength;i++) {
	   sb.append(arr1.charAt(i));		
	   if(arr2.indexOf(sb.toString())!=-1) {
	    maxSoFar = Math.max(maxSoFar,sb.toString().length());
	    commonStringMap.clear();
	    commonStringMap.put(maxSoFar,sb.toString());
	   }
	   else {
	    sb.delete(0,sb.length());
	    sb.append(arr1.charAt(i));
	    
	     if(arr2.indexOf(sb.toString())!=-1) {
	        
	        if(sb.toString().length() >maxSoFar) {
	        commonStringMap.clear();
	        }
	      
	        maxSoFar = Math.max(maxSoFar,sb.toString().length());	        
	        if(sb.toString().length()>maxSoFar) {
	        	commonStringMap.put(maxSoFar,sb.toString());
	        }
	    	
	     }
	   }
       }
	 if(commonStringMap.size()>0) {
		 return commonStringMap.get(maxSoFar);	 
	 }
	 
	 return "";
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr1 = "DBAAD";
		String arr2 = "CHEVAAD";
		
		String common = longestCommonString(arr1, arr2);
		System.out.println(common);
		
	}

}
