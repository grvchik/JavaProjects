package June2020;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	
	public static void generateAll(List<String> combinations, int leftR,int rightR,char[] place,int index) {
		if(leftR<0) {
			return;
		}
		if(leftR==0 && rightR==0) {
			combinations.add(String.valueOf(place));
			return;
		}
		
		if(leftR>0) {
			place[index] = '(';
			generateAll(combinations, leftR-1, rightR, place, index+1);
			System.out.println("left r index"+index);
		}
		if(rightR>0) {
			place[index] = ')';
			generateAll(combinations, leftR, rightR-1, place, index+1);
			System.out.println("right r index"+index);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> combinations = new ArrayList<String>();
		int n = 3;
		char [] chArr = new char[2*n];
		generateAll(combinations, 3, 3, chArr, 0);
	}

}
