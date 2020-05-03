package Jan2020;

import java.util.Stack;

public class DecompressString {

	
	public static void decompressString(String input) {
		
		//2[ab] = abab
		//2[a[3[df]c]] = 2[adfdfdfc] = adfdfdfcadfdfdfc 		
		
		while(input.indexOf("[")!=-1) {
			
			//input = decompressFurther(input);
			
		}
		System.out.println(input);
	}
	       
	
	public String decompressFurther(String input) {
	    StringBuffer front = new StringBuffer();
	    StringBuffer back = new StringBuffer();
	    StringBuffer middle = new StringBuffer();
	     
	     //int 
	     return ""; 	   
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "b2[ab7[cd]]";
		String newSubStirng = input.substring(3, 10);
		System.out.println(newSubStirng);
	}

}
