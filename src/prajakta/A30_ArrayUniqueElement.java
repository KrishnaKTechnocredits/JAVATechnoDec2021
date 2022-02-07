package prajakta;

public class A30_ArrayUniqueElement {

	void uniqueElementsInArray(int[] arr) {
		int[] output = new int[arr.length];
		int k = 0;
		int dupCount = 0;
		for (int index = 0; index < arr.length - 1; index++) {
			int count = 1;
			for (int j = index + 1; j < arr.length; j++) {
				if (arr[index] == arr[j]) {
					count++;
					dupCount++;
					break;
				}
			}
			if (count == 1) {
				output[k] = arr[index];
				k++;
			}
		}
		int[] finalOutput = new int[output.length - dupCount];

		for (int index = 0; index < finalOutput.length; index++) {
			finalOutput[index] = output[index];
			System.out.print(finalOutput[index] + " ");
		}
	}

	public static void main(String[] args) {
		A30_ArrayUniqueElement a1 = new A30_ArrayUniqueElement();
		int[] arr = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		a1.uniqueElementsInArray(arr);
	}

}