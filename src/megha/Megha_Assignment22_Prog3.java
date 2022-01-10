package megha;

public class Megha_Assignment22_Prog3 {

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
		Megha_Assignment22_Prog3 megha_Assignment22 = new Megha_Assignment22_Prog3();
		megha_Assignment22.displayNumbersInFiboSeriesWithinFiveAndThirtyFour();
	}

}
