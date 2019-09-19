package Sept2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

	
	public static void calculateNextPermutation(List<Integer> inputList) {
		
		int k = inputList.size()-1;
		int swapCounter=0;
		while(k-1>=0) {
			int firstElement = inputList.get(k-1);
			int secondElement = inputList.get(k);
			
			// if first element is less than the seconf elemtn
			if(firstElement<secondElement) {
				swapCounter=k-1;
				break;
			}		
			--k;
		}
		
		
		// case 1 when swapCounter is 0
		if(swapCounter==0) {			
			int beg = 0;
			int end = inputList.size()-1;
			while(beg < end ) {
				Collections.swap(inputList, beg, end);
				++beg;
				--end;
			}
		}
		
		// case 2 when swapCounter is >0
		else {			
			for(int i=swapCounter;i<inputList.size();i++) {
				Collections.swap(inputList, i,inputList.size()-1 );
				
			}			
		}		
		System.out.println("inputList"+inputList);
	}
	
	
	
	public static void main(String[] args) {
	
		List <Integer> retList = new ArrayList<Integer>();
		retList.add(1);
		retList.add(2);
		retList.add(4);
		retList.add(3);
		
		// TODO Auto-generated method stub
		calculateNextPermutation(retList);
	}

}
