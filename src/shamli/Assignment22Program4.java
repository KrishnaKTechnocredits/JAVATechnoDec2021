package shamli;

public class Assignment22Program4 {

	void displayCountToGetSumOFFiftyInFiboSeries() {
		int num1 = 0;
		int num2 = 1;
		int count = 2;
		int sum = 2;

		while (sum <= 50) {
			num2 = num2 + num1;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
		}

		System.out.println("The Total numbers required from Fibonacci Series to get a sum of 50 : " + count);
	}

	public static void main(String[] args) {
		Assignment22Program4 assignment22program4 = new Assignment22Program4();
		assignment22program4.displayCountToGetSumOFFiftyInFiboSeries();
	}
}
