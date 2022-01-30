package jagdish;

//4. WAP for Fibonacci series for first 'n' numbers starting form 5.
public class A22_Assignment_4 {
	void fibonacciSeriesForFirstNNumbers(int numCount, int startingNum) {
		int count = 0;
		int num1 = 0;
		int num2 = 1;
		{
			System.out.println("Fibonacci series for the first  " + numCount + " numbers starting from " + startingNum
					+ " are as below :");
		}

		while (count < numCount) {
			if (num2 >= startingNum) {
				System.out.print(num2 + " , ");
				count++;
			}
			num2 = num1 + num2;
			num1 = num2 - num1;
		}
	}

	public static void main(String[] args) {
		A22_Assignment_4 a22 = new A22_Assignment_4();
		a22.fibonacciSeriesForFirstNNumbers(10, 5);
	}
}
