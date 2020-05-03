package Jan2020;

public class ValidString {

	
	public static boolean validString (String input) {
		
		 byte value[]= input.getBytes();
		 
		 int[] num = new int[256];
		 int min =Integer.MAX_VALUE;
		 int max = Integer.MIN_VALUE;
		 for (int i=0;i<value.length;i++) {
			byte val = value[i];
			num[val] ++;
			min = Math.min(min, num[val]);
			max = Math.max(max, num[val]);	
		 }
		 
		
		 
		 if (Math.abs(max-min)>1){
			 return false;
		 }
	  
		 return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "rockyhandsomee";
		System.out.println(validString(value));
	}

}
