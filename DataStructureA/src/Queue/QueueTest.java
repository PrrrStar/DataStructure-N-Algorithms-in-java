package Queue;

public class QueueTest {
	public static void main(String[] args) {
		CircularQueue<Integer> q = new CircularQueue<Integer>(5);
		q.enQ(1);
		q.enQ(2);
		System.out.println("deQ : "+q.deQ());
		q.enQ(3);
		q.enQ(4);
		System.out.println("deQ : "+q.deQ());
		q.enQ(5);
		q.enQ(6);
		System.out.println("deQ : "+q.deQ());
		q.enQ(7);
		q.enQ(8);
		q.enQ(9);

		
		Deq<Integer> deq = new Deq<>();
		
		deq.addFirst(1);
		deq.addLast(3);
		deq.addFirst(4);
		deq.addFirst(0);
		
		System.out.println("DEQ : "+deq.getFirst());
		System.out.println("DEQ : "+deq.getFirst());
		System.out.println("DEQ : "+deq.getFirst());
		System.out.println("DEQ : "+deq.getFirst());
		
		
	}

}
