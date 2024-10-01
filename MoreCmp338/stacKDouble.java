package MoreCmp338;

public class stacKDouble {
		double[] A;
		int top = -1;
		
		public stacKDouble(int size) {
			A = new double[size];
		}
		
		public void push(double item) {
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
		
		public double top() {
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
}
