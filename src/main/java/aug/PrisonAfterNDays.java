package aug;

public class PrisonAfterNDays {

	   public static int[] prisonAfterNDays(int[] cells, int N) {
	        int counter = 0;
	        int newCells[] = new int[cells.length];
	        while(counter<N) {
	            newCells[0] = cells[0];
	            for(int i=1;i<cells.length;i++) {
	                if(i+1<cells.length) {
	                    if(cells[i-1]==cells[i+1]) {
	                     newCells[i] = 1;    
	                    }
	                    else {
	                     newCells[i] = 0;    
	                    }                    
	                }
	                else {
	                     newCells[i] = 0;    
	                }                        
	            }	            
	             cells = newCells;
	            
	             newCells = new int[cells.length];
	            ++counter;
	        }
	        return newCells;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cells[] = {0,1,0,1,1,0,0,1};
		prisonAfterNDays(cells, 1);
	}

}
