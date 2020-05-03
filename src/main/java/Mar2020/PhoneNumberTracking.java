package Mar2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumberTracking {

	public static void buildWordCombinations(Map<String,String[]> combMap,
			String[] digits,
			List<String> mapResults,
			int index,String soFar)  {
	
		if(index==combMap.size()-1) {
			mapResults.add(soFar);
			return;
		}

		String key = digits[index];
		String values[] = combMap.get(key);		
		
		for(int i=0;i<values.length;i++) {
			
			buildWordCombinations(combMap, digits, mapResults, index+1, soFar+values[i]);
		}
		
	}
		
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr1 = {"a","b","c"};
		String [] arr2 = {"d","e","f"};
		Map<String,String[]> mapstr = new HashMap<String,String[]>();
		mapstr.put("1", arr1);
		mapstr.put("2", arr2);
		String [] digits = {"1","2"};
		List <String> results = new ArrayList<String>();
		buildWordCombinations(mapstr, digits, results, 0, "");
	}

}
