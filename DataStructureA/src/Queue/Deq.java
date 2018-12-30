package Queue;

public class Deq<T> {

	private Node<T> front, rear = new Node<T>();
	private int size;

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

	public boolean isEmpty() {
		return rear == front;
	}

	public void addFirst(T item) {
		size++;
		if (isEmpty()) {
			front = rear = new Node<T>(item, null, null);
		} else {
			front.prev = new Node<T>(item, null, front);
			front = front.prev;
		}
	}

	public void addLast(T item) {
		size++;
		if(isEmpty()) {
			front = rear = new Node<T>(item, rear,null);
			rear = rear.next;
		}
	}

	public T removeFirst() {
		if (isEmpty())
			return null;
		size--;
		T result = front.data;
		if (front == rear)
			front = rear = null;
		else {
			front = front.next;
			front.prev = null;
		}
		return result;
	}

	public T removeLast() {
		if(isEmpty())
			return null;
		size--;
		T result = rear.data;
		if(rear == front)
			rear = front = null;
		else {
			rear = rear.prev;
			rear.next =null;
		}
		return result;
	}

	public T getFirst() {
		return front.data;
	}

	public T getLast() {
		return rear.data;
	}
}