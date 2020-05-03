package April2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EntryExit implements Comparable<Long>{

	public Long timeIn;
	public int countIn;
	public String typeEntryIn;
	
	
	EntryExit(Long time,int count,String typeEntry) {
		this.timeIn = time;
		this.countIn = count;
		this.typeEntryIn = typeEntry;
	}


	@Override
	public int compareTo(Long o) {
		// TODO Auto-generated method stub
		return this.timeIn.compareTo(o);
	}
}

public class BusyTime {

	public static int findBusiestTime(List<EntryExit> sortedList ) {
		
		Collections.sort(sortedList, new Comparator() {
		 
			@Override
		public int compare(Object o1, Object o2) {
			EntryExit e1 = (EntryExit)o1;
			EntryExit e2 = (EntryExit)o2;
			return e1.timeIn.intValue() - e2.timeIn.intValue();
		    
		}
		 });
		
		int peopleCounter=0;
		int maxPeople = Integer.MIN_VALUE;
		for(int i=0;i<sortedList.size();i++) {
			
			EntryExit e1 = sortedList.get(i);
			if(e1.typeEntryIn.endsWith("enter")) {
				peopleCounter += e1.countIn;
			}
			else {
				peopleCounter -= e1.countIn;
			}
			maxPeople = Math.max(maxPeople, peopleCounter);
		}
		return maxPeople;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long l1 = new Long(12345);
		Long l2 = new Long(12346);
		Long l3 = new Long(12347);
		Long l4 = new Long(12387);		
		EntryExit entExit1 = new EntryExit(l1, 2, "enter");
		EntryExit entExit2 = new EntryExit(l2, 3, "enter");
		EntryExit entExit3 = new EntryExit(l3, 7, "exit");
		EntryExit entExit4 = new EntryExit(l4, 6, "exit");
		List<EntryExit> list = new ArrayList<EntryExit>();
		list.add(entExit1);
		list.add(entExit2);
		list.add(entExit3);
		list.add(entExit4);
		findBusiestTime(list);
	}

}
