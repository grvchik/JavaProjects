package Jan2020;

public class CountValleys {

	  static int countingValleys(String s) {
	        int vallleCounter=0;
	        char lastStep='"';
	        int stepDirection=0;
	        for (int i =0;i<s.length();i++) {
	            char curStep = s.charAt(i);
	            if(lastStep=='U' && curStep=='D') {
	                stepDirection--;
	            }
	            else if(lastStep=='"' && curStep=='D') {
	                stepDirection--;
	            }
	            else {
	                if(curStep=='D') {
	                    stepDirection--;
	                }
	                else {
	                	if(stepDirection<0) {
	                		stepDirection++;	
	                	}
	                    
	                }
	            }
	            lastStep = curStep;
	            if(stepDirection==0) {
	                ++vallleCounter;
	            }
	        }
	        return vallleCounter;
	    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "UDDDUDUDUU";
		int steps = countingValleys(str);
		System.out.println(steps);
	}

}
