package May2020;

public class NoOfOnesInANumber {

	public static int countOnesInANumber(int number) {
		int sum = 0;
		while(number>0) {
			sum += number^1;
			number = number>>1;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 8;
		int ones = countOnesInANumber(number);
		System.out.println(ones);
	}

}
