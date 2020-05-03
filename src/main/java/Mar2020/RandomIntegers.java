package Mar2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomIntegers {

	public static int generateRandomNumber(List<Integer> list, int number) {
		Random rm = new Random();
		int randomNumber = rm.nextInt(list.size());
		Set<Integer> value = new HashSet<Integer>();
		for(int i=0;i<list.size();i++) {
			value.add(list.get(i));
			
		}
		
		while(value.contains(randomNumber)) {
			randomNumber = rm.nextInt(list.size());
		}
		
		return randomNumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(2);
		intList.add(4);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		
		int number = 14;
		int resultNumber = generateRandomNumber(intList, number);
		System.out.println(resultNumber);
	}

}
