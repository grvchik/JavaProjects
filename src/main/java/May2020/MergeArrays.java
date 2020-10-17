package May2020;

public class MergeArrays {

	public static void mergeArrays(int[] num1,int[] num2) {
		
		int index = moveBiggerArray(num1,num2);
		if(num1.length>num2.length) {
		
			//merging needs to happen in first array
			
			int firstCounter = index;
			int secondConunter = 0;
			int begIndex=0;
			while(firstCounter<num1.length && secondConunter <num2.length) {
				
				if(num1[firstCounter]>num2[secondConunter]) {
					num1[begIndex] = num2[secondConunter];
					++secondConunter;
				}
				else {
					num1[begIndex] = num1[firstCounter];
					++firstCounter;
				}
				if(firstCounter>num1.length-1) {
					firstCounter--;
					break;
				}
				if(secondConunter>num2.length-1) {
					secondConunter--;
					break;
				}
				begIndex++;
			}
			
			if(begIndex!=num1.length-1) {
				if(num1[num1.length-1]<num2[num2.length-1]) {
					num1[++begIndex]  = num2[num2.length-1];
				}
			}
			
		}
		else {
			// merign needs to happein in seecond array
			
		}		
	}
	
	
	public static int  moveBiggerArray(int[] num1,int[] num2) {
		int index=0;
		if(num1.length>num2.length) {
  
			int counter = num1.length-1;
			while(counter>0) {
				
					if(num1[counter]!=0) {
						break;
					}				
				--counter;
			}		
			index = counter+1;
			int endCounter = num1.length-1;
			while(counter>=0) {
				num1[endCounter] = num1[counter];
				num1[counter]=0;
				--counter;
				--endCounter;
				
			}
			
			
			
		}
		else {
			int counter = num2.length-1;
			while(counter>0) {
				if( num2[counter-1]!=0) {
					num2[counter] = num2[counter-1];
				}
				else {
					index =  counter-1;
					break;
				}
			}						
		}
		return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1,3,5,0,0,0};
		int[] num2 = {2,4,6};
		mergeArrays(num1, num2);
	}

}
