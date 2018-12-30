package Stack;

public class ListStack<T> implements Stack<T> {
	private int size =0;
	private Node<T> top;
	
	private class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node() {
			this(null,null);
		}
		
		public Node(T data, Node<T>n ) {
			this.data = data;
			next = n;
		}
		
	}
	
	public boolean isEmpty() {
		if(size <=0) return true;
		return false;
	}
	public boolean push(T newItem) {
		size++;
		top = new Node(newItem, top);
		return true;
	}
	
	public T pop() {
		T result = top.data;
		top = top.next;
		size--;
		return result;
	}
	public T peek() {
		return top.data;
		
	}
	
	public int size() {
		return size;
	}

}
