package June2020;

public class MaxCounter {

	public static int getMaxCounter(String input) {
		int lastIndex = -1;
		String number1 = null;
		String number2 = null;
		int result1 = -1;
		int result2 = -1;
		if (input != null) {
			lastIndex = input.lastIndexOf("?");
		} else {
			return 0;
		}

		number1 = input.substring(lastIndex + 1, lastIndex + 2);

		try {
			if (lastIndex + 3 <= input.length()) {
				number2 = input.substring(lastIndex + 1, lastIndex + 3);
			}

			result1 = Integer.valueOf(number1);
			result2 = Integer.valueOf(number2);

		} catch (NumberFormatException nex) {
		
			return result1;
		}

		return result2;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="SELECT v FROM IaguserassignmentView v where v.langu=?1 AND  v.userId=?2";
		int counter = getMaxCounter(str);
		System.out.println(counter);
	}

}
