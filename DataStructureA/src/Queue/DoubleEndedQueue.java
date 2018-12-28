package Queue;

public class DoubleEndedQueue<T extends Comparable> {

	T[] data;
	int front, rear;
	
	public DoubleEndedQueue(int no) {
		data = (T[])new Object[no];
		front = rear =0;
		private class Node<T> {
			private T data;
			private Node<T> prev, next;

			Node() {
				data = null;
				prev = next = null;

			}

			Node(T d, Node<T> p, Node<T> n) {
				data = d;
				prev = p;
				next = n;

			}
		}
	}
	
	public boolean isFull() {
		return (front-1)%(data.length-1)==rear;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
	
	
	
	public void insertFirst(T item) {
		
	}

}
