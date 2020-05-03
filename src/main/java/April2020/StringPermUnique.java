package April2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringPermUnique {

	public static void printPerms(String input) {
		List<String> result = new ArrayList<String>();
		Map<Character,Integer> charCountMap = new HashMap<Character, Integer>();
		buildMap(charCountMap, input);
		printPermutations(charCountMap,"",input.length(),result);
		
		for(String str: result) {
			System.out.println(str);
		}
	}
	
	public static void printPermutations(Map<Character,Integer> charCountMap,String prefix,int remaining,List<String> result) {
	 if(remaining==0) {
		 result.add(prefix);
		 return ;
	 }
	
	 for(char c:charCountMap.keySet()) {
		 int count = charCountMap.get(c);
		 if(count>0) {
			 charCountMap.put(c, count-1);
			 printPermutations(charCountMap, prefix+c, remaining-1, result);
			 charCountMap.put(c, count);			 
		 }

	 }
		
	}
	
	
	public static void buildMap(Map<Character,Integer> charCountMap,String input) {
		
		for(char charinput :input.toCharArray()) {
			Integer counter = charCountMap.get(charinput);
			if(counter==null) {
				charCountMap.put(charinput,0);
			}
			else {
				charCountMap.put(charinput,counter+1);
			}
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="alfaazon";
		printPerms(input);
		
	}

}
