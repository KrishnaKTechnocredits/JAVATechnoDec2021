package pratiksha;

public class A15_ReturnSum {

	int sumOfPositiveNumberFromGivenArray(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= 0)
				sum = sum + arr[index];;
		}

		return sum;
	}

	public static void main(String[] args) {
		A15_ReturnSum megha_Assignment15 = new A15_ReturnSum();
		int[] arr = { 10, 20, -33, -55, 2};
		int sum = megha_Assignment15.sumOfPositiveNumberFromGivenArray(arr);
		System.out.println("Sum of positive number in the given array is : " + sum);
	}

}
