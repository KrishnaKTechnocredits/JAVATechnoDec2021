package pranoti;

public class T2_ArrayOpreratons {

	void printSum(int[] arr) {
		int sum = 6;
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] + arr[innerIndex] == sum)
					System.out.println(arr[index] + " -> " + arr[innerIndex]);
			}
		}
	}

	void printSingleOccurrence(int[] arr) {
		System.out.println("-------------");
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex])
					count++;
			}
			if (count == 1)
				System.out.print(arr[index] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 8, 1, 2, 4, 3, 2, 1 };
		int arr1[] = { 5, 1, 2, 7, 6, 3, 4, 9 };
		T2_ArrayOpreratons a1 = new T2_ArrayOpreratons();
		a1.printSum(arr1);
		a1.printSingleOccurrence(arr);

	}
}
