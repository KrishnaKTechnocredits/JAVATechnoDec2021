package pratiksha;

public class A15_EvenNumSum {
	
	int sumOfPositiveEvenNumberFromGivenArray(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= 0 && arr[index] % 2 == 0)
				sum = sum + arr[index];
		}

		return sum;
	}

	public static void main(String[] args) {
		A15_EvenNumSum EvenNumSum = new A15_EvenNumSum();
		int[] arr = { 10, 13, -14, -20, 22, 3 };
		int sum = EvenNumSum.sumOfPositiveEvenNumberFromGivenArray(arr);
		System.out.println("Sum of Positive Even number in the given array is : " + sum);
	}

}
