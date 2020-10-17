package June2020;

public class GrayCode {

	public static boolean grayCode(int a,int b) {
		
		int xorResult = a^b;
		System.out.println(Integer.toBinaryString(xorResult));
		while(xorResult>0) {
			int shifted =  xorResult>>1 ;
			System.out.println(Integer.toBinaryString(shifted));
			if(xorResult%2==1 && shifted >0) return false;
			xorResult = xorResult>>1;
			System.out.println(Integer.toBinaryString(xorResult));
		}
		return true ;
	}
	
	public static void main(String g[]) {
		boolean res = grayCode(2, 4);
		System.out.println(res);
	}
}
