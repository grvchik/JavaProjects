package Feb2020;

public class SearchBinary {

	public static int findIndex(int[] nums,int target) {
		int index=0;
		int low = 0;
		int high = nums.length;
		
		int middle = 0;
		
		while(low<=high) {
			 middle= (low+high)/2;
			 
			if (nums[middle] == target){
				return middle;
			}
		    if (nums[low] <= nums[middle]) {
		        if (target >= nums[low] && target < nums[middle]) {
		          high = middle - 1;
		        } else {
		          low = middle + 1;
		        }
		      }
		      // not sorted from low to mid. mid to high should be sorted, so check target in between mid to high
		      else if (target > nums[middle] && target <= nums[high]) {
		        low = middle + 1;
		      } else {
		        high = middle - 1;
		      }
		    }
			
		
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {13,18,25,10,8,2};
		findIndex(nums, 2);
	}

}
