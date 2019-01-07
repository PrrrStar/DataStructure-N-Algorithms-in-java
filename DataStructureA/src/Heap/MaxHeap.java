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
	
	
	
}
