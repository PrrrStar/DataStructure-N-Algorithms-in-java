package Heap;

public class MaxHeap<T extends Comparable> {
	private T[] a;
	private int size = 0;
	private static int MAX = 100;

	public MaxHeap(int s) {
		a = (T[]) new Comparable[s];

	}

	public MaxHeap() {
		this(MAX);
	}

	public MaxHeap(T[] b) {
		int j = 0;
		if (b[0] != null)
			j = 1;
		a = (T[]) new Comparable[b.length + j];
		for (int i = 0; i < b.length; i++)
			a[i + j] = b[i];
		size = a.length - 1;
	}
	
	private int parent(int pos) {
		return pos/2;
	}
	
	private int left(int pos) {
		return 2*pos;
	}
	
	private int right(int pos) {
		return 2*pos+1;
	}
	
	private boolean isLeaf(int pos) {
		if(pos>(size/2)&&(pos <= size))
			return true;
		return false;
	}
	
	private void swap(int i, int j) {
		T temp = a[i];
		a[i]= a[j];
		a[j] = temp;
	}
	
	public int size() {
		return size;
	}
	
	
	public void insert(T element) {
		a[++size] = element;
		int current = size;
		while(parent(current)>0&& a[current].compareTo(a[parent(current)])>0) {
			swap(current, parent(current));
			current = parent(current);
		}
	}
	
	public void heapify(int pos) {
		if(!isLeaf(pos)) {
			if(right(pos)>size) {
				if(a[pos].compareTo(a[left(pos)])<0) {
					swap(pos, left(pos));
					heapify(left(pos));
				}
			}else if(a[pos].compareTo(a[left(pos)])<0||a[pos].compareTo(a[right(pos)])<0){
				if(a[left(pos)].compareTo(a[right(pos)])>0) {
					swap(pos, left(pos));
					heapify(left(pos));
				}else {
					swap(pos, right(pos));
					heapify(right(pos));
				}
			}
		}
	}
	
	public T removeMax() {
		T result = a[1];
		a[1] = a[size--];
		heapify(1);
		return result;
	}
	
	
	public String toString() {
		String result = "{";
		for(int i =1; i<size; i++)
			result +=a[i]+",";
		result += a[size];
		return result +")";
		
	}
	
	public void buildHeap(int index) {
		if(index > 0 && index <= size/2) {
			buildHeap(left(index));
			buildHeap(right(index));
			heapify(index);
		}
	}
	
	
	public void sort() {
		for(int i = size; i>1; i--) {
			swap(i, 1);
			size--;
			heapify(1);
		}
		size = a.length -1;
	}
	
	
	boolean isHeap(int root) {
		if(root <=0)
			return true;
		else if (root <= size/2) {
			if(a[root]==null) {
				System.out.println("heap has null");
				isHeap(left(root));
				isHeap(right(root));
				return false;
			}
			else if (a[left(root)].compareTo(a[root])>0||a[right(root)].compareTo(a[root])>0) {
				isHeap(left(root));
				isHeap(right(root));
				return false;
			}else {
				return true;
			}
		}
		
		return true;
	}
	
	
	
}
