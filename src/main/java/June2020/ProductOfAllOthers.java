package June2020;

public class ProductOfAllOthers {

	public static int[] getArray(int[]nums) {
		
		int[] forwardArray = new int[nums.length];
		int[] backwardArray = new int[nums.length];
		
		
		forwardArray[0] = 1;
		
		for(int i=1;i<forwardArray.length;i++) {
			forwardArray[i] = nums[i-1] *forwardArray[i-1];
		}
	
		backwardArray[backwardArray.length-1] = 1;
		for(int j=backwardArray.length-2;j>=0;j--) {
			backwardArray[j] = 	backwardArray[j+1] *nums[j+1];
			System.out.println(backwardArray[j]);
			backwardArray[j+1] = backwardArray[j+1]*forwardArray[j+1];
		}	
		backwardArray[0] = backwardArray[0]*forwardArray[0];
		return backwardArray;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,7,3,4};
		getArray(nums);
	}

}
