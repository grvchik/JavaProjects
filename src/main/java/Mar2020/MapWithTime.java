package Mar2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MapTime {

private Map<Integer,List<Integer>>  keyValueMap = null;
private Map<Integer,Integer> valueTimeMap = null;

public MapTime() {
	this.keyValueMap = new HashMap<Integer,List<Integer>>();
	this.valueTimeMap = new HashMap<Integer,Integer>();
 }	


	public Integer getKeyTime(int key, int time) {
		
		// try to find any time less than the given time
		// if yes then what value it has
		// return that value possibily the max so far
        int minValue = time;
        int valueIn = Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> obj : this.valueTimeMap.entrySet()) {
			if(obj.getValue()<time) {
				valueIn = Math.max(valueIn, obj.getKey());
			}
		}
		
		if(valueIn==Integer.MIN_VALUE) {
			return null;
		}
		 
		
		return valueIn;
	}

	public void setKeyValueAtTime(int key,int value,int time ) {
		
		//does value already exists in time table and time is later then update time
		if(valueTimeMap.containsKey(value)) {
			int existingTime = valueTimeMap.get(value);
			valueTimeMap.put(value,Math.min(existingTime, time));		
		}
		else {
			valueTimeMap.put(value, time);		
		}
		
		if(keyValueMap.containsKey(key)) {
			List <Integer> valList = keyValueMap.get(key);
			if(!valList.contains(value)) {
				valList.add(value);
			}
		}
		else {
			List <Integer> valList = new ArrayList<Integer>();
			valList.add(value);			
			keyValueMap.put(key,valList );			
		}
		
	}
}


public class MapWithTime {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTime mpt = new MapTime();
		mpt.setKeyValueAtTime(1, 1,0);
		mpt.setKeyValueAtTime(1, 2,2);
		mpt.setKeyValueAtTime(1, 1,5);
		int res1 = mpt.getKeyTime(1,1);
		System.out.println(res1);
		
		System.out.println(mpt.getKeyTime(1,0));	
		int res3 = mpt.getKeyTime(1,10);
		System.out.println(res3);			
	}

}
