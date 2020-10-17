package Aug2020;

public class InsertionSort {

	public static void insertionSort(int[] nums) {
		
		for(int i = 1;i<=nums.length-1;i++) {
			int element = nums[i];
			int j  = i-1;
			
			while(j>=0 && nums[j]>element) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = element;
		}
		
		System.out.println(nums);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,4,5,3,2};
		insertionSort(nums);
		
	}

}
