package jagdish;

/*3. WAP for Fibonacci series starting from 5 and end with 89
output : 5, 8, 13, 21, 34, 55, 89,*/
public class A22_Assignment_3 {
	void fibonacciSeries(int startNum, int endNum) {

		int num1 = 0;
		int num2 = 1;
		{
			System.out.println(
					"Fibonacci series starting from " + startNum + " and end with " + endNum + " are as below :");
		}
		while (num2 <= endNum) {
			if (num2 >= startNum && num2 <= endNum)
				System.out.print(num2 + " , ");
			num2 = num1 + num2;
			num1 = num2 - num1;
		}
	}

	public static void main(String[] args) {
		A22_Assignment_3 a22 = new A22_Assignment_3();
		a22.fibonacciSeries(5, 89);
	}
}
