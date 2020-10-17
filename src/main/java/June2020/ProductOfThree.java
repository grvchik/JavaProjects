package June2020;

public class ProductOfThree {

	
	public static int findProductOfThree(int[] nums) {
		
		int lowest = nums[0];
		int lowestTwo = nums[0]*nums[1];
		int highest = nums[0];
		int highestTwo =nums[0]*nums[1];
		int lowestThree = nums[0]*nums[1]*nums[2];
		int highestThree = nums[0]*nums[1]*nums[2];
		
		for(int i=2;i<=nums.length-1;i++) {
			lowest = Math.min(lowest, nums[i]);
			highest = Math.max(highest, nums[i]);
			System.out.println("lowest"+lowest);
			System.out.println("highest"+highest);			
			lowestTwo = Math.min(lowest*nums[i],lowestTwo);
			highestTwo = Math.max(highest*nums[i],highestTwo);
			System.out.println("lowestTwo"+lowestTwo);
			System.out.println("highestTwo"+highestTwo);
			lowestThree = Math.min(lowestTwo*nums[i], lowestThree);
			highestThree = Math.max(highestTwo*nums[i], highestThree);
			System.out.println("lowestThree"+lowestThree);
			System.out.println("highestThree"+highestThree);
		}
		return highestThree;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-10,-10,1,2,3};
		int three = findProductOfThree(nums);
		System.out.println(three);
	}

}
