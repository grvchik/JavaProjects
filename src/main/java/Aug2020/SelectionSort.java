package Aug2020;

public class SelectionSort {

	
	public static void selectionSort(int[] nums) {
		
		for(int i=0;i<nums.length-1;i++) {
			int minIndex = i;
			
			for(int j = i+1;j<nums.length;j++) {
				if(nums[minIndex] > nums[j] ) {
					minIndex = j;
				}
			}
			swapValues(i,minIndex,nums);
		}
		
	}
	
	private static void swapValues(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {8,7,6,5,4};
		selectionSort(nums);
	}

}
