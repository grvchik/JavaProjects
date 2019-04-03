

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BuildingWithSunset {

	private static class Building {
		private Integer buildingId;
		private Integer height;
		
		Building (int buildingId,int height) {
			this.buildingId = buildingId;
			this.height = height;
		}
	}
	
	
	public static List getSunSetBuildingsEastToWest(List<Building> bldgs) {
		List<Building> sunsetList = new ArrayList<Building>();
		
		// put the first build in stack and assign it as maximum
		Deque<Integer> okLIst = new LinkedList<Integer>();
		if(bldgs==null ||bldgs.size()==0) return sunsetList;
		
		int max = 0;
		
		okLIst.addFirst(bldgs.get(0).height);
		sunsetList.add(bldgs.get(0));
		max = bldgs.get(0).height;
		
		for(int k=1;k<bldgs.size();k++) {
			Building bldg = bldgs.get(k);
			
			// get height of the topost bldg in stack
			int lastHeight = okLIst.peek();
			if(bldg.height>lastHeight) {
				okLIst.removeFirst();
				sunsetList.remove(sunsetList.size()-1);
				okLIst.add(bldg.height);
				sunsetList.add(bldg);
				max = bldg.height;
			}
			else {
				sunsetList.add(bldg);
				okLIst.addFirst(bldg.height);
			}
			
		}
		return sunsetList;
	}
	
	
	public static List getSunSetBuildings(List<Building> bldgs) {
		List<Building> sunsetList = new ArrayList<Building>();
		Deque<Integer> okLIst = new LinkedList<Integer>();
		if(bldgs==null ||bldgs.size()==0) return sunsetList;
		
		okLIst.addFirst(bldgs.get(0).height);
		sunsetList.add(bldgs.get(0));
		// for the remaining list check if they are bigger
		
		for(int k=1;k<bldgs.size();k++) {
			Building bldg = bldgs.get(k);
			
			// get height of the topost bldg in stack
			int lastHeight = okLIst.peek();
			if(bldg.height>lastHeight) {
				okLIst.addFirst(bldg.height);
				sunsetList.add(bldg);
			}
			
		}
		
		
		System.out.println(okLIst.size());
		return sunsetList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building b1 = new Building(1,4);
		Building b2 = new Building(2,5);
		Building b3 = new Building(3,6);
		List<Building> bldgs = new ArrayList<Building>();
		bldgs.add(b1);
		bldgs.add(b2);
		bldgs.add(b3);
		//getSunSetBuildings(bldgs);
		getSunSetBuildingsEastToWest(bldgs);
		
	}

}
