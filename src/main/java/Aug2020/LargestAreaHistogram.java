package Aug2020;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class LargestAreaHistogram {

	public static int findArea(int[]array) {
	
		int left = 0;int right = array.length-1;
		int maxArea = Integer.MIN_VALUE;
		while(left<right) {
			int minHeight = Math.min(array[left], array[right]);
			int maxWidth = right-left+1;	
			maxArea = Math.max(maxArea, minHeight*maxWidth);
			left++;
			right--;
		}
	
		 left = 0;
		 right = array.length-1;
		 
		while(left<right) {
			int minHeight = Math.min(array[left], array[right]);
			int maxWidth = right-left+1;	
			maxArea = Math.max(maxArea, minHeight*maxWidth);
			left++;			
		}
	

		 left = 0;
			while(left<right) {
				int minHeight = Math.min(array[left], array[right]);
				int maxWidth = right-left+1;	
				maxArea = Math.max(maxArea, minHeight*maxWidth);
				right--;			
			}
		
		return maxArea;
	}
	
	
	public static int largestArea(int []nums) {
		int maxRectArea = 0;
		for(int i=0;i<nums.length;i++) {
			int height = nums[i];
			maxRectArea = Math.max(height, maxRectArea);
			
			for(int j=i-1;j>=0;j--) {
				int width = i-j+1;
				height = Math.min(height, nums[i]);
				maxRectArea = Math.max(maxRectArea, height*width);
			}
		}
		
		return maxRectArea;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,1,4,2,2,1};
	
		int arr = findArea(array);
		System.out.println(arr);
		arr = largestArea(array);
		System.out.println(arr);
	}

}
