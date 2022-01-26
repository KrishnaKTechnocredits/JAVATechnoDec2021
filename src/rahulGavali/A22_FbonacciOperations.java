package rahulGavali;

/*Assignment - 22: 9th Jan'2022
Print fibonacci series for different variations as bellow
1 . Print first n no of fibonacci series ( 8 numbers )
output : 0 1 1 2 3 5 8 13 
2 . Print first n no of fibonacci series but start no from 5
output : 5 8 13
3 . Print first n no of fibonacci series but start no from 5 and End no is 34
output : 5 8 13 21 34
4 . find how many no required from fibonacci series to generate sum >=50 . 
output number count : 8
*/

public class A22_FbonacciOperations {

	void getFebonacciNumbers(int count) {
		int num1 = 0;
		int num2 = 1;
		System.out.print("First " + count + " numbers in fibonacci series: ");
		System.out.print(num1 + " " + num2 + " ");
		for (int index = 1; index <= count - 2; index++) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			System.out.print(num2 + " ");
		}
		System.out.println();
	}

	void getFebonacciNumbersStart(int startNum, int total) {
		int num1 = 0;
		int num2 = 1;
		System.out.print("First " + total + " febonacci numbers from " + startNum + " number: ");
		int count = 1;
		while (count <= total) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= startNum) {
				System.out.print(num2 + " ");
				count++;
			}
		}
		System.out.println();
	}

	void getFebonacciNumbersStartEnd(int startNum, int endNum) {
		int num1 = 0;
		int num2 = 1;
		System.out.print("Febonacci numbers in the range [" + startNum + "-" + endNum + "] are: ");
		while (num2 <= endNum) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			if (num2 >= startNum && num2 <= endNum) {
				System.out.print(num2 + " ");
			}
		}
		System.out.println();
	}

	void getFebonacciNumbersRequiredSum(int sumLimit) {
		int num1 = 0;
		int num2 = 1;
		int sum = 1;
		int count = 1;
		System.out.print("Numbers required from fibonacci series to generate sum >=50: " + num2 + " ");
		while (sum <= sumLimit) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			sum = sum + num2;
			count++;
			System.out.print(num2 + " ");
		}
		System.out.println();
		System.out.print("Total Numbers required from fibonacci series to generate sum >=50: " + count);

	}

	public static void main(String[] args) {
		A22_FbonacciOperations febonacci = new A22_FbonacciOperations();
		febonacci.getFebonacciNumbers(8);
		febonacci.getFebonacciNumbersStart(5, 3);
		febonacci.getFebonacciNumbersStartEnd(5, 34);
		febonacci.getFebonacciNumbersRequiredSum(50);
	}

}