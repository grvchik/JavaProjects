package Aug2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Graph {
	
	String value;
	List<Graph> connectedNeighbors ;
	
	public Graph(String valueIn) {
		this.value = valueIn;
		connectedNeighbors = new ArrayList<Graph>();;
	}
 
	public void addNeighor(Graph neighbor) {
		connectedNeighbors.add(neighbor);
	}
	
}

public class StringlyConnected {

	
	public static void findStronglyConnectedCount(Graph nodeA,Set<String> visiting ,
			Set<String> visited, int counter) {
		
	
	
		if(visiting.contains(nodeA.value)) {
			visited.add(nodeA.value);
			visiting.remove(nodeA.value);
			++counter;
			return;
		}
		
		List<Graph> neighbors = nodeA.connectedNeighbors;
		visiting.add(nodeA.value);
		for(int i=0;i<neighbors.size();i++) {
			++counter;
			Graph neighbor = neighbors.get(i);
			findStronglyConnectedCount(neighbor, visiting, visited, counter);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph nodeA = new Graph("A");
		Graph nodeB = new Graph("B");
		Graph nodeC = new Graph("C");
		
		nodeA.addNeighor(nodeB);
		nodeB.addNeighor(nodeA);
		nodeA.addNeighor(nodeC);
		nodeC.addNeighor(nodeB);
		Set<String> visiting = new HashSet<String>();
		Set<String> visited = new HashSet<String>();
		findStronglyConnectedCount(nodeA, visiting, visited, 0);
	}

}
