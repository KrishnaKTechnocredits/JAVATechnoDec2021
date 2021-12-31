package swati;

public class A15_ArrayExample {

	int[] arr = { 15, 21, 18, 31, 12 };

	// Maximum
	int maxArray() {
		int max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				max = arr[i + 1];
			}
		}
		System.out.println("Maximum number is Array " + max);
		return max;
	}

	// Minimum
	int minArray() {
		int min = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				min = arr[i + 1];
			}
		}
		System.out.println("Maximum number is Array " + min);
		return min;
	}
	// Positive Count

	int findPositive() {
		int[] positiveArray = { 12, -11, 99, 11, 23, -44 };
		int count = 0;
		for (int i = 0; i < positiveArray.length - 1; i++) {
			if (positiveArray[i] > 0) {
				count++;
			}
		}
		System.out.println("Total Positive array " + count);
		return count;
	}

	// Sum of Positive
	int sumPositive() {
		int[] positiveArray = { 10, 20, -33, -55, 2 };
		int sum = 0;
		for (int i = 0; i < positiveArray.length; i++) {
			if (positiveArray[i] > 0) {
				sum = sum + positiveArray[i];
			}
		}
		System.out.println("Total Positive array " + sum);
		return sum;
	}
	// Sum of Even Positive

	int sumOfEven() {
		int[] positiveArray = { 10, 13, -14, -20, 22, 3 };
		int sum = 0;
		for (int i = 0; i < positiveArray.length; i++) {
			if (positiveArray[i] > 0 && positiveArray[i] % 2 == 0) {
				sum = sum + positiveArray[i];
			}
		}
		System.out.println("Total sum of Positive array " + sum);
		return sum;
	}

	String maxName() {
		String[] arr = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		int max = 0;
		String maxName = "";

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i].length() < arr[i + 1].length()) {
				max = arr[i + 1].length();
				maxName = arr[i + 1];
			}

		}
		System.out.println("Maxname is " + maxName + " with length " + max);
		return maxName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A15_ArrayExample array = new A15_ArrayExample();
		array.maxArray();
		array.minArray();
		array.findPositive();
		array.sumPositive();
		array.sumOfEven();
		array.maxName();
	}

}
