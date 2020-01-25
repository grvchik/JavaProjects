package July;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

	
	
	public List<int[]> listPermutations(int[] a) {
	    ArrayList<int[]> results= new ArrayList<int[]>();
	    listPermutations(a, 0, results);
	    
	    return results;
	}

	private void listPermutations(int[] a, int start, List<int[]> result) {
	    if (start >= a.length) {
	        result.add(a.clone());
	        for(int i=0;i<a.length;i++) {
	        	System.out.print(a[i]);	
	        }
	        System.out.println();
	       
	        
	    } else {
	        for (int i = start; i < a.length; i++) {
	            swap(a, start, i);
	            listPermutations(a, start+1, result);
	            swap(a, start, i);
	        }
	    } 
	}

	
	private void printArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[1]);
		}
	}
	private void swap(int[] a, int i, int j) {
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}
	
	
	public static void main(String g[]) {
		int [] nums = {1,2,3};
		Permutations perm = new Permutations();
		perm.listPermutations(nums);
	}
}
