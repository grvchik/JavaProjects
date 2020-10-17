package July2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class ShortestSubString {

	public static String findShortestString(String input, Set<Character> uniqueChars)
	{
		String shortest = null;
		Map<Character,List<Integer>> locationMap = new HashMap<Character, List<Integer>>();
		Iterator<Character> iter = uniqueChars.iterator();
		char firstChar='0';
		char lastChar='0';
		int counter=0;
		while(iter.hasNext()) {
			char element  = iter.next();
			if(counter==0) {
				firstChar = element;
			}
			else {
				lastChar = element;
			}
			buildLocationMap(element, input, locationMap);
			iter.remove();
			++counter;
		};
		
		List<Integer> firstElementList = locationMap.get(firstChar);
		List<Integer> lastElementList = locationMap.get(lastChar);
		
		int maxOfFirst = firstElementList.get(firstElementList.size()-1);
		int minOfLast = lastElementList.get(0);
		
		System.out.println(uniqueChars);
		return shortest;
	}
	
	
	public static void buildLocationMap(
			char input,
			String mainStr,
			Map<Character,List<Integer>> locationMap) {
		
		char []charArray = mainStr.toCharArray();
		List<Integer> locList = new ArrayList<Integer>();
		for(int i=0;i<charArray.length;i++) {
			if(input==charArray[i]) {
				locList.add(i);
				locationMap.put(input, locList);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(2);
		pq.add(3);
		System.out.println(pq.poll());
		Set<Character> uniqueSet = new HashSet<Character>();
		uniqueSet.add('a');
		uniqueSet.add('e');
		uniqueSet.add('i');
		findShortestString("fighaeci", uniqueSet);
	}

}
