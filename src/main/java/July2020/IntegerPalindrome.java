package July2020;

import java.util.ArrayList;
import java.util.List;

public class IntegerPalindrome {

	public static List<Integer> getDigitLocations(Integer number) {
		List<Integer> ret = new ArrayList<>();
		
	
		int remainder = 0;
		while(number!=remainder) {
			remainder = number%10;
			ret.add(remainder);
			  if(number==remainder) {
				   break;
			   }			
			if(remainder==0) {
				number = remainder/10;
			}
			else {
				number = (number-remainder)/10;
			}
		 
		}
		return ret;
	}
	
	
	
	public static boolean isPalindrome(int number) {
		
		
		List<Integer> ret = getDigitLocations(number);
		
		int beg = 0;
		int end = ret.size()-1;
		
		while(beg<=end) {
		   int begVal = ret.get(beg);
		   int endVal = ret.get(end);
		   if(begVal!=endVal) {
			   return false;
		   }
		   ++beg;
		   --end;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res = isPalindrome(122);
		System.out.println(res);
		
	}

}
