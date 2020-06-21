package queue;

import java.util.concurrent.ArrayBlockingQueue;

//FIFO queue
public class ArrayBlockingQUeue {
public static void main(String[] args) {
	ArrayBlockingQueue<String> queue =  new ArrayBlockingQueue<String>(5);
	queue.offer("Bruce Banner");
	queue.offer("Barry Allen");
	queue.offer("Bruce Wayne");
	queue.offer("Clark Kent");
	queue.offer("Peter Parker");
	queue.offer("Hal Jordan");
String superHero=queue.poll(); // poll will remove first element from the queue
System.out.println("superHero  : "+superHero);
System.out.println("queue  : "+queue);
String nextHero = queue.peek();  // peek will give  the reference of the first element but will not remove it 
System.out.println("nextHero  "+nextHero);
System.out.println("queue  : "+queue);

//	System.out.println(queue.poll());
}
}
