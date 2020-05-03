package Feb2020;

import java.util.Random;

public class LongestPalindrome {

	public static void checkPal(int startIndex,int endIndex) {
		
		if(startIndex>=endIndex) {
			return;
		}
		
		System.out.println("1 Process start index"+ startIndex+" End Index"+endIndex);
		checkPal(startIndex, --endIndex);
		System.out.println("======================================================");
		System.out.println("2 Process start index"+ startIndex+" End Index"+endIndex);
		checkPal(++startIndex, endIndex);
		
		
	}
	
	public static int getRandom(int number) {
		
		Random rm = new Random();
		return rm.nextInt(number);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPal(0,6);
		
		System.out.println(getRandom(5));
	}

}
