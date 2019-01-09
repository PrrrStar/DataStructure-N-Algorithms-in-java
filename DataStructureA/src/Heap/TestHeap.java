package Heap;

public class TestHeap {
	public static void main(String[] args) {
		MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(15);
		maxHeap.insert(5);
		maxHeap.insert(3);
		maxHeap.insert(17);
		maxHeap.insert(10);
		maxHeap.insert(84);
		maxHeap.insert(19);
		maxHeap.insert(6);
		maxHeap.insert(22);
		maxHeap.insert(9);

	
		System.out.println("Heap(" + maxHeap.size() + "):" + maxHeap);
		while (maxHeap.size() > 0)
			System.out.println(maxHeap.removeMax() + " ");
		System.out.println("\nNew Heap");
		Integer[] b = { null, 20, 40, 30, 10,90, 70 };
		maxHeap = new MaxHeap<Integer>(b);
		System.out.println("Before Construction: " + maxHeap.isHeap(1));
		System.out.println("Heap(" + maxHeap.size() + "): " + maxHeap);
		maxHeap.buildHeap(1);
		System.out.println("After Construction: " + maxHeap.isHeap(1));
		System.out.println("Heap(" + maxHeap.size() + "): " + maxHeap);
		maxHeap.sort();
		System.out.println("After sort: Heap(" + maxHeap.size() + "):" + maxHeap);
	}
}
