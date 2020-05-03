package Jan2020;

public class RotateArray {

	
	public static void rotateArray(int [] nums, int start,int end, Integer lastValidIndex) {
		if(start>end) {
			return;
		}
		  if(start==end) {
			    
			    if(nums[end]%4!=0 && lastValidIndex < end) {
			    	rotateArray(nums,lastValidIndex,end);
			    }
			  } 
			  
			   if(nums[start]%4!=0 && lastValidIndex >0) {
			      rotateArray(nums,lastValidIndex,start);
			      lastValidIndex = lastValidIndex+1;
			   }
			   else  {
			   
			     if(nums[start]%4==0 && lastValidIndex == -1) {
			       lastValidIndex = start;
			    }  
			  }

			   rotateArray(nums, start+1, end, lastValidIndex);

	}
	
	
	

	
	
	private static void swapValues(int[]nums, int from,int to) {
		int temp = nums[from];
		nums[from] = nums[to];
		nums[to] = temp;
	}
	
	public static void rotateArray(int[] nums,int fromIndex,int toIndex) {
	    //   0 1 2 3 4 5 6 7 8	
	//   0 1 2 3 4 8 6 7 9
		// { 1,2,3,4,5,6,7,8,12}
		
		int temp = nums[fromIndex];
		if(fromIndex+1==toIndex) {
			nums[fromIndex] = nums[toIndex];
			nums[toIndex] = temp;
		}
		else {
			 temp = nums[toIndex];
			  while(fromIndex<toIndex)	{
				  nums[toIndex] = nums[toIndex-1];
				  toIndex--;
			  }
			   nums[fromIndex] = temp;			
		}

	   System.out.println(nums);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = { 11,12,13,4,15,6,8,18,20,9};
		//rotateArray(nums, 3, 7);
		rotateArray(nums, 0, nums.length-1, -1);
	}

}
