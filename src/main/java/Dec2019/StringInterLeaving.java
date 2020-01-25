package Dec2019;

public class StringInterLeaving {

	public static boolean isInterLeavingProper(String str1,String str2,String interlevaed) {
		
		
     int loopLength = 0;
     if(str1==null && str2==null) {
    	 return false;
     }
     
     if((str1==null || str1.length()==0 ) && (str2!=null && str2.length()>0)) {
    	 loopLength= str2.length();
     }
     if((str2==null || str2.length()==0 ) && (str1!=null && str1.length()>0)) {
    	 loopLength= str1.length();
     }		
		
     if(str1!=null && str2!=null) {
    	 loopLength = ( str1.length() < str2.length())?str1.length() :str2.length();
    	 
     }
     
     
     for(int i=1;i<=loopLength-1;i++) {
    	
    	 int currChar1 = str1.charAt(i);
    	 int prevChar1 = str1.charAt(i-1);
       	 int currChar2 = str2.charAt(i);
    	 int prevChar2 = str2.charAt(i-1);   
    	 
    	 if(interlevaed.indexOf(currChar1)<interlevaed.indexOf(prevChar1)) {
    		 return false;
    	 }
    	 
    	 if(interlevaed.indexOf(currChar2)<interlevaed.indexOf(prevChar2)) {
    		 return false;
    	 }   	 
     }
     return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = "def";
		String interleaved = "bdaecf";
		System.out.println(isInterLeavingProper(str1, str2, interleaved));
	}

}
