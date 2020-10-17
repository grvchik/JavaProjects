package June2020;

import java.util.Random;

public class Random7fromRandom5 {

	public static int random7() {
		Random rn  = new Random();
		return rn.nextInt(7)+1;
		
	}
	
	public static int random5() {
		int result = 0;
		result = random7();
		
		while(result>5) {
			result = random7();
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(random7());
	}

}
