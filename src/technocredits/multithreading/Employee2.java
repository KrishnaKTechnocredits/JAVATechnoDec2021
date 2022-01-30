package technocredits.multithreading;

public class Employee2 extends Thread {

	@Override
	public void run() {
		display();
	}
	
	void display() {
		for(int i=101;i<=200;i++) {
			System.out.println(Thread.currentThread().getName() + "--" + i);
		}
	}
}
