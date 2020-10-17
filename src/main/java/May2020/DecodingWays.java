package May2020;

public class DecodingWays {

	public static int inventory[] = {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	public static int total = 0;
	public static int getDecodingWays(String str) {
	//base case 1	
	  if(str==null || str.length()==0 || str.startsWith("0")) {
		return 0;
	  }
	
	  if(str.length()==1) {
		  int intRep = Integer.valueOf(str);
		  return inventory[intRep];
	  }
	 
	  String lastPart = str.substring(1);
	  
	  
	  total = total + getDecodingWays(lastPart);
	
	  
	  return total;
	}
	
	
	public static int getDoubleStringPossibilities(String str) {
		
		 int counter=0;
		 
		 while(counter+2<=str.length()) {
			 String firstPart = str.substring(counter, counter+2);
			  int intRep = Integer.valueOf(firstPart);
			  if(intRep >=1 && intRep<=26 ) {
				  total = total + inventory[intRep];
			  }			 
			 counter++;
		 }
		
		return total;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int possibilities = getDecodingWays(str);
		
		int possibilities2 = getDoubleStringPossibilities(str);
		System.out.println(possibilities+possibilities2);
	}

}
