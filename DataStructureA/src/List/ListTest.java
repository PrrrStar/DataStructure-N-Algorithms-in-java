package List;

public class ListTest {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();
		System.out.println("=== After inserting 40");
		dll.insert(40);
		dll.print();
		dll.printReverse();

		System.out.println("=== After inserting 20");
		dll.insert(20);
		dll.print();
		dll.printReverse();

		System.out.println("=== After inserting 30");
		dll.insert(30);
		dll.print();
		dll.printReverse();

		System.out.println("=== After inserting 50");
		dll.insert(50);
		dll.print();
		dll.printReverse();

		System.out.println("delete 55 : " + dll.delete(55));
		System.out.println("delete 5 : " + dll.delete(5));
		System.out.println("delete 35 : " + dll.delete(35));

		System.out.println("delete 50 : " + dll.delete(50));
		dll.print();
		dll.printReverse();

		System.out.println("delete 30 : " + dll.delete(30));
		dll.print();
		dll.printReverse();

		System.out.println("delete 20 : " + dll.delete(20));
		dll.print();
		dll.printReverse();

		System.out.println("delete 40 : " + dll.delete(40));
		dll.print();
		dll.printReverse();
	}
}
