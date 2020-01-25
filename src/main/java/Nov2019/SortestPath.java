package Nov2019;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

 class Graph {
    int value;
    List children;
        
    // Basic constructor
    public Graph(int value) {
        this.value = value;
    }
        
    // Lazily instantiate children list
    public void addChild(Graph n) {
        if (this.children == null) this.children = new LinkedList();
        this.children.add(n);
    }
}

public class SortestPath {

	public List<Graph> getShortestPath(Graph g1,Graph g5) {
		HashMap<Graph,Graph> parents = new HashMap();
		
		
		Queue<Graph> toVisit = new LinkedList<Graph>();
		if(!toVisit.contains(g1)) {
			toVisit.add(g1);
			parents.put(g1, null);
		}
		while(!toVisit.isEmpty()) {
			Graph node = toVisit.poll();
			if(node==g5) {
				break;
			}
			
			if(node.children==null) {
				continue;
			}
			
			for( int i=0;i< node.children.size();i++) {
				Graph child = (Graph)node.children.get(i);
				if(!parents.containsKey(child)) {
					toVisit.add(child);
					parents.put(child, node);
				}
			}			
		}
		
		if(parents.get(g5)==null) {
			return null;
		}
		
		 // Create the output list and add the path to the list
	    List out = new LinkedList();
	    Graph n = g5;
	    while (n != null) {
	        out.add(0, n);
	        n = parents.get(n);
	    }
	        
	    return out;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph g1 = new Graph(1);
		Graph g2 = new Graph(2);
		Graph g3 = new Graph(3);
		Graph g4 = new Graph(4);
		Graph g5 = new Graph(5);		
	
		g1.addChild(g2);
		g1.addChild(g3);
		g2.addChild(g5);
		g5.addChild(g4);
		g4.addChild(g3);
		g4.addChild(g1);
	
		
		SortestPath sp = new SortestPath();
		Map<String,String> pathMap = new HashMap<String, String>();
		Set<Integer> visited = new HashSet<Integer>();
		pathMap.put(String.valueOf(g1.value), "-1");;
		sp.getShortestPath(g1, g5);

		
		
	}

}
