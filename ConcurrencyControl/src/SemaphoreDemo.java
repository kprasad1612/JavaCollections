

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
public static void main(String[] args) {
	Semaphore machine =new Semaphore(1);
	new Person(machine,"Mary");
	new Person(machine,"John");
	new Person(machine,"Smith");
	
}


}

class Person extends Thread{
	Semaphore machine;
	Person(Semaphore machine,String name){
		this.machine=machine;
		this.setName(name);
		this.start();
	}
 public void run(){
	 try {
	 System.out.println(getName()+" : waiting for machine");
	 machine.acquire();
	 System.out.println(getName()+" : using machine");
	 Thread.sleep(1000);
	 machine.release();
	 System.out.println(getName()+" : left machine");
	 }
	 catch(Exception e) {}
 }
 }
