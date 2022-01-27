package saurav;

public class Test_4 {

	void isNextNumIsSquareOfPrevious(int[] arr) {
		boolean flag = false;
		for (int index = 0; index < arr.length - 1; index++) {
			int num1 = arr[index];
			int num2 = arr[index + 1];
			num1 = arr[index] * arr[index];
			if (num1 == num2) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		System.out.println("OUTPUT : " + flag);
	}

	boolean findPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void stringOfPrimeLength(String input) {
		String output = "";
		String arr[] = input.split(" ");
		for (int index = 1; index < arr.length; index++) {
			int wordLength = arr[index].length();
			if (findPrime(wordLength) && arr[index].length() != 1) {
				output = output + arr[index] + " ";
			}
		}
		System.out.println(output);
	}

	public static void main(String[] a) {
		Test_4 program1 = new Test_4();
		int arr1[] = { 2, 4, 16, 256 };
		int arr2[] = { 2, 4, 3, 16, 256 };
		program1.isNextNumIsSquareOfPrevious(arr1);
		program1.isNextNumIsSquareOfPrevious(arr2);
		System.out.println();

		Test_4 program2 = new Test_4();
		String input1 = "I love my India";
		String input2 = " I would like to have a cup of tea";
		System.out.print("OUTPUT 1: ");
		program2.stringOfPrimeLength(input1);
		System.out.println();
		System.out.print("OUTPUT 2: ");
		program2.stringOfPrimeLength(input2);
	}
}
