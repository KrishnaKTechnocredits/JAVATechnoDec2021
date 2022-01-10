package yogiraj;

public class Assignment22 {

	public void printFibo() {
		int number1 = 0, number2 = 1, sum = 0;

		System.out.print(number1 + "\t" + number2);
		for (int i = 2; i < 8; i++) {
			sum = number1 + number2;

			number1 = number2;

			number2 = sum;

			System.out.print("\t" + sum);
		}
	}

	void printFromGivenNumber() {
		int sum = 0, i = 2, number1 = 0, number2 = 1;

		while (i < 8) {
			sum = number1 + number2;

			number1 = number2;

			number2 = sum;

			if (sum >= 5) {
				System.out.print("\t" + sum);
			}

			i++;
		}
	}

	void printTillmGivenNumber() {
		int sum = 0, i = 2, number1 = 0, number2 = 1;

		while (i < 10) {
			sum = number1 + number2;

			number1 = number2;

			number2 = sum;

			if (sum >= 5 && sum <= 34) {
				System.out.print("\t " + sum);
			}

			i++;
		}
	}

	public void requiredNumberForSum() {
		int sum = 0, cnt = 0, number1 = 0, number2 = 1;

		while (sum <= 50) {
			sum = number1 + number2;

			number1 = number2;

			number2 = sum;

			cnt++;

		}
		System.out.println(cnt);

	}

	public static void main(String[] args) {
		Assignment22 a = new Assignment22();

		System.out.println("Fibonacchi series for first 8 numbers \n");

		a.printFibo();

		System.out.println("\n \nFibonacchi series for starting number 5 \n\n");

		a.printFromGivenNumber();

		System.out.println("\n \nFibonacchi series till given number 34 \n\n");

		a.printTillmGivenNumber();

		System.out.println("\n \nCount of numbers required to make sum 50 \n\n");

		a.requiredNumberForSum();

	}

}
