package Feb2020;

public class AttendanceReward {

	public static boolean checkRecord(String str) {
		if(str==null) {
			return false;
			
		}

		int absentCounter=0;
		int lateCounter = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A') {				
				++absentCounter;
			}
			if(i>0 && str.charAt(i)=='L' && str.charAt(i)==str.charAt(i-1)) {
				++lateCounter;
			}			
		}
        System.out.println("lateCounter"+lateCounter);
        
		if(absentCounter>1 || lateCounter>2) {
			return false;
		}
		
            
		return true;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "LLPPPLL";
		System.out.println(checkRecord(str1));
		String str2 = "PPALLL";
		System.out.println(checkRecord(str2));
		
	}

}
