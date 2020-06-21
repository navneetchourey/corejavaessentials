package queue;

import java.util.ArrayDeque;

public class Deque {

	
	public static void main(String[] args) {
		ArrayDeque<String> deque = new ArrayDeque<String>();
		deque.offerFirst("center");
		System.out.println(deque);
		deque.offerFirst("Bruce Banner");
		System.out.println(deque);
		deque.offerLast("Barry Allen");
		System.out.println(deque);
		deque.offerFirst("Bruce Wayne");
		System.out.println(deque);
		deque.offerLast("CLark Kent");
		System.out.println(deque);
		System.out.println(deque.pollLast());
		System.out.println(deque.pollFirst());
		System.out.println(deque);



	}
}
