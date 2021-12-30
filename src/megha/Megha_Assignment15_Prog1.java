package megha;

public class Megha_Assignment15_Prog1 {

	int maxNumberFromGivenArray(int[] arr) {
		int max = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (max < arr[index])
				max = arr[index];
		}

		return max;
	}

	public static void main(String[] args) {
		Megha_Assignment15_Prog1 megha_Assignment15 = new Megha_Assignment15_Prog1();
		int[] arr = { 19, 11, 17, 29, 119, 67 };
		int max = megha_Assignment15.maxNumberFromGivenArray(arr);
		System.out.println("Maximum number in the given array is : " + max);

	}

}
