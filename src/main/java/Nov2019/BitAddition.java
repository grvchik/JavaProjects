package Nov2019;

public class BitAddition {

	public int addTwoNumbers(int num1,int num2) {
		if(num1==0) {
			return num2;
		}
		int andResult = num1&num2;
		System.out.println("AND RESULT"+Integer.toBinaryString(andResult));
		int xorResult = num1^num2;
		System.out.println("xor RESULT"+Integer.toBinaryString(xorResult));
		andResult = andResult<<1;
		System.out.println("AND RESULT after shift"+Integer.toBinaryString(xorResult));
		return this.addTwoNumbers(andResult, xorResult);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitAddition ba = new BitAddition();
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(2));
		int res = ba.addTwoNumbers(4,4);
		System.out.println(res);
	}

}
