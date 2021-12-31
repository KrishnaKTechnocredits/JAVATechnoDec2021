package priya;


public class A15_ArrayProgram{

	int maxNumber(int[] arr) {
			int max = arr[0];
			for (int index = 1; index < arr.length; index++) {
				if (max < arr[index])
					max = arr[index];
			}
			return max;
		}

		int minNumber(int[] arr) {
			int min = arr[0];
			for (int index = 1; index < arr.length; index++) {
				if (min > arr[index])
					min = arr[index];
			}
			return min;

		}

		int countPositiveNum(int[] arr) {
			int count = 0;
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] > 0)
					count++;
			}
			return count;
		}

		int sumOfPositiveNum(int[] arr) {
			int sum = 0;
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] > 0)
					sum = sum + arr[index];
			}
			return sum;

		}

		int sumOfEvenPostiveNum(int[] arr) {
			int sum = 0;
			for (int index = 0; index < arr.length; index++) {
				if (arr[index] > 0 && arr[index] % 2 == 0)
					sum = sum + arr[index];
			}
			return sum;
		}

		String maxLengthString(String[] str) {
			String maxString = str[0];
			int maxLength = str[0].length();
			for (int index = 1; index < str.length; index++) {
				if (maxLength < str[index].length()) {
					maxString = str[index];
					maxLength = str[index].length();
				}

			}
			return maxString;

		}

		public static void main(String[] args) {
			A15_ArrayProgram a15 = new A15_ArrayProgram();
			int[] a = { 75, 23, -30, 99, 99, -5, 0, 101 };
			System.out.println("Largest number in given array is: " + a15.maxNumber(a));
			System.out.println("Smallest number in given array is: " + a15.minNumber(a));

			int[] arr = { 12, -11, 99, 11, -69, -45 };
			System.out.println("Count of all positive numbers in given array is: " + a15.countPositiveNum(arr));

			int[] arr1 = { 10, 20, -33, -55, 2 };
			System.out.println("Sum of all positive numbers in given array is: " + a15.sumOfPositiveNum(arr1));

			int[] arr2 = { 10, 13, -14, -20, 22, 3 };
			System.out.println("Sum of all positive even numbers in given array is: " + a15.sumOfEvenPostiveNum(arr2));

			String[] str = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
			System.out.println("Max length String in given array is: " + a15.maxLengthString(str));
		}
	}


