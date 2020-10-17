package Oct2020;

public class QuickSort {

	
	public static void quickSort(int[] nums,int left,int right) {
		
		
		if(left>=right){
			return;
		}
		
		int index = partition(nums, left, right);
		
		if(left<index-1) {
			quickSort(nums, left, index-1);
		}

		if(index<right) {
			quickSort(nums, index, right);
		}
		
	}
	
	public static int partition(int[] nums,int left,int right) {
		 int pivot = nums[(left + right) / 2]; // Pick pivot point
		while(left< right) {
			while(nums[left]<pivot) {
				left++;
			}
			while(nums[right]>pivot) {
				right--;
			}
			 if (left <= right) {
				 swapValues(nums, left, right); 
				 left++;
				 right--;
			 	}			
		}
		

		
		return left;
	}
	
	public static void swapValues(int[]nums,int beg,int end) {
		int temp = nums[beg];
		nums[beg] = nums[end];
		nums[end] = temp;
	}
	
	
	private static void printArray(int arr[]) {
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,3,8,4,7,1,34};
		quickSort(nums, 0, nums.length-1);
		printArray(nums);
	}

}
