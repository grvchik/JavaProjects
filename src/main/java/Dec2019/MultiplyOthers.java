package Dec2019;

public class MultiplyOthers {

	
	public static int[] getProductArrays(int[] nums) {
		int[] beforeIndexArray = getArrayBeforeIndex(nums);
		int[] afterIndexArray = getArrayAfterIndex(nums);
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = beforeIndexArray[i]*afterIndexArray[i];
			
		}
		
		return nums;
	}
	
	public static int[] getArrayAfterIndex(int[] nums) {
		int afterIndex[] = new int[nums.length];
		afterIndex[nums.length-1] =1;
		int productSoFar = 1;
		for(int i=nums.length-2; i>=0;i--){
			productSoFar = productSoFar*nums[i+1];
			afterIndex[i] = productSoFar;
		}
		return afterIndex;
	}
	
	public static int[] getArrayBeforeIndex(int [] nums) {
		int beforeIndex[] = new int[nums.length];
		int productSoFar = 1;
		beforeIndex[0] = nums[0];
		for(int i=1;i<nums.length;i++) {
			productSoFar = productSoFar*nums[i-1];
			beforeIndex[i] = productSoFar;
		}
		return beforeIndex;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,6,9};
		getProductArrays(nums);
	}

}
