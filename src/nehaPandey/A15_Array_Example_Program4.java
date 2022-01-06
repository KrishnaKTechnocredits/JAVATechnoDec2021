package nehaPandey;

public class A15_Array_Example_Program4 {
	int[] arr = { 10, 20, -33, -55, 2 };
	int sum = 0;

	int sumOfPositiveNumber() {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= 0) {

				sum = sum + arr[index];

			}
		}
		return sum;

	}

	public static void main(String[] args) {
		A15_Array_Example_Program4 array = new A15_Array_Example_Program4();
		int sum = array.sumOfPositiveNumber();
		System.out.println("Sum of positive numbers from given array: " + sum);

	}

}
