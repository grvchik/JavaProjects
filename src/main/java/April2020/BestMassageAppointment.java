package April2020;

import java.util.HashSet;
import java.util.Set;

public class BestMassageAppointment {

	public static int getBestMassageAppointments(int[]appointmentList) {
		int[] memo = new int[appointmentList.length+2];
		return getAppointments(appointmentList,0,memo);
		
	}
	
	
	public static int getAppointments(int[]appointmentList,int index,int[]memo) {
		if(index>=appointmentList.length) {
			memo[index] = 0;
			return 0;
		}
		
		if(memo[index]>0) {
			return memo[index];
		}
		int slotWithout = appointmentList[index] +getAppointments(appointmentList,index+2,memo);
		int slotWith = getAppointments(appointmentList,index+1,memo);
		memo[index] = Math.max(slotWithout, slotWith);
		System.out.println(memo[index]);
		return memo[index];
	}
	
	
	public static int getBestMessageIteration(int[] appointList) {
		
		int[] memo = new int[appointList.length+2];
		memo[appointList.length] = 0;
		memo[appointList.length+1] = 0;
		for(int i = appointList.length-1;i>=0;i--) {
			int bestWith = appointList[i]+memo[i+2];
			int bestWithout = memo[i+1];
			memo[i] = Math.max(bestWith, bestWithout);			
		}
		return memo[0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int slot2[] = {30, 15, 60, 75, 45, 15, 15, 45};
		int[] slots = {10,20,30,40};
		getBestMassageAppointments(slots);
		int max = getBestMessageIteration(slot2);
		System.out.println(max);
	}

}
