package April2020;

import java.util.ArrayList;
import java.util.List;

public class SubSetCombination {

	public static List<List<Integer>> getSubSets(List<Integer> set,int index) {
		List<List<Integer>> allSubsets;
		if(index==set.size()) {
			allSubsets = new ArrayList<List<Integer>>();
			allSubsets.add(new ArrayList<Integer>());
			return allSubsets;
		}
		else {
			allSubsets = getSubSets(set, index+1);
			List<List<Integer>> moreSubSets = new ArrayList<List<Integer>>(); 
			int item  = set.get(index);
			for(List <Integer> subset: allSubsets) {
				List<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				moreSubSets.add(newsubset);
			}
			allSubsets.addAll(moreSubSets);
		}
		
		return allSubsets;
	}
	
	
	public static void main(String g[]) {
		
		List testList = new ArrayList<Integer>();
		testList.add(2);
		testList.add(3);
		testList.add(4);
		getSubSets(testList, 0);
	}
}
