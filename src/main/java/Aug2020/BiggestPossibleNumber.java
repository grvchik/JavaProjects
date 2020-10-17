package Aug2020;

import java.util.PriorityQueue;

class NumComparision implements Comparable<NumComparision> {

	
	public NumComparision(int num1) {
		this.value1 = num1;
	}
	
	public int value1;
	@Override
	public int compareTo(NumComparision o) {
		String len1 = String.valueOf(value1);
		String len2 = String.valueOf(o.value1);
		
		int minLength = Math.min(len1.length(),len2.length());
		int leftValue1 = 0;
		int leftValue2 =0;
		
		for(int i=0;i<minLength;i++) {
			 leftValue1 = Integer.valueOf(len1.charAt(i));
			 leftValue2 = Integer.valueOf(len2.charAt(i));
			
			if(leftValue1!=leftValue2) {
				return leftValue2-leftValue1;
			}
					
			System.out.println("Compare"+i+"th digit");
		}
		
		if(len1.length() >len2.length()) {
			int rightValue = Integer.valueOf((len1.charAt(len1.length()-1)));
			int nextRightValue = Integer.valueOf((len1.charAt(len1.length()-2)));
			if(rightValue >nextRightValue) {
				return -1;
			}
			else {
				return 1;
			}
		}
		else {
			int rightValue = Integer.valueOf((len2.charAt(len2.length()-1)));
			int nextRightValue = Integer.valueOf((len2.charAt(len2.length()-2)));
			if(rightValue >nextRightValue) {
				return -1;
			}
			else {
				return 1;
			}
			
		}
		
	
	}
	
}

public class BiggestPossibleNumber {

	
	
	
	
	public static void compare(int num1,int num2,int num3,int num4) {
		
		PriorityQueue<NumComparision> pq = new PriorityQueue<NumComparision>();
		NumComparision nc1 = new NumComparision(num1);
		pq.add(nc1);
		NumComparision nc2 = new NumComparision(num2);
		pq.add(nc2);

		NumComparision nc3 = new NumComparision(num3);
		pq.add(nc3);	

		NumComparision nc4 = new NumComparision(num4);
		pq.add(nc4);			
		
		while(!pq.isEmpty()) {
			NumComparision nc = pq.poll();
			System.out.println(nc.value1);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compare(10, 7, 76, 415);
	}

}
