
package MoreCmp338;

public class stack {
	int[] A;
	int top = -1;
	
	public stack(int size) {
		A = new int[size];
	}
	
	public void push(int item) {
		top++;
		
		if(top == A.length)  resize();
		
		A[top] = item;
	}
	
	public void pop() {
		if(top> -1) {
		top--;
		}
	}
	
	public int top() {
		if(top> -1) {
			return A[top];
		}
		else 
		{
			return -1000;
		}
		
	}
	
	public boolean isEmpty() {
		return top == -1; //relational operator
	}
	
	private void resize() {
		int[] B = new int[A.length + 1];
		for(int i = 0; i < A.length; i++) {
			B[i] = A[i];
		}
		
		A = B;
	}
 	
}


