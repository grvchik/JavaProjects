package Mar2020;

import java.util.Deque;
import java.util.LinkedList;

public class BracketInvalidationCounter {

	public static int bracketInvalidationCounter(String str) {
		if(str==null || str.length()==0) {
			return -1;
		}
		
		String strArray[] = str.split("");
		int counter=0;
		Deque<String> cont = new LinkedList<String>();
		
		for(String elem:strArray) {
			if(elem.equalsIgnoreCase("(")) {
				cont.push(elem);
			}
			else if(elem.equals(")")) {
				if(cont.size()==0) {
					++counter;
				}
				else {
					cont.pop();
				}
			}
		}
		
		if(counter>0) {
			return counter;
		}
		else {
			return cont.size();
		}
		
		
	}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "()()))";
		int counter = bracketInvalidationCounter(str);
		System.out.println(counter);
	}

}
