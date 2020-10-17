package June2020;

import java.util.PriorityQueue;

class TimeEntry implements Comparable<TimeEntry>{
	public int enterTime;
	public int exitTime;
	public int noOfPeople;
	
	public TimeEntry(int enterIn, int exitOut, int peopleIn) {
		this.enterTime = enterIn;
		this.exitTime = exitOut;
		this.noOfPeople = peopleIn;
	}
	
	@Override
	public int compareTo(TimeEntry o) {
		// TODO Auto-generated method stub
		return this.enterTime-o.enterTime;
	}
}

public class BusinesTime {

	public static int findBusiestTime(PriorityQueue<TimeEntry> timedEntries) {
		int maxEntryTime = Integer.MIN_VALUE;
		int minExitTime = Integer.MAX_VALUE;
		int noOfPersonInside = 0;
		int maxPerson = Integer.MIN_VALUE;
		while(!timedEntries.isEmpty()) {
			TimeEntry first = timedEntries.poll();
			System.out.println("Entry time:==="+first.enterTime+" Exit time:==="+first.exitTime);
			maxEntryTime = Math.max(maxEntryTime, first.enterTime);
			minExitTime = Math.min(minExitTime, first.exitTime);
			if(maxEntryTime<minExitTime) {
				noOfPersonInside = noOfPersonInside +first.noOfPeople;
			}
			else {
				maxEntryTime = first.enterTime;
				minExitTime = first.exitTime;
				System.out.println("new window");
				noOfPersonInside=0;
				noOfPersonInside = first.noOfPeople;
			}
			maxPerson = Math.max(maxPerson, noOfPersonInside);
		}
		System.out.println(maxPerson);
		return maxPerson;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeEntry te1 = new TimeEntry(2,4, 2);
		TimeEntry te2 = new TimeEntry(1,3, 3);
		TimeEntry te3 = new TimeEntry(4,7, 5);
		TimeEntry te4 = new TimeEntry(3,5, 8);
		PriorityQueue<TimeEntry> pq = new PriorityQueue<TimeEntry>();
		pq.add(te1);
		pq.add(te2);
		pq.add(te3);
		pq.add(te4);
		findBusiestTime(pq);
	}

}
