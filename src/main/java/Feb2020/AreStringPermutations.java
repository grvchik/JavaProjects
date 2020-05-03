package Feb2020;

public class AreStringPermutations {

	public static boolean permutationPalindrome(String str1,String str2) {

		byte[] bytearr1 = str1.getBytes();
		byte[] bytearr2 = str2.getBytes();
		boolean res= false;
		int[] placeHolderArray = new int[256];
		
		
			
			for(byte b: bytearr1) {
				placeHolderArray[b] = placeHolderArray[b]+1;
				System.out.println("Adding byte"+b);
			}
			for( byte b: bytearr2) {
				placeHolderArray[b] = placeHolderArray[b]-1;
				System.out.println("Removing byte"+b);
			}

		
		
		int nonZeroOccurences = 0;
		 nonZeroOccurences = checkNonZeroOccurences(placeHolderArray);
		 if(str1.length()%2==0) {			
			 if(nonZeroOccurences==0) {
				res = true;
			 }
		 }
		 else {
			 if(nonZeroOccurences==0) {
					res = true;
			 }
		 }
		return res;	
	}
	
	public static int checkNonZeroOccurences(int[] placeholder) {
		int nonZeroCounter=0;
		for(int num :placeholder) {
			if(num!=0) {
				++nonZeroCounter;
			}
		}
		return nonZeroCounter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str1="Indrajee";
		String str2="jeeIndra";
		System.out.println(permutationPalindrome(str1, str2));
	}

}
