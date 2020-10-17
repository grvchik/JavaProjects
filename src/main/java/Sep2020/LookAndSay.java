package Sep2020;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LookAndSay {

	public static void lookAndSay(int num) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
	
		Map<Integer,Integer> keyValMap = new HashMap<Integer,Integer>();
		queue.add(1);
		for(int i=0;i<=num;i++) {
			System.out.println();
			while(!queue.isEmpty()) {
				Integer elem = queue.poll();
				System.out.print(elem);
				Integer counter = keyValMap.get(elem);
				if(counter!=null) {
					keyValMap.put(elem, counter+1);
				}
				else {
					keyValMap.put(elem, 1);
				}
			}
			
					
		    for(Map.Entry<Integer, Integer> obj :keyValMap.entrySet()) {
		    	queue.add(obj.getValue());
		    	queue.add(obj.getKey());
		    }
		
		    keyValMap.clear();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lookAndSay(3);
	}

}
