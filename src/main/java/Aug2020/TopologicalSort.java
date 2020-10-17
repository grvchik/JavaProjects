package Aug2020;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class TopologicalSort {

	
	
	public static Deque<String> getDependencyRelationShip(Map<String,String> dependencyMap) {
		Deque<String> relationShip = new LinkedList<String>();
		Set<String> visited = new HashSet<String>();
		Queue<String> buildOrder = new LinkedList<String>();
		String independentNode = getIndependentNode(dependencyMap);
		buildOrder.add(independentNode);
		
		while(!buildOrder.isEmpty()) {
			String top = buildOrder.poll();
			if(visited.contains(top)) {
				return relationShip;
			}
			visitNeighbors(visited, top, buildOrder, dependencyMap);
			visited.add(top);
			relationShip.add(top);
		}
		
		return relationShip;
	}
	
	public static void visitNeighbors(Set<String> visited, String node,
			Queue<String> buildOrder,
			Map<String,String> dependencyMap) {
		for(Map.Entry<String, String> obj : dependencyMap.entrySet() ) {
			String value = obj.getValue();
			String key = obj.getKey();
			if(!visited.contains(value) && node.equalsIgnoreCase(value)) {
				buildOrder.add(key);				
			}
		
		}
		dependencyMap.remove(node);
	}
	
	public static String getIndependentNode(Map<String,String> dependencyMap) {
	
		for(Map.Entry<String, String> obj :dependencyMap.entrySet()) {
			String key = obj.getKey();
			String value = obj.getValue();
			if(dependencyMap.get(value)==null) {
				return value;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> dependencyMap = new HashMap<String, String>();
		dependencyMap.put("f","d");
		dependencyMap.put("g","a");
		dependencyMap.put("d","c");
		dependencyMap.put("a","c");
		String independent = getIndependentNode(dependencyMap);
		
		Deque<String>relationShip =  getDependencyRelationShip(dependencyMap);
		System.out.println(independent);
	}

}
