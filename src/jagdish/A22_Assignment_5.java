package jagdish;
/*//5. WAP for Fibonacci series when sum of all the numbers are less than 100
output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/

public class A22_Assignment_5 {
	void fibonacciSeriesWithTargetedSum(int targetedSum) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		{
			System.out.println(
					"Fibonacci series when sum of all the numbers is less than " + targetedSum + ", are as below : ");
		}

		while (sum <= 100) {
			System.out.print(num1 + " , ");
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = num1 + num2;
		}
	}

	public static void main(String[] args) {
		A22_Assignment_5 a22 = new A22_Assignment_5();
		a22.fibonacciSeriesWithTargetedSum(100);
	}
}
