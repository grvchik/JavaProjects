package Nov2019;

public class CarryRemainder {

	public void addNumberToArray(int[] nums) {
		int newArray[] = new int[nums.length];
		int carry = 0;
		for(int i = nums.length-1;i>=0;i--) {
			int element = nums[i];
			int sum = element;
			if(i==nums.length-1) {
				sum = sum+1;
			}
			else {
				sum = sum+carry;
				carry=0;
			}
			if(sum>9) {
				carry = sum/10;
				sum = sum%10;
			}
		    newArray[i] = sum;
			if(i==0 && carry==1) {
				newArray = new int[nums.length+1];
				newArray[0] = 1;
			}
		}
		
	  this.printAray(newArray);
	}
	
	
	public void printAray(int[] nums) {
		for(int num:nums) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {9,9,9};
		CarryRemainder cr = new CarryRemainder();
		cr.addNumberToArray(nums);
		
	}

}
