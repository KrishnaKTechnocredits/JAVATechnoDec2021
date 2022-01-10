package megha;

public class Megha_Assignment22_Prog2 {

	void displayFirstNNumbersInFiboSeriesStartingWithFive(int n) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;

		System.out.println("The Fibonacci Series for " + n + " elements are : ");

		while (count != n) {
			num2 = num2 + num1;
			if (num2 >= 5) {
				System.out.print(num2 + " ");
				count++;
			}
			num1 = num2 - num1;
		}
	}

	public static void main(String[] args) {
		Megha_Assignment22_Prog2 megha_Assignment22 = new Megha_Assignment22_Prog2();
		megha_Assignment22.displayFirstNNumbersInFiboSeriesStartingWithFive(8);

	}

}
