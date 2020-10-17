package May2020;

public class DictionarywordsRotation {

	public static int findRotationPointUsingBinarySearch(String[] array) {
		String firstWord = array[0];
		
		int floorIndex = 0;
		int ceilIndex = array.length-1;
		
		while(floorIndex<ceilIndex) {
			
			int guessIndex = (floorIndex+ceilIndex)/2;
			
			String wordAtGuessIndex = array[guessIndex];
			
			if(compareTwo(firstWord, wordAtGuessIndex)) {
				floorIndex = guessIndex;
			}
			else {
				ceilIndex = guessIndex;
			}
			
			if(floorIndex+1==ceilIndex) {
				break;
			}
		}
		return ceilIndex;
	}
	
	
	public static int findRotationPoint(String[] array) {
		
		int begIndex = 0; int endEndex = array.length-1;
		boolean rotationPOintFound = false;
		int rotationPOint = Integer.MAX_VALUE;
		while(begIndex<endEndex) {
			String begWord = array[begIndex];
			String endWord = array[endEndex];
			
			if(compareTwo(begWord, endWord)) {
				
				begIndex++;
				if(rotationPOintFound) {
					rotationPOint = Math.min(rotationPOint, endEndex);
					return endEndex+1;
				}
			}
			else {
				
				endEndex--;
				rotationPOintFound = true;
				
			}
			
		}
		
		return array.length-1;
	}
	
	
	public static boolean compareTwo(String word1,String word2) {
		
		char firstchar[] = word1.toCharArray();
		char secondchar[] = word2.toCharArray();
		
		int firstLength = firstchar.length;
		int secondLength = secondchar.length;
		
		int minLength = Math.min(firstLength, secondLength);
		
		int index=0;
		while(index<minLength) {
			int diff = firstchar[index]-secondchar[index];
			if(diff< 0) {
				return true;
			}
		
			if(diff>0) {
				return false;
			}
			
			index++;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"cbhor","che","abhi","cad","cat"};
		long beg = System.currentTimeMillis();
		int rot = findRotationPoint(str);
		long end = System.currentTimeMillis();
		System.out.println(rot +"time taken"+(end-beg));
		
		rot = findRotationPointUsingBinarySearch(str);
		end = System.currentTimeMillis();
		System.out.println(rot +"time taken 2nd time "+(end-beg));
	}

}
