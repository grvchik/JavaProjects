package May2020;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayCombinations {

	public static List  <int[]>  retList = new ArrayList<int[]>();  
	
	public static List<int[]> getPermutations(int start, int[]a ) {
		 if(start>=a.length) {
			 retList.add(a.clone());
			 return retList;
		 }
		 else {
			for(int i=start;i<a.length;i++) {
				
				swap(a, start, i);
				getPermutations(start+1, a);
				swap(a, i,start);
				
				
			}
			return retList;
		 }
		
	}
	
	
	
	public static void swap(int[]a ,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static void  printArea(List<int[]> perms) {
		for(int i=0;i<perms.size();i++) {
			System.out.println();
			
			int nums[] = perms.get(i);
			
			for(int j=0;j<nums.length;j++) {
				System.out.print(nums[j]);
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,3,4,5};
		List<int[]> perms=getPermutations(0, num);
		printArea(perms);
		
	}

}
