package June2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CourseSchedule {
	public static List<String> buildCourseSchedule(Map<String,String[]> relationShip) {
		List<String> result = new ArrayList<String>();
		String independentNode = getIndependentNode(relationShip);
		Queue<String> topologicalPath = new LinkedList<String>();
		Set<String> visited = new HashSet<String>();
		topologicalPath.add(independentNode);
	
		while(!topologicalPath.isEmpty()) {
			String top = topologicalPath.peek();
			if(visited.contains(top)) {
				return result;
			}
			//visitNeighbors
			result.add(top);
			visited.add(top);
		}
		return result;
	}
	
	
	public static void visitNeighbors(Map<String,String[]> relationShip,Queue<String> topologicalPath,String top) {
		for(Map.Entry<String, String[]> obj: relationShip.entrySet()) {
			String key = obj.getKey();
			String neighbors[] = obj.getValue();
			if(key.equalsIgnoreCase(top)) {
				for(String neighbor :neighbors) {
					topologicalPath.add(neighbor);
					relationShip.remove(key);
				}
			}
		}
	}
	
	public static String getIndependentNode(Map<String,String[]> relationShip) {
		for(Map.Entry<String, String[]> obj: relationShip.entrySet()) {
			String key = obj.getKey();
			String [] prereqs = obj.getValue();
			if(prereqs==null || prereqs.length==0) {
				return key;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
