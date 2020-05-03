package Jan2020;

public class QuickSort {

	static void quickSort(int[] arr, int left, int right) {
		 int index = partition(arr, left, right);
		 if (left < index - 1) { // Sort left half
		 quickSort(arr, left, index - 1);
		 }
		 if (index < right) { // Sort right half
		 quickSort(arr, index, right);
		 }
	 }	
	
	
	static int partition(int[] arr, int left, int right) {
		 int pivot = arr[(left + right) / 2]; 
		 while (left <= right) {
		 // Find element on left that should be on right
		 while (arr[left] < pivot) left++;
		
		 // Find element on right that should be on left
		 while (arr[right] > pivot) right-- ;
		
		// Swap elements, and move left and right indices
		 if (left <= right) {
		 swap(arr, left, right); // swaps elements
		 left++;
		 right--;
		 }
		 }
		 return left;
		 }
	
	
	public static void swap(int[]arr,int left,int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,2,5,2,6,9};
		quickSort(nums, 0, nums.length-1);
	}

}
