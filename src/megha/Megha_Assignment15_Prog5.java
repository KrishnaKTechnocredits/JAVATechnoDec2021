package megha;

public class Megha_Assignment15_Prog5 {

	int sumOfPositiveEvenNumberFromGivenArray(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= 0 && arr[index] % 2 == 0)
				sum = sum + arr[index];
		}

		return sum;
	}

	public static void main(String[] args) {
		Megha_Assignment15_Prog5 megha_Assignment15 = new Megha_Assignment15_Prog5();
		int[] arr = { 10, 13, -14, -20, 22, 3 };
		int sum = megha_Assignment15.sumOfPositiveEvenNumberFromGivenArray(arr);
		System.out.println("Sum of Positive Even number in the given array is : " + sum);
	}

}
