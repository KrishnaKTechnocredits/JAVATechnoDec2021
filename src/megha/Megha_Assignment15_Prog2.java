package megha;

public class Megha_Assignment15_Prog2 {

	int minNumberFromGivenArray(int[] arr) {
		int min = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (min > arr[index])
				min = arr[index];
		}

		return min;
	}

	public static void main(String[] args) {
		Megha_Assignment15_Prog2 megha_Assignment15 = new Megha_Assignment15_Prog2();
		int[] arr = { 19, 11, 17, 29, 119, 67 };
		int min = megha_Assignment15.minNumberFromGivenArray(arr);
		System.out.println("Minimum number in the given array is : " + min);
	}
}
