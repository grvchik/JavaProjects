package Jan2020;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Random;
public class BasicMessageFormat {
	
	     
	    public static boolean isPrime(int n) {
	        if (n == 2) return true;
	         
	        for(int i=2;i<=(int)Math.sqrt(n)+1;i++) 
	            if(n%i == 0) 
	                return false;
	         
	        return true;
	    }
	 
	    public static void main(String[] args) {
	     
	        int[] nums = new int[10];
	        Random rnd = new Random();
	         
	        for (int i=0;i<nums.length;i++) {
	            nums[i] = rnd.nextInt(100);
	        }
	         
	        int primes = 0;
	         
	        for (int num : nums) {
	            if (isPrime(num)) primes++;
	        }
	         
	        String message = "{3} \"{4}\" assigned to user \"{0}\" from business role \"{5}\": {1} ({2}) - requested from {6} with ID {7}";
	        MessageFormat mf = new MessageFormat(message);
	         
	        System.out.println(mf.format(new Object[] {new Date(), primes}));
	 
	    }
	 
	}

