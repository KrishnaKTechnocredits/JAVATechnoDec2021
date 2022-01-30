package technocredits.multithreading;

public class Employee1 extends Thread{

	@Override
	public void run() {
		display();
	}
	
	void display() {
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName() +"--"+  i);
		}
	}
	
}
