package Jan2020;

public class BringZerosToEnd {

	
	public static void bringZerosToEnd(int[] nums) {
		for(int i=0;i<nums.length-1;i++) {

		    if(nums[i]==0) {    
		      swapNextNonZeroElement(i,i+1,nums);
		    }
		    else {
		    	System.out.println("nums");
		      continue;
		    }

		}		
		
	}
	
	
	public static void swapNextNonZeroElement(int fromIndex,int toIndex,int [] num) {

		if(toIndex==num.length-1) {
		  return;
		}
		
		if(num[toIndex]!=0) {
		  num[fromIndex] = num[toIndex];
		  num[toIndex] = 0;
		  return;
		}
		else {
		
		  swapNextNonZeroElement(fromIndex,toIndex+1,num);
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,1,2,0,4,0 };
		bringZerosToEnd(nums);
		System.out.println(nums);
	}

}
