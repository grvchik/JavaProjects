package Sept2019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProjectDependency {

	
	public static List<String> buildOrder(String[][] processes) {
		Set<String> tempMarkers = new HashSet<String>();
		Set<String> permanentMarkers=new HashSet<String>();
		List<String> result = new ArrayList<String>();
		
		for(int i=0;i<processes.length;i++) {
			String[] processArray = processes[i];
			
			String preReq = processArray[0];
			
			visit(preReq, tempMarkers, permanentMarkers, result);
			for (int j = 1;j<processArray.length;j++) {
				System.out.println(processArray[j]);
				visit(processArray[j], tempMarkers, permanentMarkers, result);
			}
		}
		
		return result;
	}
	
	public static void visit(String process,Set<String> tempMarkers,Set<String> permanentMarkers,List<String> result) {
		
		// find all the neighbors of this process and if not contained in temporary marker then add them
		if(tempMarkers.contains(process)) {
			permanentMarkers.add(process);
			tempMarkers.remove(process);
			result.add(process);
		}
		
		if(!permanentMarkers.contains(process)&& !tempMarkers.contains(process)) {
			tempMarkers.add(process);		
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> order = new HashMap<String,String>();
		order.put("a","d");
		order.put("f","b");
		order.put("b","d");
		order.put("f","a");
		order.put("d","c");
		
		String[][] depe = {
				{"0"},
				{"1","0"},
				{"2","0"},
				{"3","1","2"},
				{"4,3"}
		};	
		
		
	buildOrder(depe);
	}
}
