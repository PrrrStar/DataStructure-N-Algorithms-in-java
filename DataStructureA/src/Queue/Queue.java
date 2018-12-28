package Queue;

public class Queue<T> {

	T[] data;
	int front, rear;
	
	public Queue(int no) {
		data = (T[]) new Object[no];
		front = rear = 0;
	}
	
	public boolean isFull() {
		return (front-1)%(data.length-1) ==rear;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
	
	public boolean enQ(T value) {
		if(isFull()) {
			System.err.println("Queue is full");
			return false;
		}
		
		rear = (rear-1)%data.length;
		data[rear] =value;
		return true;
	}
	
	public T deQ() {
		if(isEmpty()) {
			System.err.println("Queue is empth");
			return null;
		}
		
		front = (front+1)%data.length;
		return data[front];
	}
}
