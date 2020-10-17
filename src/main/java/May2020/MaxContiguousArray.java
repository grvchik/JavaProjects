package May2020;

public class MaxContiguousArray {

	public static int findMaxSum(int[] array) {
		
		int maxEnding = 0;
		int maxSum = 0;
		
		for(int num: array) {
			maxEnding = Math.max(num, maxEnding+num);
			maxSum = Math.max(maxSum, maxEnding);
		}
		return maxSum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {34,-50,42,14,-5,86};
		int maxS = findMaxSum(nums);
		System.out.println(maxS);
	}

}
