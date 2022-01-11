package megha;

public class Megha_Test2 {

	void displaySumOfSixForPairsInArray(int[] arr, int sum) {
		System.out.println("The Output of Program 1 for Pairs having Sum Of Six in Array : ");
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			for (int index1 = index + 1; index1 < arr.length; index1++) {
				int num1 = arr[index1];
				if ((num + num1) == sum)
					System.out.print("{" + num + "," + num1 + "}" + " ");
			}
		}
	}

	void displaySingleOccInArray(int[] arr) {
		System.out.println("The Output of Program 2 for all Single occurence in Array : ");
		System.out.print("{");
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			if (isAlreadyPresent(arr, index) == false)
				System.out.print(num + ",");
		}
		System.out.print("}");
	}

	boolean isAlreadyPresent(int[] arr, int index) {

		for (int index1 = 0; index1 < arr.length; index1++) {
			if (index != index1 && arr[index] == arr[index1])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Megha_Test2 megha_Test = new Megha_Test2();
		int[] arr = { 5, 1, 2, 7, 6, 3, 4, 9 };
		megha_Test.displaySumOfSixForPairsInArray(arr, 6);
		System.out.println();
		int[] arr1 = { 5, 8, 1, 2, 4, 3, 2, 1 };
		megha_Test.displaySingleOccInArray(arr1);
	}

}
