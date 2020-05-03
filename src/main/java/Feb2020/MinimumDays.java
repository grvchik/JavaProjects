package Feb2020;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MinimumDays {
	private static final Scanner scanner = new Scanner(System.in);
    static int minTime(int[] machines, int goal) {
    	
    	int [] days = new int[1000];
    	int indexFound=-1;
    	for(int i=1;i<=days.length;i++) {
    		int maxItems=0;
    		int itemDelievered=0;
    		for(int  machine:machines) {
    		  if(machine<=i) {
    			   itemDelievered += (i/machine);
    			  maxItems = Math.max(itemDelievered, maxItems);
    		  }    			
    		}//for
    		days[i] =maxItems;
    		if(maxItems==goal) {
    			indexFound = i;
    			break;
    		}
    	}//for
    	return days[indexFound];
    }// long


	  public static void main(String g[]) {
		  
		  int [] machine = {2,3};
		  int goal  = 5;
		  
		  minTime(machine, goal);
	  }
}
