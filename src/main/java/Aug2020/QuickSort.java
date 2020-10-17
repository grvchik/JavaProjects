package Aug2020;

public class QuickSort {

	public static void quicksort(int[]nums,int left,int right) {
		int index = partition(nums, left, right);
		if(left<index-1) {
			quicksort(nums,left,index-1);
		}
		if(index<right) {
			quicksort(nums,index,right);
		}
		printArray(nums);
	}
	public static int partition(int[] arr, int left, int right) {
		 int pivot = arr[(left + right) / 2]; // Pick pivot point
		 while (left <= right) {

		 while (arr[left] < pivot)  {
			 left++;
		 }


		 while (arr[right] > pivot) {
			 right-- ;
		 }


		 if (left <= right) {
			 swapValues(arr, left, right); 
			 left++;
			 right--;
		 	}
		 }
		 return left;
		 }
	

	
	private static void printArray(int arr[]) {
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}	
	
	
	public static void swapValues(int[]nums,int beg,int end) {
		int temp = nums[beg];
		nums[beg] = nums[end];
		nums[end] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {8,3,98,54,2};
		
		quicksort(nums, 0, nums.length-1);
		
		
	}

}
