


class Visit{
	//public static AtomicLong visit = new AtomicLong(0);
	//public static AtomicLong visit = new AtomicLong(0);
	
	public static Long visit = new Long(0);
	
}

public class AtomicDemo extends Thread{
	
	public void run() {
		
		//System.out.print(Visit.visit.incrementAndGet() +" ");
		System.out.print(++Visit.visit +" ");
		
		}
	
	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
		Thread t=new AtomicDemo();
		t.start();
		}
	}
}