package May2020;

public class GrayCode {

	public static boolean grayCode(int a,int b) {
		int xor = a^b;
		System.out.println(xor);
		int lesser = xor -1;
		boolean res = ((lesser & xor)==0);
		System.out.println(res);
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 grayCode(6, 5);
		
	}

}
