package May2020;

import java.util.PriorityQueue;



class QueueNode implements Comparable<QueueNode> {

	public int rowIndex;
	public int colIndex;
	public int value;
	
	public QueueNode(int rowIn, int colIn, int valueIn) {
		this.value = valueIn;
		this.rowIndex = rowIn;
		this.colIndex = colIn;
	}
	
	@Override
	public int compareTo(QueueNode outer) {
		// TODO Auto-generated method stub
		return this.value-outer.value;
	}
	
}

public class MergeKArrays {

	
	public int[] mergeArrays(int[][] matrix)  {
		int size = 0;
		PriorityQueue<QueueNode> pq = new PriorityQueue<QueueNode>();
		for(int row=0;row<matrix.length;row++) {
			int arrayAtRow[] = matrix[row];
			int valueAtCol = arrayAtRow[0];
			size+=arrayAtRow.length;
			QueueNode qn  = new QueueNode(row,0,valueAtCol);
			pq.add(qn);
		}
		
		int result[] = new int[size];
		
		int index = 0;
		
		while(!pq.isEmpty()) {
			QueueNode top = pq.poll();
			result[index] = top.value;
			int rowIndex = top.rowIndex;
			int [] arrayAtRow = matrix[rowIndex];
			int newIndex = index +1 ;
			if(newIndex<arrayAtRow.length) {
				QueueNode newQ  = new QueueNode(rowIndex, newIndex, arrayAtRow[newIndex]);
				pq.add(newQ);
			}

		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
