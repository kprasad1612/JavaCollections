

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Aggregator extends Thread {
	public void run() {
		System.out.println("In Aggregator");
	}
}
class WorkerThread extends Thread{
	CyclicBarrier syncPoint;
	public WorkerThread(CyclicBarrier syncPoint,String name) {
		this.setName(name);
		this.syncPoint= syncPoint;
		this.start();
		
	}
	public void run() {
		
		System.out.println("Entered :"+getName());
		try {
			syncPoint.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
public class CyclicBarrierThread {
public static void main(String[] args) throws Exception{
	CyclicBarrier cyclicBarrier =new CyclicBarrier(4,new Aggregator());
	new WorkerThread(cyclicBarrier,"2016");
	snooze();
	new WorkerThread(cyclicBarrier,"2015");
	snooze();
	new WorkerThread(cyclicBarrier,"2014");
	snooze();
	new WorkerThread(cyclicBarrier,"2013");
	snooze();
	
}
private static void snooze() throws Exception{
	Thread.sleep(1000);
}
}
