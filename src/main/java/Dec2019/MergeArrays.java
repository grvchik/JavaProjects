package Dec2019;

public class MergeArrays {

	
	public static void mergeArrays(int[]num1, int[]num2) {
		
	
	
		if(num1==null && num2!=null) {
			printArray(num2);
			return;
		}
		
		if(num2==null && num1!=null) {
			printArray(num1);
			return;
		}
		
	
		
		int i=0,j=0;
		
		while(i<num1.length && j<num2.length) {
			System.out.println("first"+num1[i]);
			System.out.println("second"+num2[j]);
			if(num1[i]<num2[j]) {	
				if(i==num1.length-1 && num1[i]==0) {
					num1[i] = num2[j];
				}
				i++;
			}
			else {
				// move element of the num1 right 
				moveElement(num1);
				//  assign the num2 to the current index
				num1[i] = num2[j];
				j++;
			}			
		}		
		printArray(num1);
	}
	
	
	public static void moveElement(int []nums) {
		int i = nums.length-1;
		while(nums[i]==0) {
			nums[i] = nums[i-1];
			i--;
		}
		
		nums[i] = nums[i-1];
		
	}
	
	public static void printArray(int[] nums) {
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1,3,5,0,0,0};
		int[] num2 = {2,4,6};
		mergeArrays(num1, num2);
	}

}
