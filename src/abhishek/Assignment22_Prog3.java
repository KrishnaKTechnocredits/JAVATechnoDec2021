package abhishek;
public class Assignment22_Prog3 {

	void displayNumbersInFiboSeriesWithinFiveAndThirtyFour() {
		int num1 = 0;
		int num2 = 1;

		System.out.println("The Fibonacci Series from 5 To 34 are : ");

		while (num2 != 34) {
			num2 = num2 + num1;
			if (num2 >= 5)
				System.out.print(num2 + " ");
			num1 = num2 - num1;
		}
	}

	public static void main(String[] args) {
		Assignment22_Prog3 assignment22_Prog3 = new Assignment22_Prog3();
		assignment22_Prog3.displayNumbersInFiboSeriesWithinFiveAndThirtyFour();
	}

}
