package Sep2020;

public class GuessTarget {

	public static String getTargetVicinity(String actual,String guess) {
		int targets=0;
		int vicinities=0;
		
		int[]num = new int[10];
		
		for(int i=0;i<guess.length();i++) {
			if(actual.charAt(i)==guess.charAt(i)) {				
				targets++;
			}
			else {
				int actualNumeric = Character.getNumericValue(actual.charAt(i));
				int guessNmeric = Character.getNumericValue(guess.charAt(i));			
				if(  num[actualNumeric]<0) {
					vicinities++;
				}
				
				if(num[guessNmeric]>0) {
					vicinities++;
				}
				num[guessNmeric]--;
				num[actualNumeric]++;
			}
		}
		return String.format("%dT%dV", targets,vicinities);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actual = "45624";
		String guess = "24325";
		String res = getTargetVicinity(actual, guess);
		System.out.println(res);
	}

}
