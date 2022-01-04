package ranjeet;

public class A15_ArrayBasicProgram {

	void maxNumFromArray(int[] number) {
		int max = number[0];
		for (int i = 1; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
			}
		}
		System.out.println("Max number is :" + max);
	}

	void minNumFromArray(int[] number) {
		int min = number[0];
		for (int i = 1; i < number.length; i++) {
			if (min > number[i]) {
				min = number[i];
			}
		}
		System.out.println("Min number is :" + min);
	}

	void countOfPositiveNumbers(int[] num) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				sum = sum + num[i];
				count++;
			}
		}
		System.out.println("Total positive number :" + count);
		System.out.println("Sum of positive numbers :" + sum);
	}

	void sumOfAllEvenPositiveNumbers(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0 && num[i] % 2 == 0) {
				sum = sum + num[i];

			}
		}
		System.out.println("Sum of even positive numbers :" + sum);
	}

	void maxLengthFromGivenString(String[] str) {
		int lString = 0;
		String x = "";
		for (int i = 0; i < str.length; i++) {
			if (lString < str[i].length()) {
				lString = str[i].length();
				x = str[i];
			}
		}
		System.out.println("Max length string :" + x);
	}

	public static void main(String[] args) {
		A15_ArrayBasicProgram a1 = new A15_ArrayBasicProgram();
		int[] arr = { 10, 13, -14, -20, 22, 3 };
		a1.countOfPositiveNumbers(arr);
		a1.maxNumFromArray(arr);
		a1.minNumFromArray(arr);
		a1.sumOfAllEvenPositiveNumbers(arr);
		String[] st = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		a1.maxLengthFromGivenString(st);
	}
}
