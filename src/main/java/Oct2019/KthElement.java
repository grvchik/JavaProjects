package Oct2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KthElement {

	public static String getKthString(String []stringArray, int k) {
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		for( String str: stringArray) {
			if(map.get(str)==null) {
				map.put(str, 1);
			}
			else {
				Integer val = map.get(str);
			    map.put(str, ++val);
			}
		}
		
		List<Map.Entry> sortedList = new ArrayList<Map.Entry>(map.entrySet());
		 

		
		Collections.sort(sortedList, new Comparator() {
		 

		public int compare(Object o1, Object o2) {
		    Map.Entry mapObject1 = (Map.Entry)o1;
		    Map.Entry mapObject2 = (Map.Entry)o2;
		    Integer integer1 = (Integer) mapObject1.getValue();
		    Integer integer2 = (Integer) mapObject2.getValue();
		    return integer2.intValue()-integer1.intValue();
		}
		 });

		String retValue = (String)sortedList.get(k-1).getKey();
		return retValue;
	}
	
	
	
	
	public static String getStringCompression(String str) {
		Map<String,Integer> stringCountMap = new HashMap<String, Integer>();
		for( int i=0;i<str.length();i++) {
			String strElement = String.valueOf(str.charAt(i));
			if(!Character.isLetter(str.charAt(i))) {
				continue;
			}
			
			Integer count = stringCountMap.get(strElement);
			if(count==null) {
				stringCountMap.put(strElement, 1);
			}
			else {
				stringCountMap.put(strElement, ++count);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String, Integer> obj : stringCountMap.entrySet()) {
			sb.append(obj.getKey()).append(obj.getValue());
		}
		
		return sb.toString();
	}
	
	public static int getFibonacci(int n) {
		
		if(n<=1){
			return 1;
		}
		
		int prevprev = 0;
		int prev = 1;
		int current = 0;
		
		for(int i=1;i<=n;i++) {
			current = prevprev + prev;
			
			prevprev = prev;	
			prev = current;
		}
		return current;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"This","This","This is","This is india"};
		String freq = getKthString(str,1);
		System.out.println(freq);
		String str3 = "Abhi to anjaam hain";
		String result = getStringCompression(str3);
		System.out.println(result);
		
		//System.out.println(getFibonacci(5));
		
	}

}
