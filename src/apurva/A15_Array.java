package apurva;

public class A15_Array {

	int findMaxmimumNumber(int[] arr) {

		int max = arr[0];
		for (int index = 1; index < arr.length; index++)
			if (max < arr[index])
				max = arr[index];
		System.out.println("Maximum number in the given list is:" + max + "\n");
		return max;
	}

	int findMinimumNumber(int[] arr) {
		int min = arr[0];
		for (int index = 1; index < arr.length; index++)
			if (min > arr[index])
				min = arr[index];
		System.out.println("Minimum number in the given list is:" + min + "\n");
		return min;
	}

	int findPositiveNumberCount(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++)
			if (arr[index] > 0)
				count++;
		return count;
	}

	int sumOfPositiveNumberCount(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++)
			if (arr[index] > 0)
				sum = sum + arr[index];
		return sum;
	}

	int sumOfEvenPositiveNumberCount(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++)
			if (arr[index] > 0 || arr[index] % 2 == 0)
				sum = sum + arr[index];
		return sum;
	}

	String maxLengthofArray(String[] arr) {
		int max = arr[0].length();
		String name = arr[0];
		int index = 1;
		for (; index < arr.length; index++)
			if (arr[index].length() > max) {
				max = arr[index].length();
				name = arr[index];
			}
		return name;
	}

	public static void main(String[] args) {
		A15_Array a15_Array = new A15_Array();
		int[] num = { 10, 30, 50, 100, 99 };
		System.out.println("The given list is: ");
		for (int i = 0; i < num.length; i++)
			System.out.println(num[i] + " " + "\n");
		a15_Array.findMaxmimumNumber(num);
		a15_Array.findMinimumNumber(num);

		int[] positive = { 12, -11, 99, 11, 23, -44 };
		int number = a15_Array.findPositiveNumberCount(positive);
		System.out.println("Count of positive number is: " + number +"\n");

		int[] addition = { 10, 20, -33, -55, 2 };
		int sum = a15_Array.sumOfPositiveNumberCount(addition);
		System.out.println("sum of positive number is: " + sum +"\n");

		int[] even = { 10, 13, -14, -20, 22, 3 };
		int evenSum = a15_Array.sumOfEvenPositiveNumberCount(even);
		System.out.println("sum of positive  & even number is: " + sum +"\n");

		String[] a = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		String arr = a15_Array.maxLengthofArray(a);
		System.out.println("Maximum lenght of the given String: " + arr);
	}

}
