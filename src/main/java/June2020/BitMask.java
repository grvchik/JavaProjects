package June2020;

public class BitMask {

	public static int swapBits(int num1,int num2) {
		int EVEN = 0B101010;
		int ODD =  0B010101;
		return (num1&EVEN)>>1 | (num2&ODD)<<1;
	}
	
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int num1 = 4;
		int num2 = 3;
		int res = swapBits(num1, num2);
		System.out.println(res);
	}

}
