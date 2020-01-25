package Jan2020;

import java.util.HashMap;
import java.util.Map;

public class AdjustStringLexically {

	public static char[] returnAdjustedStringNew(String input) {

		char inputchar[] = input.toCharArray();
		
		int start = 0;
		int end = input.length()-1;
		int curr = 0;
		
		while(start<end) {
			if(inputchar[curr]=='a') {
				swap(curr, start, inputchar);
				++curr;
				++start;
			}
			else if(inputchar[start]=='b') {
				swap(curr, end, inputchar);
				++start;
				--end;
				
			}
			else {
			  curr++;	
			}
		}
		
		
		return inputchar;
		
	}
	
	public static char[] returnAdjustedString(String input) {
		char inputchar[] = input.toCharArray();
		
		int start = 0;
		int end = input.length()-1;
		
		Map<Character,Integer> charCountMap = new HashMap <Character,Integer>();
		
		buildMap(inputchar,charCountMap);
		
		while(start<end) {
			
			if(inputchar[end]=='a' && charCountMap.get('a')>0) {
				swap(start,end,inputchar);
				++start;
				Integer curcount =charCountMap.get('a'); 
				charCountMap.put('a', --curcount);
			}
			else {
			
				 if(inputchar[end]=='b' && charCountMap.get('b')>0 && charCountMap.get('a')==0) {
						swap(start,end,inputchar);
						++start;
						Integer curcount =charCountMap.get('b'); 
						charCountMap.put('b', --curcount);
				 }
				 else {
					 if(inputchar[end]=='g' && charCountMap.get('g')>0 &&  charCountMap.get('b')==0) {
							swap(start,end,inputchar);
							++start;
							Integer curcount =charCountMap.get('g'); 
							charCountMap.put('g', --curcount);
					 }
					 else {
						 --end;
					 }
				 }
			}
			
		}
		
		
		return inputchar;
	}
	
	
	private static void swap(int start,int end, char[] inputchar) {
		char temp = inputchar[start];
		inputchar[start] = inputchar[end];
		inputchar[end] = temp;
	}
	
	private static void buildMap(char[] inputchar,Map <Character,Integer>charCountMap) {
		
		for(char c: inputchar) {
			if(c=='a') {
				Integer count = charCountMap.get('a');
				if(count==null) {
					charCountMap.put('a',1);
				}
				else {
					charCountMap.put('a',++count);
				}
			}
			else if(c=='b') {
				Integer count = charCountMap.get('b');
				if(count==null) {
					charCountMap.put('b',1);
				}
				else {
					charCountMap.put('b',++count);
				}
				
			}
			else if(c=='g') {
				Integer count = charCountMap.get('g');
				if(count==null) {
					charCountMap.put('g',1);
				}
				else {
					charCountMap.put('g',++count);
				}
				
			}
			else {
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "gabbar";
		char input[] = returnAdjustedStringNew(str);
		System.out.println(input);
		
	}

}
