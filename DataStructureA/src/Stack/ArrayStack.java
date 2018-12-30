package Stack;

public class ArrayStack<T> implements Stack<T> {
	private int top = -1;
	private T[] item;

	public ArrayStack(int size) {
		item = (T[]) new Object[size];

	}

	public boolean isEmpty() {
		if (top < 0)
			return true;
		return false;

	}

	public boolean push(T newItem) {
		if (top < item.length - 1) {
			item[++top] = newItem;
			return true;
		}
		return false;

	}

	public T pop() {
		if (top < 0)
			return null;
		top--;
		return item[top + 1];

	}

	public T peek() {
		if (top < 0)
			return null;
		return item[top];
	}

	public int size() {
		return top + 1;
	}

}
