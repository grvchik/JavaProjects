import java.util.HashSet;
import java.util.Set;

public class MissingTwoNumbers {

	public static int[] twoMissing(int[] array) {

		int two[] = new int[2];

		int numbers = array.length + 2;

		int sum = (numbers*(numbers + 1)) /2;

		
		int arraySum = 0;

		Set<Integer> elements = new HashSet<Integer>();

		for(int num : array ) {
		  arraySum+= num;
		  elements.add(num);
		}

		int difference = sum-arraySum;


		int firstNum = 1; 
		int secondNum = difference-firstNum;

		while(firstNum < secondNum) {
		 
		 if(!elements.contains(firstNum)) {
		  two[0] = firstNum;
		  two[1] = secondNum;
		  break;
		 }
		 else {
		   firstNum = firstNum+1;
		   secondNum = difference-firstNum;
		 }
		}

		return two;
	}
	
	
	
	public static int countOneBits(int num) {
	 int sum = 0;
	 String str="";
	 while(num > 0) {
		 
		 sum = sum + (num & 1);
		 str = Integer.toBinaryString(num & 1);
		 num = num>>1;
		 str = Integer.toBinaryString(num);
	 }
	 return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = { 1,2,3,4,6,8};
		
		int two[] = twoMissing(num);
		System.out.println(two);
		int counter= countOneBits(3);
		
	}

}
