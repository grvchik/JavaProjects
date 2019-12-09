package Nov2019;

public class DecodeString {
 public static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
 public static int[]  alphabetValue = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
	
 
  public int numOfValues(String str,int k,int begIndex) {
	  if(str.length()==0) {
		  return 0;
	  }
	  if(str.startsWith("01")) {
		  return 0;
	  }
	  
	  if(k==1) {
		  return 1;
	  }
	  
	  
	  int result= numOfValues(str, k-1,begIndex);
	  k = str.length();
	  Integer twoDigit = -1;
	  if(begIndex+2>str.length()) {
		  return result;
	  }
	  else {
		  twoDigit =Integer.valueOf(str.substring(begIndex, begIndex+2));
		  if(twoDigit>=1 && twoDigit<=26) {
			  result = result + numOfValues(str, k-2,begIndex+2);
		  }
	  }
	  return result;
	  
  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		DecodeString decodeString = new DecodeString();
		System.out.println(decodeString.numOfValues(str,str.length(),0));
	}

}
