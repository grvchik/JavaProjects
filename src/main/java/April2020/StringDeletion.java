package April2020;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class StringDeletion {

	public static int getMinimumDeletion(Set<String> dictionary, String word) {
		
		Queue<String> resQueue = new LinkedList<String>();
		Set<String> queueElements = new HashSet<String>();
		
		resQueue.add(word);
		queueElements.add(word);
		
		while(!resQueue.isEmpty()) {
			String s=resQueue.remove();
			queueElements.remove(s);
			
			if(dictionary.contains(s)) {
				return word.length()-s.length();
			}
			
			for(int i=0;i<s.length();i++) {
				String sub = s.substring(0,i)+s.substring(i+1, s.length());
				if(!queueElements.contains(sub) && sub.length()>0) {
					queueElements.add(sub);
					resQueue.add(sub);
				}
				
			}
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> dictionary = new HashSet<String>();
		dictionary.add("Gaur");
		dictionary.add("main");
		dictionary.add("reh");
		
		String word = "Gaurima";
		int minDel = getMinimumDeletion(dictionary, word);
		System.out.println(minDel );
	}

}
