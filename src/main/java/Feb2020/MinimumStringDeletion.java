package Feb2020;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MinimumStringDeletion {

	public static int delete(String query, HashSet dictionary) {
	    Queue<String> queue = new LinkedList<String>();
	    Set queueElements = new HashSet();

	    queue.add(query);
	    queueElements.add(query);

	    while (!queue.isEmpty()) {
	        String s = queue.remove();
	        queueElements.remove(s);
	        if (dictionary.contains(s)) return query.length() - s.length();

	        for (int i = 0; i < s.length(); i++) { 
	        	
	        	  String sub = s.substring(0, i) + s.substring( i+1, s.length()); 
	        	  
	        	  if (sub.length() > 0 && !queueElements.contains(sub)) {
	                queue.add(sub);
	                queueElements.add(sub);
	            }
	        }
	    }
	    return -1;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>  dictionary = new HashSet<String>();
		dictionary.add("a");
		dictionary.add("aa");
		dictionary.add("aaa");
		String query = "abc";
		delete(query, dictionary);
	}

}
