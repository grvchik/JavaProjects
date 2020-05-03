package Feb2020;

public class StairCase {
	   static int stepPerms(int n) {
		      int first = 1;
		      int second = 2;
		      int third = 4;
		      
		      int sum=0;
		        if(n==1) {
		            return first;
		        }
		        if(n==2) {
		            return second;
		        }
		        if(n==3) {
		            return 4;
		        }
		    
		        int i=4;	
		         while(i<=n){
		          sum = first+second+third;
		          first = second;
		          second = third;
		          third = sum;
		          i = i+1;

		      }  
		        return sum;
		    }
	   public static void main(String g[]) {
		   int num = stepPerms(7);
		   System.out.println(num);
		   
	   }
}
