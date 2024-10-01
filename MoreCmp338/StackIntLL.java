package MoreCmp338;

public class StackIntLL {
	private Node top = null;
	
	public void push(int item) {
		top = new Node(item, top );
		
	}
	
	public void pop() {
		top = top.next;
	}
	
	public int top() {
		return top.x;
	}
	
	public boolean isEmpty() {
		return top == null	;
	}
}
