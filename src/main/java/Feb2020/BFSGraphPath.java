package Feb2020;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;


public class BFSGraphPath {

	
	public static boolean getPathExistence(Graph start,Graph end) {
		
		Queue<Graph> queue = new ArrayDeque<>();
		Set <Integer> visited = new HashSet<Integer>();
		Set <Integer> visiting = new HashSet<Integer>();
		queue.add(start);
		
		while(!queue.isEmpty()) {
		 Graph top = 	queue.poll();
		 if(visited.contains(top.id)) {
			 continue;
		 }
		
		
		 
		 List <Graph> neighbors = top.neighbors;
		  for(Graph neighbor :neighbors) {
			if(visiting.contains(neighbor.id)) {
				visiting.remove(neighbor.id);
				visited.add(neighbor.id);
			}
			
			
			  queue.add(neighbor);
			  if(neighbor.id==end.id) {
				  return true;
			  }
			  
		  }
		  visited.add(top.getId());
		 
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph source = new Graph(3);
		
		Graph five = new Graph(5);
		Graph six = new Graph(6);
		Graph four = new Graph(4);
		Graph eight = new Graph(8);
		
		source.addNeighbour(four);
		source.addNeighbour(eight);
		eight.addNeighbour(source);
		four.addNeighbour(source);
		four.addNeighbour(six);
		six.addNeighbour(four);
		source.addNeighbour(five);
		five.addNeighbour(source);
		getPathExistence(source, six);
	}

}
