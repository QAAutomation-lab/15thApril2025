package day23.collectionexamples;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample3 {

	public static void main(String args[]) {
		Queue queue = new PriorityQueue();
//		queue.add(150);
//		queue.add(10);
//		queue.add(6);
		System.out.println("Size: " + queue.size());
		System.out.println("Eleements of Queue: " + queue);
		// it will remove top most element of the Queue, if the queue is empty dn it
		// will return 'null' value
		System.out.println("removing element from Queue using poll(): " + queue.poll());// 
		System.out.println("Eleements of Queue: " + queue);
		// it will remove top most element of the Queue, if the queue is empty dn it
		// will throw an exception by name 'NoSuchElementException'
		System.out.println("removing element from Queue using remove(): " +queue.remove());// 
		System.out.println("Eleements of Queue: " + queue);
	}
}
