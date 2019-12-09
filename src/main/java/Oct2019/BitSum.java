package Oct2019;

public class BitSum {

	public static int getSum(int num1,int num2) {
		if(num2==0) {
			return num1;
		}
		
		int andSum = num1&num2;
		System.out.println(Integer.toBinaryString(andSum));
		int xorResult = num1^num2;
		System.out.println(Integer.toBinaryString(xorResult));
		
		andSum = andSum<<1;
		System.out.println(Integer.toBinaryString(xorResult));
		
		return getSum(xorResult,andSum );		
		
	}
	
	
	public static int setIthBit(int num1, int pos) {
		
		int originalNum = num1;
		System.out.println(Integer.toBinaryString(num1));
		int mask = ~(num1>>pos);
		System.out.println(Integer.toBinaryString(mask));
		int res  = mask^originalNum;
		System.out.println(Integer.toBinaryString(res));
		return res;
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 4;
		int num2 = 2;
		int res = getSum(num1, num2);
		System.out.println(res);
		
		setIthBit(3,1);
		
	}

}
