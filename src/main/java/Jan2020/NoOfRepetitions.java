package Jan2020;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NoOfRepetitions {

	
	public static int counter(String input, int extended) {
		
		if(input==null ||input.length()==0) {
			return 0;
		}
		int counter=0;
		char[] elemArray = input.toCharArray();
		for(int i=0;i<elemArray.length;i++) {
			
			if(String.valueOf(elemArray[i]).equalsIgnoreCase("a")) {
				counter++;
			}			
		}		
		
		int  multiple = extended/input.length();
		
		counter = counter*multiple;
		
		int remainder = extended%input.length();
		
		int beg = 0;
		while(beg <remainder) {
			if(String.valueOf(elemArray[beg]).equalsIgnoreCase("a")) {
				counter++;
			}			
			
			beg++;
		}
		
		
		return counter; 
	}
	
	
	public static void countCharacters(String s,char c,Set<Integer> countSet) {
		char elemArray[]= s.toCharArray();
		for(int i=0;i<elemArray.length;i++) {
			
			if(String.valueOf(elemArray[i]).equalsIgnoreCase("a")) {
				countSet.add(i);
			}			
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "keshavnama";
		int count = counter(str, 20);
		System.out.println(count);
	}

}
