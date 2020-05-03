package Mar2020;

class LocationPair {
	public int location1;
	public int location2;
	
	public LocationPair(int first,int second) {
		setLocation(first, second);
	}
	
	public void setLocations(LocationPair loc) {
		setLocation(loc.location1, loc.location2);
	}
	
	public void setLocation(int first,int second) {
		this.location1 = first;
		this.location2=second;
	}
	
	public int distance() {
		return Math.abs(location1-location2);
	}
	
	public boolean isValid() {
		return location1>=0 && location2>=0;
	}
	
	public void updateWithMin(LocationPair lpair) {
		if(isValid() || (lpair.distance() < distance())) {
			setLocations(lpair);
		}
	}
}
public class WordDistance {

	public static LocationPair findClosest(String[] words,String word1,String word2) {
		
		LocationPair current = new LocationPair(-1, -1);
		LocationPair best = new LocationPair(-1, -1);
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			if(word1.equals(word)) {
				int locationIndex = i;
				current.location1 = locationIndex;
				best.updateWithMin(current);				
			}
			else if(word2.equals(word)) {
				int locationIndex = i;
				current.location2 = locationIndex;
				best.updateWithMin(current);				
				
			}			
		}
		return best;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
