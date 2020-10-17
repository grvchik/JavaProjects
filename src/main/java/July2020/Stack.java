package July2020;

import java.util.ArrayList;
import java.util.List;

class Maximum {
	public int maximum;
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getSecondMaximum() {
		return secondMaximum;
	}
	public void setSecondMaximum(int secondMaximum) {
		this.secondMaximum = secondMaximum;
	}
	public int secondMaximum;
	
	public Maximum(int max,int secondMax) {
		this.maximum = max;
		this.secondMaximum = secondMax;
	}
	
}

public class Stack {

	public List<Integer> contents;
	public Maximum maxNumber;
	public int max() {
	
		
		return maxNumber.getMaximum();
	}
	
	
	public Stack() {
		this.maxNumber = new Maximum(0,0);
		this.contents =new ArrayList<Integer>();
	}
	
	public void push(int number) {
		
		this.contents.add(number);
		
		if(this.maxNumber.getMaximum()==0) {
			this.maxNumber.setMaximum(number);
		}
		else {
			int currMaximum = this.maxNumber.getMaximum();
			if(number >currMaximum) {
				this.maxNumber.setMaximum(number);
				this.maxNumber.setSecondMaximum(currMaximum);
			}
		}
		
	}
	
	
	public int pop() {
		
		int currTop = this.contents.get(this.contents.size()-1);	
		this.contents.remove(this.contents.size()-1);
	
		int currMaximum = this.maxNumber.getMaximum();
		int secondMax = this.maxNumber.getSecondMaximum();
		if(currTop ==currMaximum) {
			this.maxNumber.setMaximum(secondMax);
			if(this.contents.size()==2) {
				this.maxNumber.setSecondMaximum(this.contents.get(0));
			}
			
		}
		
		if(currTop > secondMax && currTop < currMaximum) {			
			this.maxNumber.setSecondMaximum(currTop);
		
		}
	
		
		
		return currTop;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(1);
		System.out.println("max->"+st.max());
		st.push(3);
		System.out.println("max->"+st.max());
		st.push(2);
		System.out.println("max->"+st.max());
		System.out.println(st.pop());
		System.out.println("max->"+st.max());
		st.push(4);
		System.out.println("max->"+st.max());
		System.out.println(st.pop());
		System.out.println("max->"+st.max());
		System.out.println(st.pop());
		System.out.println("max->"+st.max());	
	}

}
