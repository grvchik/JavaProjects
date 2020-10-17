package July2020;

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
	
	
	private static void printArray(int arr[]) {
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}	
	
	
	
	
	public static int partition(int[] nums,int left,int right) {
		
		 int pivot = nums[(left + right) / 2]; // Pick pivot point
		while(left<=right) {
			
			if(nums[left] <pivot) {
				left++;
			}
			
			if(pivot <nums[right]) {
			    right--;
			}

			if(left<=right) {
				swapValues(nums, left, right);
				++left;
				--right;
			}
			
		
		}
		return left;
	}
	
	public static void swapValues(int[]nums,int from,int to) {
		int temp = nums[from];
		nums[from] = nums[to];
		nums[to] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,8,4,3,7};
		quicksort(nums, 0, nums.length-1);
	}

}
