package Stack;

public interface Stack<T> {

	public boolean isEmpty();
	public boolean push(T newItem);
	public T pop();
	public T peek();
	public int size();
}
