package Nov2019;

import java.util.ArrayList;
import java.util.List;

public class IntegerCombinations {

	public List<Integer> printCombinations(List<Integer> input) {
		
		if(input.size()==1) {
			List<Integer> retList = new ArrayList<Integer>();
			retList.add(input.get(0));
			return retList;
		}
		
		
		List<Integer> allExceptLast = input.subList(0,input.size()-1);
		Integer last = input.get(input.size()-1);
		List<Integer> permList = new ArrayList<Integer>(allExceptLast.size()+1);
		List<Integer> permOfAllExceptLast = printCombinations(allExceptLast);
		
		for(int i=0;i<permOfAllExceptLast.size();i++) {
		
			for(int index=0;index<allExceptLast.size();index++) {
				List firstPart = permOfAllExceptLast.subList(0, index);
				List lastPart = permOfAllExceptLast.subList(index, permOfAllExceptLast.size());
				System.out.println();
				permList.addAll(firstPart);
				permList.add(last);
				permList.addAll(lastPart);
				
			}
		}
		
		return permList;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> retList = new ArrayList<Integer>();
		retList.add(1);
		retList.add(2);
		retList.add(3);
		IntegerCombinations ic = new IntegerCombinations();
		List<Integer> numComb = ic.printCombinations(retList);
		System.out.println(numComb);
		
	}

}
