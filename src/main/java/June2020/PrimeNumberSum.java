package June2020;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberSum {

	public static List<Integer> primeSum(int number) {
		List<Integer> res = new ArrayList<Integer>();
		for(int i=2;i<number/2;i++) {
		
			if(isPrime(i) && isPrime(number-i)) {
				res.add(i);
				res.add(number-i);
			}
		}
		return res;
		
	}
	
	public static boolean isPrime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> primeList = primeSum(15);
		printList(primeList);
	}

	public static void printList(List<Integer> primeList) {
		for(int num:primeList) {
			System.out.println(num);
		}
	}
}
