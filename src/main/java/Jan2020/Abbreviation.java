package Jan2020;

public class Abbreviation {

	   public static String abbreviation(String a, String b) {

		      a = a.toLowerCase();
		      b = b.toLowerCase();  
		     char charArray1[] = a.toCharArray();
		     char charArray2[] = b.toCharArray();

		    
		     boolean intersectionFound = false;

		       for(int i=0;i<charArray1.length;i++) {
		            char firstChar = charArray1[i];
		            for(int j=0;j<charArray2.length;j++) {
		                char secondChar = charArray2[j];
		                if(firstChar==secondChar) {
		                    charArray1[i]='@';
		                    charArray2[j]='@';
		                    intersectionFound = true;
		                }
		                else {
		                    continue;
		                }
		             }
		       }


		        if(!intersectionFound) {
		            return "NO";
		        }

		         for(int j=0;j<charArray2.length;j++) {
		              char secondChar = charArray2[j];
		              if(secondChar!='@') {
		                  return "NO";
		              }
		         }

		        return "YES";
		    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Pi";
		String str2 ="LJJM";
		abbreviation(str1, str2);
	}

}
