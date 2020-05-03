package April2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MultiString {

	public static HashMap<String, List<Integer>> searchAll(String big,String[] smalls) {
		
		HashMap<String, List<Integer>> resultArray = new HashMap<String, List<Integer>>();
		for(String small:smalls) {
			List<Integer> locations = getLocations(small, big);
			resultArray.put(small,locations);
		}
		return resultArray;
	}
	
	
	public static List<Integer> getLocations(String small,String big) {
		
		List<Integer> locations  = new ArrayList<Integer>();
		
		int fromIndex=0;
	    while(fromIndex<big.length()-1) {
	    	int location = getLocation(small, big, fromIndex);
	    	if(location!=-1 && !locations.contains(location)) {
	    		locations.add(location);
	    	}
	    	
	    	fromIndex++;
	    }
		return locations;
	}
	
	
	public static int getLocation(String small,String big, int fromIndex) {
		String comparableString = big;
		if(fromIndex>0) {
			comparableString = big.substring(fromIndex);
		}
		if(comparableString.length()> small.length() && comparableString.indexOf(small)>-1) {
			return comparableString.indexOf(small)+fromIndex;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String smalls[] = {"is","ppi","hi","sis","i","ssippi"};
		String big = "missisippi";
		searchAll(big, smalls);
	}

}
