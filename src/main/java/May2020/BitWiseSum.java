package May2020;

public class BitWiseSum {
	public static int getSum(int num1,int num2) {
		if(num2==0) {
			System.out.println();
			return num1;
		}
		
		int andNumber = num1&num2;
		
		System.out.println();
		System.out.print("andNumber"+andNumber);
		
		int xorNumber = num1^num2;
		andNumber = andNumber<<1;
		System.out.println();
		System.out.print("xorNumber"+xorNumber);		
		return getSum(xorNumber,andNumber );
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getSum(6,2);
		System.out.println("result"+result);
	}

}
