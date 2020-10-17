package Sep2020;

public class CalculateBonus {

	public static void calculateBonus(int[] nums) {
		
		int [] result = new int[nums.length];
		
		if(nums==null || nums.length<2) {
			return;
		}
		
		if(nums[0]<nums[1]) {
			result[0]=1;
			result[1]=2;
		}
		else if(nums[0]>nums[1]){
			result[0]=2;
			result[1]=1;			
		}
		else {
			result[0]=1;
			result[1]=1;			
		}
		
		int currIndex = 1;
		int nextIndex = 2;
		while(nextIndex<nums.length-1) {
			
			int currNumber = nums[currIndex];
			int nextNumber = nums[nextIndex];
			
			int currentBonus = result[currIndex];
			if(currNumber<nextNumber) {
				result[nextIndex] = currentBonus+1;
			}
			else {
				result[nextIndex] = currentBonus-1;
			}
			
			currIndex++;	
			nextIndex++;
		}
		
		if(result[nextIndex]==0 ) {
			
			int previousNumber = nums[currIndex];
			int currNumber = nums[nextIndex];
			
			if(previousNumber>currNumber) {
				result[nextIndex] = result[currIndex]-1;
			}
			else {
				result[nextIndex] = result[currIndex]+1;
			}
			
			
		}
		
		System.out.println("Next index"+(currIndex+1));
		printArray(result);
		
	}
	
	private static void printArray(int arr[]) {
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,40,200,1000,60,30};
		calculateBonus(nums);
	}

}
