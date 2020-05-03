package April2020;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	static List<Integer> triplets = new ArrayList<Integer>();
	
	public static void findThreeSum(int[] nums) {
		
		for(int i=0;i<nums.length;i++) {
			
			int target = nums[i];
			int leftres[] = findThreeSum(nums, 0, i, target);
			
			if(leftres!=null && leftres.length==2) {
				triplets.add(leftres[0]);
				triplets.add(leftres[1]);
				triplets.add(target);
			}
			int rightRes[] = findThreeSum(nums, i+1, nums.length-1, target);
		
			if(rightRes!=null && rightRes.length==2) {
				triplets.add(rightRes[0]);
				triplets.add(rightRes[1]);
				triplets.add(target);
			}			
			
		}
		
	}
	
	public static int[] findThreeSum(int[] nums,int from,int to,int target) {
		if(from>=to) {
			return null;
		}
		
		if(nums[from]+nums[to]==-target) {
			int [] ret = new int[2];
			ret[0] = nums[0];
			ret[1] = nums[1];
			return ret;
		}
		
		int leftArray[] = findThreeSum(nums, from+1, to, target);
		int rightArray[] = findThreeSum(nums, from, to-1, target);
		
		if(leftArray==null  && rightArray!=null && rightArray.length>0) {
			return rightArray;
		}
		if(rightArray==null && leftArray!=null && leftArray.length>0) {
			return leftArray;
		}
		
	 return null;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {-1,0,1,2,-1,4};
		findThreeSum(nums);
	}

}
