package prajakta;

public class A25_ArrayMissingNumber {

	int findMissingElementInArray(int[] num) {
		int n = 10; // for first n elements
		int sum = n * (n + 1) / 2; //
		for (int index = 0; index < num.length; index++)
			sum = sum - num[index];
		return sum;
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
		A25_ArrayMissingNumber example1 = new A25_ArrayMissingNumber();
		System.out.println("Missing Number is: " + example1.findMissingElementInArray(num));
	}
}