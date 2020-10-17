package Sep2020;

public class GCDArray {
	public static int findGCDFromArray(int[] nums) {
		int previousNumber = nums[0];
		int gcd=0;
		for(int i=1;i<nums.length;i++) {
			
			int currentNumber = nums[i];
			int gcdInProgress = calculateGCD(currentNumber, previousNumber);
			previousNumber = gcdInProgress;
			gcd = gcdInProgress;
		}
		
		return gcd;		
	}
	
	public static int calculateGCD(int a,int b) {
		if(a==0 && b>0) {
			return a;
		}
		if(b==0 && a>0){
			return b;
		}
		
		if(a==1) {
			return a;
		}
		
		if(b==1) {
			return b;
		}
		
		
	
		
		if(a>b) {
			int remainder = a%b;
			if(remainder==0) {
				return b;
			}
			return calculateGCD(remainder, b);

		}
		else {
			int reaminder = b%a;
			if(reaminder==0) {
				return a;
			}
			return calculateGCD(reaminder, a);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,10,6,8};
		
		int gcdArrayRes = findGCDFromArray(nums);
		System.out.println(gcdArrayRes);
		
	}

}
