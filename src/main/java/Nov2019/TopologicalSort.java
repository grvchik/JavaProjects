package Nov2019;

import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class TopologicalSort {

	public Set<String> getDependenciesChart(String[] array,Map<String,String> relationShip) {
		
		Set<String> dependencyChart = new HashSet<String>();
				
		Set<String> inputSet = new HashSet<String>();
		
		for(String arrEl :array) {
			inputSet.add(arrEl);
		}
		
		Set<String> visitedNode = new HashSet<String>();
		String indepdentNode = getIndependentNode(inputSet, relationShip);
		
		Deque <String> dependencyStack = new LinkedList<String>();
		Deque <String> resultStack = new LinkedList<String>();
		dependencyStack.add(indepdentNode);
	
		
		while(!dependencyStack.isEmpty()) {
			String topNode = dependencyStack.pop();
			
			// circle so there is an error
			if(visitedNode.contains(topNode)) {
				dependencyChart.clear();
				return dependencyChart;
			}
			//
			else {
				visitedNode.add(topNode);
				resultStack.add(topNode);
				addNeighbors(relationShip, dependencyStack,topNode);
					
			}
		}

	return dependencyChart;
	}
	
	

	
	public void addNeighbors(Map<String,String> relationShip,Deque <String> dependencyStack, String node) {
		String parent = null;
		
		for (Map.Entry <String,String> obj : relationShip.entrySet()) {
			if(obj.getValue().equals(node)) {
				parent = obj.getKey();
				dependencyStack.add(parent);
			}
		}
		
		relationShip.remove(parent);
	
		
		
	}
	
	public String getIndependentNode(Set<String> inputSet, Map<String,String> relationShip) {
		String indepdentNode = null;
		
		for (Map.Entry <String,String> obj : relationShip.entrySet()) {
			if(inputSet.contains(obj.getKey())) {
				inputSet.remove(obj.getKey());			
			}
		}	

		Iterator<String> it = inputSet.iterator();
		while(it.hasNext()) {
			return it.next();
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> relMap = new HashMap<String, String>();
		relMap.put("d","c");
		relMap.put("b","d");
		relMap.put("a","d");
		relMap.put("f","a");
		String str[] = {"a","b","c","d","f"};
		TopologicalSort ts = new TopologicalSort();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(
				 new Comparator<Integer>() {

					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o1.intValue()-o2.intValue();
					}
				}				
				);
		
		
		q.add(4);
		q.add(7);
		q.add(3);
		q.add(8);
		q.add(2);
		q.add(1);
		System.out.println(q.poll());
		System.out.println(q.poll());
		
			
		ts.getDependenciesChart(str, relMap);
		
	}

}
