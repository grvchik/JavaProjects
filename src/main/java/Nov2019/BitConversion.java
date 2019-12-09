package Nov2019;

public class BitConversion {

	public int bitSwapRequired(int a,int b) {
		int count=0;
		for (int c = a ^ b; c != 0; c = c>>1) {
			count += c & 1;
			 }
		return count;
	}
	
	public static void main(String[] args) {
		BitConversion bc = new BitConversion();
		System.out.println(bc.bitSwapRequired(1, 2));
				

	}

}
