package Feb2020;

public class BitOperations {

	
	public static int addTwoNumbers(int first,int second) {
		if(first==0) {
			return second;
		}
		System.out.println(Integer.toBinaryString(first));
		System.out.println(Integer.toBinaryString(second));
		int andResult = first&second;
		int xorResult = first^second;
		
		andResult =  andResult<<1;
		System.out.println(Integer.toBinaryString(xorResult));
		return addTwoNumbers(andResult, xorResult);
		
	}
	
	
	public static int countOnes(int number) {
		
		int sum=0;
		while(number!=0) {
			//System.out.println(Integer.toBinaryString(number));
			number = number>>1;
			//System.out.println(Integer.toBinaryString(number));
		
			if((number&1)==1) {
				sum = sum+1;
			}
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = addTwoNumbers(4,8);
		System.out.println(res);
		System.out.println(countOnes(8));
	}

}
