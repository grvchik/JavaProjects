package July;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	private int V;   // No. of vertices 
	  
    // Array  of lists for Adjacency List Representation 
    private LinkedList<Integer> adj[]; 
    
    public Graph(int v) {
    	this.V = v;
    	adj = new LinkedList[v];
    	for(int i=0;i<v;i++) {
    		adj[i] = new LinkedList<Integer>();
    	}
    }
    
	public void addEdge(int v,int w) {
		adj[v].add(w);
	}
    
	
	public void DFSUtil(int v,boolean visited[]) {
		visited[v] = true;
		System.out.println("visited"+v);		
		Iterator<Integer> iter = adj[v].listIterator();
		while(iter.hasNext()) {
			int neighbor = iter.next();
			if(visited[neighbor]==false) {
				DFSUtil(neighbor, visited);	
			}			
		}		
	}
	
	public void DFS(int v) {
		boolean []visited = new boolean[this.V];
		
		DFSUtil(v,visited);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(4); 
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		g.DFS(0);
		
		
		
		
	}

}
