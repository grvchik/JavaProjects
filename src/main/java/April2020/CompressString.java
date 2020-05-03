package April2020;

public class CompressString {

	public static String compressedString(String str) {
		
	  char[] charArray = str.toCharArray();
	  char prevChar = charArray[0];
	  int counter = 1;
	  StringBuffer sb = new StringBuffer();
	  for(int i = 1;i<=charArray.length-1;i++) {
		  
		  if(charArray[i]==charArray[i-1]) {
			  ++counter;
			  
				 if(i==charArray.length-1) {
					 
					  sb.append(counter).append(prevChar);
					  prevChar = charArray[i];  
				  }			  
			  
		  }

		  else {
			  sb.append(counter).append(prevChar);
			  prevChar = charArray[i];
			  counter = 1;
		  }
	  }
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AAAAAABBBBBBBCCC";
		String compare = compressedString(str);
		System.out.println(compare);
	}

}
