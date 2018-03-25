

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class WorkerDemo implements Callable<Long>{
	public Long call() {
		return new Long(10);
	}
}
public class CallableDemo {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	System.out.println("begin of the mail");
	WorkerDemo demo=new WorkerDemo();
	ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Long> future = service.submit(demo);
		System.out.println("Return value :"+future.get());
	service.shutdown();
	System.out.println("End of the main");
}
}
