package MoreCmp338;

public class Queue {
	private Node front = null;
	private Node back = null;
	
	public void dequeue() {
		front = front.next;
	}
	
	public int front() {
		return front.x;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void enqueue(int item) {
		if(isEmpty()) {
			front = new Node(item, null);
			back = new Node(item, null);
		}
		else {
			back.next = new Node(item, null);
			back = back.next;
		}
		
	}
	
}
