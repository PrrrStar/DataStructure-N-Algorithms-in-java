package Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>(5);
		q.enQ(1);
		q.enQ(2);
		System.out.println(q.deQ());
		q.enQ(3);
		q.enQ(4);
		System.out.println(q.deQ());
		q.enQ(5);
		q.enQ(6);
		System.out.println(q.deQ());
		q.enQ(7);
		q.enQ(8);
		q.enQ(9);

	}

}
