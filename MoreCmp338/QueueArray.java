package MoreCmp338;

public class QueueArray {
	int[] A;
	int front = 0;
	int back = -1;
	
	public QueueArray(int size) {
		A = new int[size];
	}
	
	public void enqueue(int item) {
		if( back < A.length - 1) {
		back++;
		A[back] = item;
		}
		else {
			resize();
		}
	}
	
	public void pop() {
		if(front < A.length -1) {
		front ++;
		}
		if(front == A.length -1) {
			back = -1;
		}
	}
	
	public int front() {
		
		return A[front];
		
	}
	
	public boolean isEmpty() {
		return back == -1 ; //relational operator
	}
	
	private void resize() {
		int[] B = new int[A.length + 1];
		for(int i = 0; i < A.length; i++) {
			B[i] = A[i];
		}
		
		A = B;
	}
}
