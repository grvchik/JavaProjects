package Jan2020;

public class RunningClouds {

	public   static int jumpingOnClouds(int[] c) {
	        int jumps=0;
	        int i=0;    
	        while(i<c.length-1) {
	            if(i+2<=c.length-1) {
	                if(c[i+2]==0) {
	                    jumps++;
	                    i = i +2;
	                }
	                else {
	                    jumps++;
	                    i = i+1;
	                }
	            }
	            else {
	                if(c[i+1]==0) {
	                    jumps++;
	                    i++;
	                }
	            }
	        }
	        return jumps;

	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {0, 0, 0, 1, 0, 0};
		int steps= jumpingOnClouds(nums);
		System.out.println(steps);
	}

}
