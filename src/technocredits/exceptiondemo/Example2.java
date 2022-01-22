package technocredits.exceptiondemo;

public class Example2 {

	void processData() {
		int[] arr = {10,20};
		for(int index=0;index<=arr.length;index++) {
			System.out.println(arr[index]);
		}
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		new Example2().processData();
		System.out.println("main end");
	}
}
