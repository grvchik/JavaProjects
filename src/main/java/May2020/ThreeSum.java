package May2020;

import java.util.Arrays;

public class ThreeSum {

	public static int[] threeSum(int[] nums,int leftIndex,int righrIndex,int target) {
		Arrays.sort(nums);
		for(int i=0;i<=nums.length-3;i++) {
			
			int firstElem = nums[i];
			
			int left = i+1;
			int right = nums.length-1;
			
			while(left<right) {
				if(firstElem+nums[left]+nums[right]==0) {
					System.out.println("found");
				}	
				else if(firstElem+nums[left]+nums[right]<0) {
					
					int newLeft = left;
					while(newLeft < righrIndex) {
						if(firstElem+nums[newLeft]+nums[righrIndex]==0) {
							System.out.println("found");
						}
						++newLeft;
					}
					
				}
				else if(firstElem+nums[left]+nums[right] >0) {
					int newRight = right;
					while(left < newRight) {
						if(firstElem+nums[left]+nums[newRight]==0) {
							System.out.println("found");
						}
						--newRight;
					}
				}	
			}			
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {-1,0,1,2,-1,4};
		int[] numThree = threeSum(nums, 0, nums.length-1, 0);
		System.out.println(numThree);
		StringBuilder sbuilder = new StringBuilder(1024);
		if(sbuilder.length()<1024) {
			sbuilder.append("junooon");
		}
		System.out.println(sbuilder.toString());
	}

}
