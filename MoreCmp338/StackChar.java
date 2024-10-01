package MoreCmp338;

public class StackChar {
	char [] A;
	int top = -1;
	
	public StackChar(int size) {
		A = new char[size];
	}
	
	public void push(char item) {
		if(top < A.length -1  ) {
			top++;
			A[top] = item;
			
		}
	}
	
	public void pop() {
		if(top> -1) {
		top--;
		}
	}
	
	public char top() {
	
			return A[top];
		
	
		
	}
	
	public boolean isEmpty() {
		return top == -1; //relational operator
	}
}
