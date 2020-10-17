package June2020;

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
	
	
	
	private static void swapValues(int[]nums,int first,int second) {
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}
	
	private static void printArray(int arr[]) {
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,4,8,9,7};
		
	
		quicksort(nums, 0, nums.length-1);
		
	}

}
