package kalyani;

public class A22_FibonacciSeries3 {

	void printFiboStartsAndEndFromParticularNo() {
		int num1 = 0;
		int num2 = 1;
		
		while (num2 < 38) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= 5 && num2 < 38) {
				System.out.println(num2);
			}
		}
	}
	
	public static void main(String[] args) {
		A22_FibonacciSeries3 fibonacci = new A22_FibonacciSeries3();
		fibonacci.printFiboStartsAndEndFromParticularNo();
	}
}