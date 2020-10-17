package Aug2020;

import java.util.HashSet;
import java.util.Set;

public class SubString {

	public static void helper(String input,Set<Character> unique,Set<String> processedEntries) {
		
		if(input.length()<unique.size()) {
			return;
		}
		
		for(int i=1;i<=input.length()-1;i++) {
			String left = input.substring(0, i);
	
			String right = input.substring(i, input.length());
	
			
			if(processedEntries.contains(left) || processedEntries.contains(right)) {
				continue;
			}
			
			if(left.length()>= unique.size() && isStingInSet(left, unique)) {
				processedEntries.add(left);
			}
			if(right.length()>=unique.size() &&  isStingInSet(right, unique)) {
				processedEntries.add(right);
			}			
			
			if(left.length()>= unique.size()) {
				helper(left, unique, processedEntries);
				return;
			}
		
			if(right.length()>=unique.size()) {
				helper(right, unique, processedEntries);
				return;
			}
			
			System.out.println("left---->"+left);
			System.out.println("right---->"+right);
		}
	}
	
	public static boolean isStingInSet(String input,Set<Character> uniqSet) {
		char[] newch = input.toCharArray();
		int emptyCounter=0;
		for(int i=0;i<newch.length;i++) {
			char inp = newch[i];
			if(uniqSet.contains(inp)) {
				 newch[i]='0';
				 emptyCounter++;
			}
		}
		if(emptyCounter>=uniqSet.size()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "fighaeci";
		Set<Character> unique = new HashSet<Character>();
		unique.add('a');
		unique.add('e');
		unique.add('c');
		unique.add('i');
		Set<String> processedEntries = new HashSet<String>();
		helper(input,unique,processedEntries);
	}

}
