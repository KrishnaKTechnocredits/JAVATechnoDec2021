package technocredits.multithreading;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		Employee1 emp1 = new Employee1();
		Employee2 emp2 = new Employee2();
		
		emp2.start();
		
		Thread.sleep(3000); // 1000 ms = 1 sec, 3000 ms = 3 sec
		System.out.println("End");
		
	}
}
