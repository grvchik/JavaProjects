

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoatsToSavePeople {

	
    public static int numRescueBoats(int[] people, int limit) {
        int boatCounter=0;
        List <Integer> peopleList = new ArrayList<Integer>();
        
        if(people==null) return -1;
        
        for(int i=0;i<people.length;i++) {
        	peopleList.add(people[i]);
        	
        }
        
        if(peopleList.size()==1 && peopleList.get(0)<=limit) {
        	return 1;
        }
        
        int lastSize = peopleList.size();
        
        Stack<Integer> boat = new Stack<Integer>();
        boolean counterDecreased = false;
        for(int i=0;i<peopleList.size();i++) {
        	
        	boat.push(limit);
      
        		boatCounter+= getBoats(i,peopleList,limit,boat);	
    
        	boat.pop();
        	if(peopleList.size()<lastSize) {
        		lastSize = peopleList.size();
        		i--;
        	}
        	
        }
        
        return boatCounter;
    }	
	
    
    
    public static int getBoats (int startIndex, List<Integer> peopleList, int limit,Stack<Integer> boat) {
    	
    	// teminating condition 
    	if(startIndex==peopleList.size()-1) {

    		// check of stack is at same capacity it was set initially means boat is still empty
    		if(boat.isEmpty()|| boat.peek()<=limit) {
    			int diff = boat.peek()-peopleList.get(startIndex);
	       		 if(diff>=0) {
	         		boat.pop();
	         		boat.push(diff);	
	         		peopleList.remove(startIndex);
	         	
	         		--startIndex;
	     		}    			
    			return 1;
    		}
    		else {
    			return 0;
    		}
    	}
    	else {
    		
    		if(boat.peek()==0) {
    			return 1;
    		}
    		
    		int diff = boat.peek()-peopleList.get(startIndex);

    		 if(diff>=0) {
        		boat.pop();
        		boat.push(diff);	
        		peopleList.remove(startIndex);
        	
        		--startIndex;
    		}
    		return getBoats(++startIndex, peopleList, limit, boat);
    	}
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] people = {1,2};
		int limit = 3;
		int answer = numRescueBoats(people, limit);
		System.out.println(answer);
	}

}
