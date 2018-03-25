

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockQueueDemo {
public static void main(String[] args) throws Exception{
	ArrayBlockingQueue<String> queue= new ArrayBlockingQueue<>(3);
	queue.put("veera");
	queue.put("prasad");
	queue.put("ga");
	System.out.println(queue);
	//queue.put("na");
	
	System.out.println(queue.take());
	
	
	
	
	
	
}
}
