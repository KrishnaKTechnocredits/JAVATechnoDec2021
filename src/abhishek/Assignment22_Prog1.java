package abhishek;
public class Assignment22_Prog1 {

	void displayFirstNNumbersInFiboSeries(int n) {
		int num1 = 0;
		int num2 = 1;
		System.out.println("The Fibonacci Series for " + n + " elements are : ");
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");

		for (int index = 1; index <= n - 2; index++) {
			num2 = num2 + num1;
			System.out.print(num2 + " ");
			num1 = num2 - num1;
		}
	}

	public static void main(String[] args) {
		Assignment22_Prog1 assignment22_Prog1 = new Assignment22_Prog1();
		assignment22_Prog1.displayFirstNNumbersInFiboSeries(8);
	}

}
