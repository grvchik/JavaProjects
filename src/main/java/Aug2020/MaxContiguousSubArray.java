package Aug2020;

public class MaxContiguousSubArray {

	public static int getMaxSubSum(int []nums ) {
		int maxSum = 0;
		int sumSoFar=0;
		
		for(int i=0;i<nums.length;i++) {
			int curr = nums[i];
			if(sumSoFar+curr > sumSoFar) {
				sumSoFar = sumSoFar +curr;
				maxSum = Math.max(maxSum, maxSum+curr);
			}
			else {
				sumSoFar = sumSoFar +curr;
			}
			
		}
		
		return maxSum;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {8,-1,3,4};
		int res = getMaxSubSum(nums1);
		System.out.println(res);
		int[] nums2 = {-4,5,1,0};
		int res2 = getMaxSubSum(nums2);
		System.out.println(res2);
		
	}

}
