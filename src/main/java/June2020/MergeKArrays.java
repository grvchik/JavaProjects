package June2020;

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
		int size = 0;
		
		PriorityQueue<QueueNode> pq = new PriorityQueue<QueueNode>();
		
		for(int i = 0;i<matrix.length;i++) {
			int [] matrixRow = matrix[i];
			size+=matrixRow.length;
			QueueNode qn = new QueueNode(i, 0, matrix[i][0]);
			pq.add(qn);
		}
		int result[] = new int[size];
		int i=0;
		while(!pq.isEmpty()) {
			QueueNode top = pq.poll();
			result[i] = top.correspondingValueIn;
			i++;
			int currRow = top.rowIndexIn;
			int currColumn = top.colIndexIn;
			int [] arrayAtRow = matrix[currRow];
			if(currColumn+1<arrayAtRow.length) {
				QueueNode qn = new QueueNode(currRow, currColumn+1, matrix[currRow][currColumn+1]);
				pq.add(qn);
			}
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { {3,1,2,4},{5,1,6},{4,7,3}};
		int []result = mergeArrays(matrix);
		System.out.println(result);
	}

}
