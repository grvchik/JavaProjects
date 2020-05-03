package Jan2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProperPalindrome {

	
    static long substrCount(int n, String s) {

        long res = (long)n;
        int beg=0;
        int end = s.length();
        List<Integer> countList = new ArrayList<Integer>();
        Set<String> keySet = new HashSet<String>();
      
        findProperPalindrome(beg,end,s,countList,keySet);

        Integer val = 0;
        if(countList.size()>0) {
            val = countList.get(0);
        }
        res = res+val;
        return res;
    }


   static void findProperPalindrome(int begIndex, int endIndex,
   String s,List <Integer>countList,Set<String> keySet) {
	   
	String key =   begIndex+","+endIndex; 
    if(begIndex==endIndex || begIndex+1==endIndex) {
        return;
    }
 
    if(keySet.contains(key)){
      return;	
    }
    else {
    	keySet.add(key);
    }
    String subStr = s.substring(begIndex, endIndex);
    if(isProperPalindroms(subStr)) {
        if(countList.size()==0) {
           countList.add(1); 
        }
        else {
            Integer val = countList.get(0);
            countList.set(0, ++val);
        }
    }
    findProperPalindrome(begIndex+1,endIndex,s,countList,keySet);

    findProperPalindrome(begIndex,endIndex-1,s,countList,keySet);
   } 
	
	
	   static boolean isProperPalindroms(String s) {
	       String lastBeg="";
	       String lastEnd="";

	       int beg = 0;
	       int end = s.length()-1;
	       boolean res = true; 
	       boolean isOddLength = s.length()%2!=0?true:false;
	        String []strArray = s.split("");
	        while(beg<=end) {
	            if(strArray[beg].equals(strArray[end]) ) {
	                if(lastBeg!="" && lastEnd!="" 
	                 && lastBeg.equals(strArray[beg]) && lastEnd.equals(lastEnd) ) {
	                     System.out.println(strArray[beg]);
	                      ++beg;
	                      --end;  
	                 }
	                else {
	                    if(lastBeg=="" && lastEnd=="") {
	                    	lastBeg = strArray[beg];
	                    	lastEnd = strArray[end];
	                    	++beg;
	                    	--end;
	                    }
	                    else {
	                    	if(beg==end ||beg +1==end) {
	                    		return true;
	                    	}
	                    	else {
	                    		return false;	
	                    	}
	                    		
	                    }
	                    
	                }
	            }
	            else {
	                return false;
	            }

	           if(!isOddLength && beg +1==end) {
	               break;
	           } 
	        }
	     
	        return res;

	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String s = "abcbaba";
	  long res = substrCount(s.length(), s);
	  System.out.println(res);
	  
			  
	}

}
