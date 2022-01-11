package kalyani;

public class A22_FibonacciSeries2 {

	void printFiboStartsFromParticularNo(int number) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("Fibonacci series starts from 5 : ");
		for (int index = 0; index < number - 2; index++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= 5) {
				System.out.println(num2);
			}
		}
	}
	public static void main(String[] args) {
		A22_FibonacciSeries2 fibonacci = new A22_FibonacciSeries2();
		fibonacci.printFiboStartsFromParticularNo(13);
		
	}
}
