package megha;

public class Megha_Assignment22_Prog1 {

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
		Megha_Assignment22_Prog1 megha_Assignment22 = new Megha_Assignment22_Prog1();
		megha_Assignment22.displayFirstNNumbersInFiboSeries(8);
	}

}
