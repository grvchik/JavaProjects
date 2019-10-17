package Oct2019;

public class Anagram {

	public static boolean isAnagram(String str1,String str2) {
		int ascii[] = new int[256];
		
		char str1Array[] = str1.toCharArray();
		
		for(char c :str1Array) {			
			int asciiValue = (int)c;
			ascii[asciiValue] =ascii[asciiValue] +1; 			
		}
		
		
		
		char str2Array[] = str2.toCharArray();
		for(char c :str2Array) {			
			int asciiValue = (int)c;
			ascii[asciiValue] =ascii[asciiValue] -1; 			
		}	
		
		
		for (int val : ascii) {
			if(val!=0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "aman";
		String str2 = "aman";
		
		
		System.out.println(isAnagram(str1, str2));
		
		
	}

}
