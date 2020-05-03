package Feb2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Graph {
	int id;
	long color;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		
	}

	public long getColor() {
		return color;
	}

	public void setColor(long color) {
		this.color = color;
	}

	public List<Graph> getNeighbors() {
		return neighbors;
	}

	public void addNeighbour(Graph neighor) {
		this.neighbors.add(neighor);
	}
	
	public void setNeighbors(List<Graph> neighbors) {
		this.neighbors = neighbors;
	}

	List<Graph> neighbors;
	
	public Graph(int id) {
		this.id = id;
		this.neighbors = new ArrayList<Graph>();
	}
}

public class GraphNearestNeighbors {

	public static int findShortest(int graphNodes, int[] graphFrom, int[] graphTo, long[] ids, int val) {
		
		Map<Integer,Graph> graphMap = new HashMap<Integer,Graph>();
		buildGraphRelationShip(graphNodes, graphFrom, graphTo, ids, graphMap);
		
//		System.out.println(graphMap);
		Graph sourceGraph= null;
		for(Map.Entry<Integer, Graph> obj : graphMap.entrySet()) {
			
			Graph src = obj.getValue();
			if(src.getColor()==val) {
				sourceGraph = src;
				break;
			}
			
		}
		
		Set<Integer> visited = new HashSet<Integer>();
		
		Integer dist =findDistance(val,  sourceGraph,visited,0); 
		System.out.println("final"+dist);
		return dist;
		
	}
	
	

	 public static int findDistance(int targetColor,Graph sourcGraph,Set<Integer> visited,Integer distance) {
		 
		 List<Graph> neighbors = sourcGraph.getNeighbors();
		 
		 if(neighbors.isEmpty()) {
			 return -1;
		 }
		if(visited.contains(sourcGraph.getId())) {
			return -1;
		}
		
		 visited.add(sourcGraph.getId());
		 for( int i=0;i<sourcGraph.getNeighbors().size();i++) {
			 
			 Graph nh = sourcGraph.getNeighbors().get(i);
			  if(visited.contains(nh.getId())) {
					continue;
				} 
			if(targetColor==nh.getColor()) {
				 return 0;
			 }
			 else {
				  distance = findDistance(targetColor, nh, visited,distance);
				 if(distance>=0) {
					 ++distance;
				 }
			 }
		 }
		
		 System.out.println(distance);
		 return distance;
	 }
	
	
	public static void buildGraphRelationShip(int graphNodes, int[] graphFrom, int[] graphTo, long[] ids,Map<Integer,Graph> graphMap) {
		for(int i= 1;i<=graphNodes;i++) {
			Graph gph = new Graph(i);
			graphMap.put(i, gph);
		}
		
		for (int k=0;k<graphFrom.length;k++) {
			int fromId = graphFrom[k];
			int toId = graphTo[k];
			Graph from = graphMap.get(fromId);
			Graph to = graphMap.get(toId);			
			from.addNeighbour(to);
			to.addNeighbour(from);
			graphMap.put(fromId, from);
		}
		
		int Id = 1;
		for(int j=0;j<ids.length;j++) {
			Graph gp = graphMap.get(Id);
			gp.setColor(ids[j]);			
			Id++;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graphNodes = 5;
		int[] graphFrom = {1,1,2,3};
		int[] graphTo = {2,3,4,5};
		long[] colors = {1,2,3,3,2};
		int target = 2;
		findShortest(graphNodes, graphFrom, graphTo, colors, target);
	}

}
