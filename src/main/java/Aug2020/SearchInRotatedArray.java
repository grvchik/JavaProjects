package Aug2020;

public class SearchInRotatedArray {

	
	public static int finIndex(int []nums,int target) {
		
		int rot = findRotationPoint(nums);
		
		if(target==nums[rot]) {
			return rot;
		}
		
		int left=0;
		int right=0;
		int mid=0;
		//search in right part
		if(target >=nums[0]  && target <nums[rot-1]) {
			left = 0;
			right = rot-1;
			mid = (left+right)/2;
			System.out.println("search right");
			return binarySearch(nums, left, right, target);
			
		}
		else if(target >nums[rot] && target <nums[nums.length-1]) {
			left = rot;
			right = nums.length-1;
			System.out.println("search left");
			return binarySearch(nums, left, right, target);			
		}
		
		return -1;
	}
	
	
	public static int binarySearch(int[] nums ,int low,int high,int target) {

		int mid = (low+high)/2;
		
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
				low = mid+1;
				return binarySearch(nums, low, high, target);				
			}
			else {
				high = mid;
				return binarySearch(nums, low, high, target);				
			}		
	
			
	
	}
	public static int findRotationPoint(int[] nums) {
		int left = 0; int right = nums.length-1;
		
		while(left<right) {
			
			if(nums[left]>= nums[right]) {
				left++;
			}
			else {
				return left;
			}
	
		}
		
		return -1;
	}
	
	
	public static int findIndex(int[] nums,int left,int right, int target) {;
		
		int mid = (left+right)/2;
		int midElement = nums[mid];
		
		if(midElement==target) {
			return mid;
		}
		
		if(right<left) {
			return -1;
		}
		

		if(nums[left] < midElement) {
			if(midElement>target) {
				return findIndex(nums, left, mid-1, target);
			}
			else {
				return findIndex(nums, mid+1, right, target);
			}
		}
		else if(midElement < nums[left]) {
			
			if(midElement>target && target <right) {
				return findIndex(nums, left, mid-1, target);
			}
			else {
				return findIndex(nums, mid+1, right, target);
			}		
			
		}
		else {
			
		}

		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,12,1,3,4,6,7};
		int res = finIndex(nums, 3);
		System.out.println(res);
	}

}
