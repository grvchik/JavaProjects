package Jan2020;

public class Random {

	public static int rand10() {
        int index = 0;
        do{
            int row = rand7();
            int col = rand7();
            index = (row-1)*7 + col;
        } while(index > 40);
       return 1+(index%10);
    }
	
	public static int rand7() {
		
		int max=7;
		double res = Math.random()*max;
		int result = (int)res;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res= rand10();
		System.out.println(res);
	}

}
