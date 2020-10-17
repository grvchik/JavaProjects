package May2020;

public class GCDArray {

	
	public static int findGCDFromArray(int[] nums) {
		int previousNumber = nums[0];
		int gcd=0;
		for(int i=1;i<nums.length;i++) {
			
			int currentNumber = nums[i];
			int gcdInProgress = CalculateGCD(currentNumber, previousNumber);
			previousNumber = gcdInProgress;
			gcd = gcdInProgress;
		}
		
		return gcd;
	}
	
	public static int CalculateGCD(int a, int b)  {
		// base case 
		if(a==0 || b==0) {
			return 0;			
		}

		if(a==1) {
			return b;			
		}

		if(b==1) {
			return a;			
		}
		
		if(a>b) {
			int remainder = a%b;
			if(remainder==0) {
				return a/b;
			}
			return CalculateGCD(a,remainder);
		}
		else {
			int remainder = b%a;
			if(remainder==0) {
				return b/a;
			}
			return CalculateGCD(b,remainder);
		}
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int gcd = CalculateGCD(12,16);
		int[] nums = {2,4,3,6,8};
		gcd =findGCDFromArray(nums);
		System.out.println(gcd);
	}

}
