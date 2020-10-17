package June2020;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MinDeletionsToGetWord {

	public static int minDeletionsToGetWord(Set<String> dictionary,String query) {
		Queue<String> wordQ = new LinkedList<String>();
		Set<String> wordS = new HashSet<String>();
		
		wordQ.add(query);
		wordS.add(query);
		
		while(!wordQ.isEmpty()) {
			String front = wordQ.remove();
			if(dictionary.contains(front)) {
				return query.length()-front.length();
			}
			
			for(int i = 0;i<front.length();i++) {
				String element = front.substring(0,i) +front.substring(i+1);
				wordQ.add(element);
				wordS.add(element);				
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> uni = new HashSet<String>();
		uni.add("chaman");
		uni.add("dhoop");
		uni.add("dhanbad");
		uni.add("aminabad");
		
		String query = "min";
		int res = minDeletionsToGetWord(uni, query);
		System.out.println(res);
	}

}
