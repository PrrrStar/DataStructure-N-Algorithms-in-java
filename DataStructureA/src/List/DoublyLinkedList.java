package List;
public class DoublyLinkedList<T extends Comparable> {
	private Node<T> header = new Node<T>();

	@SuppressWarnings("hiding")
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

	public void insert(T x) {
		if (header.next == null) {
			header.next = header.prev = new Node<T>(x, null, null);

		} else if (header.next.data.compareTo(x) > 0) {
			header.next = header.next.prev = new Node<T>(x, null, header.next);

		} else {
			Node<T> p = header.next;
			while (p != null) {
				if (p.data.compareTo(x) > 0) {
					Node<T> temp = new Node<T>(x, p.prev, p);
					if (p.prev != null)
						p.prev.next = p.prev = temp;
					return;
				} else
					p = p.next;

			}
			header.prev = header.prev.next = new Node<T>(x, header.prev, null);

		}

	}

	public boolean delete(T x) {
		if (header.next == null)
			return false;
		else {
			Node<T> p = header.next;
			while (p != null) {
				if (p.data.compareTo(x) > 0)
					return false;
				else if (p.data.compareTo(x) == 0) {
					if (p.prev != null)
						p.prev.next = p.next;
					else
						header.next = p.next;
					if (p.next != null)
						p.next.prev = p.prev;
					else
						header.prev = p.prev;
					return true;
				} else
					p = p.next;
			}
			return false;
		}
	}

	public void print() {
		System.out.print("Print in the forward direction : ");
		for (Node<T> p = header.next; p != null; p = p.next)
			System.out.print(p.data + "\t");
		System.out.println();
	}

	public void printReverse() {
		System.out.print("Print in the reverse direction : ");
		for (Node<T> p = header.prev; p != null; p = p.prev)
			System.out.print(p.data + "\t");
		System.out.println();
	}
}