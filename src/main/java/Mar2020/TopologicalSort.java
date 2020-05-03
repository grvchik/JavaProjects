package Mar2020;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class TopologicalSort {

	public static Set<String> findBuildOrder(Map<String,String> dependencies) {
		
		String independentNode = findIndependentNode(dependencies);
		Queue<String> buildOrder = new LinkedList<String>();
		Set<String> visited = new HashSet<String>();
		buildOrder.add(independentNode);
		Set<String> dependencyStack = new HashSet<String>();
		while(!buildOrder.isEmpty()) {
			
			String topNode = buildOrder.poll();
			
			if(visited.contains(topNode)) {
				return dependencyStack;
			}
			
			 visitNeighbours(dependencyStack,topNode,visited,dependencies,buildOrder);
			 visited.add(topNode);
			 dependencyStack.add(topNode);
		}
		return dependencyStack;
	}
	
	public static void visitNeighbours(Set<String>dependencyStack,String topNode,
			Set<String> visited,Map<String,String> dependencies,Queue<String> buildOrder ) {
		
		
		  for(Map.Entry<String,String> obj: dependencies.entrySet()) {
			  String key = obj.getKey();
			  String value = obj.getValue();
			  if(value.equalsIgnoreCase(topNode)) {
				   if(visited.contains(key)) {
					   return;
				   }
				   buildOrder.add(key);
				
			  }

		  }
		
		 
		   dependencies.remove(topNode);

		   
	}
	
	public static String findIndependentNode(Map<String,String> dependecies) {
		for(Map.Entry<String, String> obj: dependecies.entrySet()) {			
			String key = obj.getKey();
			String value = obj.getValue();			
			if(dependecies.get(value)==null) {
				return value;
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> dependency = new HashMap<String, String>();
		dependency.put("a","d");
		dependency.put("f","b");
		dependency.put("b","d");
		dependency.put("d","c");
		findBuildOrder(dependency);
	}

}
