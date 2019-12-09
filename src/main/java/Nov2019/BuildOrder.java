package Nov2019;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BuildOrder {

	public static List buildOrder(int[][] processes) {
		List result = new LinkedList();
		
		Set<Integer> visited = new HashSet<Integer>();
		Set<Integer> visiting = new HashSet<Integer>();
		
		int rows = processes.length;
		
		for(int i=0;i<rows;i++) {
			 if (!visited.contains(i)) {
			    visitNeighbors(i, processes, visited, visiting,result);
			 }
		}
		
		return result;
	}
	
	
	private static void visitNeighbors(int process,int[][]processes, Set<Integer> visited,Set<Integer> visiting,List<Integer> result) {
		if(visiting.contains(process)) {
		   return;
		}
		
		if(!visited.contains(process)){
			visiting.add(process);
		}
		
		for (int i:processes[process]) {
			visitNeighbors(i, processes, visited, visiting,result);
	
		}
		visiting.remove(process);
		visited.add(process);
		result.add(process);
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] processes = {
				{},
				{0},
				{0},
				{1,2},
				{3}
		};
		BuildOrder bo = new BuildOrder();
		bo.buildOrder(processes);
	}

}
