package hevin;

public class A15_ArrayExample {

	int getMaxNumber(int[] arr) {
		int max = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (max < arr[index])
				max = arr[index];
		}
		return max;
	}

	int getMinNumber(int[] arr) {
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

	int getSumOfPositiveNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				sum = sum + arr[index];
		}
		return sum;

	}

	int getSumOfEvenPostiveNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0 && arr[index] % 2 == 0)
				sum = sum + arr[index];
		}
		return sum;
	}

	String getMaxLengthString(String[] str) {
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
		A15_ArrayExample A15_ArrayExample = new A15_ArrayExample();
		int[] a = { 75, 86, -29, 45, 99, -5, 80, 101 };
		System.out.println("Max Number in array is : " + A15_ArrayExample.getMaxNumber(a));
		System.out.println("Min Number in array is : " + A15_ArrayExample.getMinNumber(a));

		int[] arr = { 12, -11, 99, 11, 23, -44 };
		System.out.println("Count of all positive Numbers is : " + A15_ArrayExample.countPositiveNum(arr));

		int[] arr1 = { 10, 20, -33, -55, 2 };
		System.out.println("Sum of all positive Numbers is : " + A15_ArrayExample.getSumOfPositiveNum(arr1));

		int[] arr2 = { 10, 13, -14, -20, 22, 3 };
		System.out.println("Sum of all positive Even Numbers is : " + A15_ArrayExample.getSumOfEvenPostiveNum(arr2));

		String[] str = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		System.out.println("Name with max Character length is : " + A15_ArrayExample.getMaxLengthString(str));
	}
}