package July2020;

public class SlectionSort {
	public static int[] selectionSort(int input[]) {
		for(int i=0;i<input.length-1;i++) {
			int minIndex = i;
			
			for(int j=i;j<input.length;j++) {
				if(input[minIndex] > input[j]) {
					minIndex = j;
				}
			}
			swapValues(input, minIndex, i);
			
		}
		printArray(input);
		return input;
	}
	
	
	private static void printArray(int arr[]) {
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}	
	
	public static void swapValues(int[]nums,int from,int to) {
		int temp = nums[from];
		nums[from] = nums[to];
		nums[to] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,3,5,11,2};
		selectionSort(nums);
	}

}
