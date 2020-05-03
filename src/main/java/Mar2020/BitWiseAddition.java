package Mar2020;

public class BitWiseAddition {


	
	
	public static int addTwoNumbers(int a,int b) {
		if(b==0) {
			return a;
		}
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		int andResult = a&b;
		int xorResult = a^b;
		System.out.println(Integer.toBinaryString(andResult));
		andResult = andResult<<1;
		System.out.println(Integer.toBinaryString(andResult));
		System.out.println(andResult);
		
		return addTwoNumbers(xorResult, andResult);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int res = addTwoNumbers(2,3);
	  System.out.println(res);
	}

}
