package technocredits.exceptiondemo.throwsdemo;

public class Manager {

	void m2() throws ArrayIndexOutOfBoundsException{
		int[] arr = {10,20};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println("in m2");
		int x = 10/0;
	}
}
