package aug;

public class CompressString {

	public static String compress(String s) {
		
		  int sum=0;
		  char prevChar = '"';
		  StringBuffer sb = new StringBuffer();
		  for( int i=0;i<=s.length()-1;i++) {
		      
			  if(i+1==s.length()) {
				  sb.append(s.charAt(s.length()-1));
				  continue;
			  }
			  
			 if(s.charAt(i)!= prevChar) {
				 sb.append(s.charAt(i));
				 prevChar = s.charAt(i);
			 }
			 
			 
			 if(s.charAt(i)==s.charAt(i+1)) {
				 ++sum;
			 }
			 else {
				 sb.append(sum);
				 sum = 1;
			 }
			 
			 System.out.println(s.charAt(i));
			 
			
			 
		  
		  }//for
			 sb.append(sum);
		
		  return sb.toString();
		  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compress("AAAABAAAD"));
	}

}
