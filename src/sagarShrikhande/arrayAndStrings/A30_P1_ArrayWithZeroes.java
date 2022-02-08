package sagarShrikhande.arrayAndStrings;

public class A30_P1_ArrayWithZeroes {

	void shiftZeroesOnRight(int[] arr) {
		int[] temp = new int[arr.length];
		int j = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				temp[j] = arr[index];
				j++;
			}
		}
		for (int index = 0; index < arr.length; index++)
			System.out.print(temp[index] + " ");
	}

	public static void main(String[] args) {
		A30_P1_ArrayWithZeroes a1 = new A30_P1_ArrayWithZeroes();
		int[] arr = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		a1.shiftZeroesOnRight(arr);
	}
}
