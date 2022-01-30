package jagdish;

/*2. WAP to print 1st 10 numbers of Fibonacci series without using temp variable.
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,*/
public class A22_Assignment_2 {
	static void fibonacciSeriesWithoutTemp(int num) {
		int num1 = 0;
		int num2 = 1;

		{
			System.out
					.println("Fibonacci Series for first " + num + " num--without using temp variable are as below :");
		}

		for (int index = num1; index < 10; index++) {
			int count = 0;
			System.out.print(num1 + " , ");
			num1 = num1 + num2;
			num2 = num1 - num2;
			count++;
		}
	}

	public static void main(String args[]) {
		A22_Assignment_2 a22 = new A22_Assignment_2();
		a22.fibonacciSeriesWithoutTemp(10);
	}
}
