package Jan2020;

import java.util.ArrayList;
import java.util.List;

public class PossibleSubSets {

	int n,k;
	
	public  void backtrack(int first, ArrayList<Integer> curr,int[]nums,List<List<Integer>> output ) {
		   if (curr.size() == k){
			   output.add(new ArrayList(curr));
			   return;
		   }
			    

			    for (int i = first; i < n; ++i) {
			      // add i into the current combination
			      curr.add(nums[i]);
			      // use next integers to complete the combination
			      backtrack(i + 1, curr, nums,output);
			      // backtrack
			      curr.remove(curr.size() - 1);
			    }
	}
	public  List<List<Integer>> subsets(int[]nums) {
		 List<List<Integer>> output = new ArrayList();
		  n = nums.length;
		 for(int k=0;k<nums.length+1;++k) {
			 
			 backtrack(0, new ArrayList<Integer>(), nums, output);
		 }
		 
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3,4};
		PossibleSubSets psets = new PossibleSubSets();
		List res = psets.subsets(nums);
		System.out.println(res);
	}

}
