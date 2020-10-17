package June2020;

public class NextPermutation {

	public static int[] nextPermutation(int[] nums) {
		boolean swapDone = false;
		
		int leftNeighborIndex = nums.length-2;
		int rightNeighborIndex = nums.length-1;
		
		while(nums[rightNeighborIndex]>nums[leftNeighborIndex] && leftNeighborIndex>0) {
			--rightNeighborIndex;
			--leftNeighborIndex;
			
		}
		
		
		if(leftNeighborIndex==0) {
			swap(nums, leftNeighborIndex, rightNeighborIndex);
			swapDone = true;
		}
		else {
			if(rightNeighborIndex+1<=nums.length-1) {
				swap(nums, rightNeighborIndex, rightNeighborIndex+1);
				swapDone = true;
			}
			else {
				
				// find index of number bigger than the current rightindex
				// swap that number with its left neigbor
				int bigger =  getIndexOfBiggerNumber(nums,rightNeighborIndex);
				if(bigger >0) {
					swap(nums, bigger-1, bigger);
					swapDone = true;
				}
		
			}
		}
		
		
		
		if(!swapDone) {
			
			int firstIndex = 0;
			int lastIndex = nums.length-1;
			
			while(firstIndex<lastIndex) {
				swap(nums, firstIndex, lastIndex);
				++firstIndex;
				--lastIndex;
			}
			
		}
		return nums;
	}
	
	
	
	public static int getIndexOfBiggerNumber(int[]nums,int fromIndex) {
		int maximum = nums[fromIndex];
		while(fromIndex>0) {
			if(nums[fromIndex-1]> maximum) {
				maximum = nums[fromIndex-1];
			}
			
				fromIndex = fromIndex-1;
			
		}
		return fromIndex-1;
	}
	
	
	private static void swap(int[]nums,int first,int second) {
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,4,3,2};
		nextPermutation(nums);
	}

}
