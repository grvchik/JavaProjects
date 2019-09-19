package Sept2019;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CountAtoms {

	
	
	public static String buildDistributive(String input) {
		
		char str[] = input.toCharArray();
		Queue <String> expr = new LinkedList<String>();
		Integer number = null;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length;i++) {
			char elec = str[i];
			
			if(elec=='(' ) {
				expr.add(String.valueOf(elec));
			}
			else if(elec==')') {
				if(i+1<=str.length-1) {
					
					number = Character.getNumericValue(str[i+1]);
				}
				while(!expr.isEmpty()) {
					String top = expr.remove();
					if(top.equalsIgnoreCase("(")) {
						continue;
					}
					sb.append(top);
					sb.append(number);
					
				}
			}
			else {
				expr.add(String.valueOf(elec));
			}
		}
	
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(CO)2";
		System.out.println(buildDistributive(str));

		
	}

}
