package technocredits.exceptiondemo;

public class Example10 {

	void m1() {
		int[] arr = {10,20};
		String[] input = {"Hi", "Hello", "Techno"};
		
		try {
			System.out.println("Credits");
			System.out.println(arr[input.length]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("In first Catch");
		}
		
		System.out.println("Hi");
		
		try {
			System.out.println("Try block");
			System.out.println(input[arr.length]);
		}catch(StringIndexOutOfBoundsException se) {
			System.out.println(1);
		}
		
		System.out.println(2);
	}
}
