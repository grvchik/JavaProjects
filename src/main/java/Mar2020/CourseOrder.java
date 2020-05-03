package Mar2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CourseOrder {

	public static List<String> buildCourseSchedule(Map<String,String[]> relationShip) {
		
		String independentNode = getIndependentNode(relationShip);
		Set<String> visited = new HashSet<String>();
		Queue<String> dependency = new LinkedList<String>();
		List<String> result = new ArrayList<String>();
		dependency.add(independentNode);
		
		while(!dependency.isEmpty()) {
			String top = dependency.peek();
			if(visited.contains(top)) {
				return result;
			}
			result.add(top);
			visited.add(top);
			addNeighbors(relationShip,top,dependency);
		}
		return result;
	}
	
	public static void addNeighbors(Map<String,String[]> relationShip,String parent,Queue<String> dependency) {
		for(Map.Entry<String, String[]> relChart : relationShip.entrySet()) {
			String[] values = relChart.getValue();
			for(String value:values) {
				if(value.equalsIgnoreCase(parent)) {
					dependency.add(relChart.getKey());
					relationShip.remove(relChart.getKey());
				}
			}
		}
	}
	
	public static String getIndependentNode(Map<String,String[]> relationShip) {
		for(Map.Entry<String, String[]> obj :relationShip.entrySet()) {
			String key = obj.getKey();
			String values[] = obj.getValue();
			if(values.length==0) {
				return key;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
