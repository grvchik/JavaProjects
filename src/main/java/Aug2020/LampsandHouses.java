package Aug2020;

import java.util.Arrays;

public class LampsandHouses {


	public static int getRadis(int[] lamps,int[] houses) {
	
		 int lampCounter=0;
		 int houseCounter=0;
		 int radius = 0;
		 int difference=0;
		 while(lampCounter<lamps.length-1 && houseCounter<houses.length) {
			  difference = Math.abs(lamps[lampCounter]-houses[houseCounter]);
			 radius = Math.max(radius, difference);
			 houseCounter++;
			 lampCounter++;
			 
			 if(houseCounter==houses.length-1) {
				 break;
			 }
			 if(lampCounter==lamps.length-1) {
				 break;
			 }
		 }
		 
		 while(houseCounter!=houses.length-1) {
			  difference = Math.abs(lamps[lampCounter]-houses[++houseCounter]);
			  
		 }
		 
		 return radius;
	}
	public static int getRadius(int[] lamps,int[] houses) {
		Arrays.sort(lamps);
		Arrays.sort(houses);
		int i = 0;
		int radius = 0;
		for(int house:houses) {
			while(i<lamps.length-1 && lamps[i]+lamps[i+1]<=house*2) {
				i = i +1;
			}
			System.out.println(i+"th element is "+lamps[i]);
			radius = Math.max(radius, Math.abs(lamps[i]-house));
		}
		return radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lamps = {0,2,4};
		int[] houses = {1,3,5,6};
		int res = getRadius(lamps, houses);
		System.out.println(res);
		res = getRadis(lamps, houses);
		System.out.println(res);
	}

}
