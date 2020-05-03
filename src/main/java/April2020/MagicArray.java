package April2020;

public class MagicArray {

	public static int getMagicIndex(int[]nums,int index ) {
	
		if(nums==null || nums.length==0) {
			return -1;
		}
		
		if(nums[0] == index) return 0;
		
		if(nums[nums.length-1] == index) return index;
		
		
		int beg = 0;
		int end = nums.length-1;
		
		while(beg<=end) {
			
			int mid = (beg+end)/2;
			
			if(nums[mid]==index) {
				return mid;
			}
			else if(nums[mid]< index) {
				beg = mid;
			}
			else if(nums[mid] > index) {
				end = mid;
			}
			beg++;
			end--;
		}
		
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {-2,0,1,3,5};
		int index = getMagicIndex(nums, 3);
		System.out.println(index);
	}

}
