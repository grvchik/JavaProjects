package Feb2020;

import java.util.Collections;

public class MinimumAnagarams {

	  public static int minSteps(String s, String t) {
	      int [] array1 = new int[256];
	      int counter=0;
	      
	      char[] str1Array = s.toCharArray();
	      char[] str2Array = t.toCharArray();
	      for(int i=0;i<str1Array.length;i++) {
	    	  int value = str1Array[i];
	    	  array1[value] = array1[value]+1;
	      }
	      for(int j=0;j<str2Array.length;j++) {
	    	  int value = str2Array[j];
	    	  //System.out.println(str2Array[j]);
	    	  array1[value] = array1[value]-1;
	    
	      }	      
	      
	      for(int j=0;j<str2Array.length;j++) {
	    	  int value = str2Array[j];
	    	  if( array1[value]!=0) {
	    		  ++counter;
	    	  }
	    
	      }	     

	      
	      return counter;
	    }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "practice";
		String str2 = "leetcode";
		int res =minSteps(str1, str2);
		System.out.println(res);
		
	}

}
