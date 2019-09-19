package aug;

import java.util.HashSet;
import java.util.Set;

public class ShortestUniqueString {
	

		public  static String getShortestUniqueSubstring(char[] arr, String str) {	
		StringBuffer frontString = new StringBuffer();
		StringBuffer backString = new StringBuffer();
		
		if(str==null || str.length()==0) return ""; 
		
		if(arr==null || arr.length==0) return str;
		
		
		int frontCounter=0;
		int backCounter = 0;
		int head = 0;
		int tail = str.length()-1;
		String arrStr = new String(arr);	

		while(head <= tail) {
		
		char headChar = str.charAt(head);
		if((arrStr.indexOf(headChar)!=-1) && (frontString.toString().indexOf(headChar))==-1){
		  frontString.append(str.charAt(head));
		  ++frontCounter;
		}
		else {
		  frontCounter=0;
		  frontString.delete(0,frontString.length());
		}

		char tailChar = str.charAt(tail);
		if((arrStr.indexOf(tailChar))!=-1 && (backString.toString().indexOf(tailChar))==-1) {
		  backString.append(str.charAt(tail));
		  ++backCounter;
		} 
		else {
		  backCounter=0;
		  backString.delete(0,backString.length());
		}



		if(frontCounter==arr.length || backCounter==arr.length) {
		   head = tail;
		}

		
		++head;
		--tail;
		}
		
		if(frontString.length()==arr.length) {
			return frontString.toString();
		}
		
		if(backString.length()==arr.length) {
			return backString.reverse().toString();
		}
		
		return "";}

		  public static void main(String[] args) {
		    char arr[] = {'c','a','n','o'};
		    String c = "chamanchoocan";
		   String ret =  getShortestUniqueSubstring(arr,c);
		   System.out.println(ret);
		  }
}
