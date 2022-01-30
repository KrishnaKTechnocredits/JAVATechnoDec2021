package jagdish;

/*1. WAP to print 1st 10 numbers of Fibonacci series using one temp variable.
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/
public class A22_Assignment_1 {
	void fibonacciSeriesWithTemp(int num) {
		int num1 = 0;
		int num2 = 1;
		int count = 0;
		{
			System.out.println("Fibonacci Series for first " + num + " numbers are as below :");
		}

		while (count < num) {
			int temp;
			System.out.print(num1 + " ,  ");
			temp = num1;
			num1 = num2;
			num2 = num1 + temp;
			count++;
		}
	}

	public static void main(String[] args) {
		A22_Assignment_1 a22 = new A22_Assignment_1();
		a22.fibonacciSeriesWithTemp(10);
	}
}
