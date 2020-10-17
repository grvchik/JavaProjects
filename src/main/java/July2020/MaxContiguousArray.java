package July2020;

public class MaxContiguousArray {

	public static int findMaxContiguousArray(int[] nums) {
		
		int maxSum=Integer.MIN_VALUE;
		
		// if currenet element is more than max or sumSoFar is more than max then reset sumSofar
		int sumSoFar = 0;
		for(int i=0;i<nums.length;i++) {
			
			int currElement = nums[i];
			sumSoFar = sumSoFar + nums[i];
			if(currElement>maxSum && sumSoFar<maxSum) {
				maxSum = currElement;
				sumSoFar = maxSum;
				System.out.println("sumSoFar"+sumSoFar);
				System.out.println("maxSum"+maxSum);				
			}
			else {
				
				if(sumSoFar>maxSum) {
					maxSum = sumSoFar;
				}
				System.out.println("maxSum in else condition"+maxSum);		
			}
			
		}
		
		return maxSum;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {34,-50,42,14,-5,86};
		int maxSum = findMaxContiguousArray(nums);
		System.out.println(maxSum);
	}

}
