package Dec2019;

public class AddOne {

	public static int[] getModifiedArray(int[] nums) {
	 int resultArray[] = new int[nums.length];
	 
	 if(containsNine(nums)) {
		 resultArray = new int[nums.length+1];
	 }
	 int carry = 0;
	 int sum =0;
	  for(int j = nums.length-1; j>=0;j--) {
		  if(j==nums.length-1) {
			  sum = nums[j]+1;  
		  }
		  else {
			  sum = nums[j]+carry;  
		  }
		  
		  if(sum>9) {
			  sum = 0;			
			  carry = 1;
		  }
		  else {
			  carry = 0;
		  }
		  resultArray[j] = sum;
	  }
	 
	  if(carry>0) {
		  resultArray[0] = carry;
	  }
	  return resultArray;
	}
	
	
	public static boolean containsNine(int[] nums) {
		for(int num :nums) {
			if(num!=9) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {9,8,9};
		getModifiedArray(num);
		
	}

}
