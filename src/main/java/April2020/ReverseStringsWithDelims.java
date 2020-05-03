package April2020;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseStringsWithDelims {

	public static String reverseStringWithDelimitors(String str) {
		
		 String[] arrOfStr = str.split("[/:]+"); 
		 
		 String[] resultStr = new String[arrOfStr.length];
		 
		 
		 int beg = 0;
		 int end = resultStr.length-1;
		 
		 while(beg <= end) {
			 
			String first = arrOfStr[beg];
			String last = arrOfStr[end];
			resultStr[beg] = last;
			resultStr[end] = first;
			beg++;
			end--;
		 }
		 
		 System.out.println(resultStr);
		
		 char[] res = str.toCharArray();
		 
		 Queue<Character> specialSymbols = new LinkedList<Character>();
		 
		 for(char ch: res) {
			 if(!Character.isAlphabetic(ch)) {
				 specialSymbols.add(ch);
			 }
		 }
		 
		 StringBuilder sd = new StringBuilder();
		 for(String resStr: resultStr) {
			 sd.append(resStr);
			 if(!specialSymbols.isEmpty()) {
				 sd.append(specialSymbols.poll());	 
			 }
			 
		 }
		 

		 
		 return sd.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello/world:here/";
		reverseStringWithDelimitors(input);
	}

}
