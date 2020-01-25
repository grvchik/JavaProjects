package Jan2020;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Itenary {

	
	public static void makeItenary(String[][] destinations,String source) {
		
		Deque<String> itenary = new LinkedList<String>();
		
		int rows = destinations.length;
	
		itenary.add(source);
		Map<String,String> lexicMap = new HashMap<String,String>();
		
		for(int row = 0;row<rows;row++) {
			
			String [] tuplet = destinations[row];
			String sourceVal = tuplet[0];
			String dest = tuplet[1];
			
		
			
			if(lexicMap.containsKey(sourceVal)) {
			
				String existingDest = lexicMap.get(sourceVal);
				int currLexDiff = getDifference(sourceVal, existingDest);
				int newDiff = getDifference(sourceVal, dest);
				if(Math.abs(newDiff)<Math.abs(currLexDiff)) {
					lexicMap.put(sourceVal, dest);
				}
			}
			else {
				lexicMap.put(tuplet[0], dest);
			}			
		}// end for 		
		
		
		while(!itenary.isEmpty()) {
			String topEl = itenary.pop();
			
			if(lexicMap.containsKey(topEl)) {
				String nextDest = lexicMap.get(topEl);
				System.out.println(topEl+"->"+nextDest);
				itenary.push(nextDest);
				lexicMap.remove(topEl);
			}
			
		}
		
	}
	
	
	public  static int getDifference(String orig,String dest) {
		
		int difference = 0;
		
		difference = (orig.compareTo(dest));
		
		return difference;
		
	}
	
	public static void main(String[] args) {

		String orig = "SFO";
		String dest = "SAU";
		
	 	String [][] destinations = {
	 							  {"A","B"},
	 							  {"A","C"},
	 							  {"B","C"},
								  {"C","A"}
	 			                  };
		
	 	makeItenary(destinations, "A");
	}

}
