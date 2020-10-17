package June2020;

import java.util.StringTokenizer;

public class SelectionSort {

	public static int[] selectionSort(int input[]) {
		for (int i = 0; i < input.length; i++) {
			int minimumIndex = i;
			for (int j = i; j < input.length; j++) {
				if(input[j]<input[minimumIndex]) {
				
					minimumIndex = j;					
				}
			}
			swapValues(input, i,minimumIndex );
		}
		printArray(input);
		return input;
	}

	private static void printArray(int arr[]) {
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}		
	
	private static void swapValues(int[]nums,int first,int second) {
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {21,14,3,6,2,9,4,11};
		String str =  "P000063^RUEBIN";
		
		String strarr[] = str.split("^");
		StringTokenizer st = new StringTokenizer(str, "^");
		while(st.hasMoreElements()) {
			System.out.println("============================");
			System.out.println(st.nextElement().toString());
		}
		String userId = strarr[0];
		//System.out.println(userId);
		
		
		selectionSort(nums);
	}

}
