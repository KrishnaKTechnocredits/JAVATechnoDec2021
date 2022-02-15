package yogiraj;

public class Assignment30 {
	int input[] = { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };

	// Output : {1, 2, 9, 6, 19, 20, 0, 0, 0, 0}

	public void shiftZero() {
		int temp = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] == 0) {
				for (int j = input.length - 1; j > i; j--) {
					if (input[j] != 0 && input[i] != input[j]) {
						temp = input[j];

						input[j] = input[i];

						input[i] = temp;

					}
				}
			}
		}
	}

	public void printArray() {
		for (int a : input) {
			System.out.print(a + "  ");
		}
		System.out.println();
	}

	public void getUniqueElements() {
		int input[] = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };

		// Output : {19, 8, 0, 60, 56, 97, 33}

		int[] uniqueElements = new int[input.length];

		int index = 0;

		boolean flag = false;

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					flag = true;
				}

			}
			if (flag == false) {
				uniqueElements[index] = input[i];

				index++;
			}
			flag = false;
		}

		for (int i = 0; i <= 6; i++) {
			System.out.print(uniqueElements[i] + "  ");
		}
	}

	public static void main(String[] args) {
		Assignment30 a = new Assignment30();

		a.shiftZero();

		System.out.println("Array after shifting zero to end \n");

		a.printArray();

		System.out.println("\n Array with all unique elements \n");

		a.getUniqueElements();
	}

}
