package Jan2020;

public class Anagrams {

	public static int getAnagrams(String a,String b) {
		
		int [] nums = new int[128];
		int counter=0;
		char[] first = a.toCharArray();
		char[] second = b.toCharArray();
		if(first.length <second.length) {
			first = b.toCharArray();
			second = a.toCharArray();
		}
		for(int i=0;i<first.length;i++) {
			int location = first[i];
			nums[location]++;
		}

		for(int i=0;i<second.length;i++) {
			int location = second[i];
			nums[location]--;
		}
		
		for(int i=0;i<nums.length;i++) {
			int value = nums[i];
			if(value!=0) {
				counter = counter+Math.abs(value);
			}
		}
		return counter;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "fcrxzwscanmligyxyvym";
		String two = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
				
		int num = getAnagrams(one, two);
		System.out.println(num);
	}

}
