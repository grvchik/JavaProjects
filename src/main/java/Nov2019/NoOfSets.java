package Nov2019;

import java.util.Iterator;
import java.util.Set;

public class NoOfSets {

	public static void printSubSets(int[] nums) {
		int[] subset = new int[nums.length];
		Integer beg = new Integer(0);
		helper(nums, 0, subset);
	}
	
	
	
	public static void helper(int[]originalArray, Integer indexCounter,int[] combSet) {
		if(indexCounter==originalArray.length) {
			printCombs(combSet);
			System.out.println();
		}
		else {
			combSet[indexCounter] = 0;
			helper(originalArray, indexCounter+1, combSet);
		
			combSet[indexCounter] = originalArray[indexCounter];
			helper(originalArray, indexCounter+1, combSet);
		}		
	}
	
	
	public static void printCombs(int[] combSet) {			
		for(int i=0;i<combSet.length;i++) {
			System.out.print(combSet[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2};
		NoOfSets sets = new NoOfSets();
		sets.printSubSets(nums);
	}

}
