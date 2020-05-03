package Jan2020;

public class ReverseCharacters {

	
	public static String reverseString( String str) {
		  
		
		  if(str==null ||str.length()==0) {
			  return str;
		  }
		
		   char charArray[] = str.toCharArray();
		   
		    int beg = 0; 
		    int end = charArray.length-1;
		   
		    
		    while(beg<end) {
			
			char front = charArray[beg];
			char back =  charArray[end];
			
			if(Character.isLetterOrDigit(front) && Character.isLetterOrDigit(back)) {
			    swap(charArray,beg,end);
			    beg++;
			    end--;
			}
			else if(Character.isLetterOrDigit(front) && !Character.isLetterOrDigit(back) ) {
			    end--;		
			}
			else if(!Character.isLetterOrDigit(front) && Character.isLetterOrDigit(back) ) {
			    beg++;		
			}
			else {
			    beg++;
			    end--;
			}
		    
		    }		  
		     return new String(charArray);
		   }


		 public static void swap(char[] array, int beg, int end) {
		    
		    char temp = array[beg];
		    array[beg] = array[end];
		    array[end] = temp;
		 
		 }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String  str1 =" a . b $ c ";
	
	  System.out.println(str1);
	  String res1 = reverseString(str1);
	  System.out.println(res1);
	  String str2 ="Tr$ampo%l.ne";	  
	  System.out.println(str2);
	  String res2 = reverseString(str2);
	  System.out.println(res2);
	  String str3 ="G@ur@3v";	  
	  System.out.println(str3);
	  String res3 = reverseString(str3);
	  System.out.println(res3);

	  String str4 ="A@";	  
	  System.out.println(str4);
	  String res4 = reverseString(str4);
	  System.out.println(res4);

	  String str5 ="A@b";	  
	  System.out.println(str5);
	  String res5 = reverseString(str5);
	  System.out.println(res5);

	  String str6 ="fLIPP$N@";	  
	  System.out.println(str6);
	  String res6 = reverseString(str6);
	  System.out.println(res6);
	  
	  
	  String str7 =null;	  
	  System.out.println(str7);
	  String res7 = reverseString(str7);
	  System.out.println(res7);  
	  
	  
	}

}
