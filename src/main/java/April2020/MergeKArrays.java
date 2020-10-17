package April2020;

import java.util.Collections;
import java.util.PriorityQueue;

class QueueNode  implements Comparable<QueueNode>{
	
	public int rowIndexIn;
	public int colIndexIn;
	public int correspondingValueIn;
	public QueueNode(int rowIndex,int colIndex,int correspondingValue) {
		this.rowIndexIn = rowIndex;
		this.colIndexIn = colIndex;
		this.correspondingValueIn = correspondingValue;
	}

	@Override
	public int compareTo(QueueNode o) {
		// TODO Auto-generated method stub
		return this.correspondingValueIn-o.correspondingValueIn;
		
	}	
}

public class MergeKArrays {

	
	public static int[] mergeArrays(int[][]matrix) {
		int size=0;
		PriorityQueue<QueueNode> pq = new PriorityQueue<QueueNode>();
		for (int i=0;i<matrix.length;i++) {
			int rowIndex = i;
			size = size + matrix[rowIndex].length;
			int colIndex = 0; //first element to consider;
			int value = matrix[rowIndex][colIndex];
			QueueNode qn = new QueueNode(rowIndex, colIndex, value);
			pq.add(qn);
		}
		
		int resultArray[] = new int[size];
		
		for(int i=0;!pq.isEmpty();i++) {
			
			QueueNode qn  = pq.poll();
			int rowIndex = qn.rowIndexIn;
			resultArray[i] = qn.correspondingValueIn;
			int arrayAtRow[] = matrix[rowIndex];
			if(qn.colIndexIn+1 <arrayAtRow.length) {
				int newColIndex = qn.colIndexIn+1;
				int newValue = arrayAtRow[newColIndex];
				QueueNode qnNew = new QueueNode(rowIndex, newColIndex, newValue);
				pq.add(qnNew);
			}
		}
		return resultArray;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { {3,1,2,4},{5,1,6},{4,7,3}};
		int[] res = mergeArrays(matrix);
		System.out.println(res);
	}

}


