package Aug2020;

import java.util.PriorityQueue;





class QueueNode implements Comparable<QueueNode> {

	public int row;
	public int col;
	public int value;
	
	public QueueNode(int row,int col,int value) {
		
		this.row = row;
		this.col = col;
		this.value=value;
		
	}
	
	@Override
	public int compareTo(QueueNode o) {
		// TODO Auto-generated method stub
		
		return this.value-o.value;
	}
	
	
}

public class MergekArrays {

	
	public static int[] mergeArrays(int[][] matrix) {	
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
		int rowIndex = qn.row;
		resultArray[i] = qn.value;
		int arrayAtRow[] = matrix[rowIndex];
		if(qn.col+1 <arrayAtRow.length) {
			int newColIndex = qn.col+1;
			int newValue = arrayAtRow[newColIndex];
			QueueNode qnNew = new QueueNode(rowIndex, newColIndex, newValue);
			pq.add(qnNew);
		}
	}
	return resultArray;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { {3,1,2,4}, {5,1,6}, {4,7,9}};
		int[] resultArray = mergeArrays(matrix);
		System.out.println(resultArray);
	}

}
