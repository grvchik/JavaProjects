package Oct2019;

import java.util.Random;

public class CountBits {

	public int countBits(int num) {
		int sum = 0;
		
		while(num>0) {
			System.out.println(Integer.toBinaryString(num));
			sum = sum + ( num & 1);
			num = num>>1;
		}
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountBits cbits = new CountBits();
		System.out.println(-16>>2);
		System.out.println(1<<1);
		
	
		
		//cbits.countBits(12);
	}

}
