package nehaPandey;

public class Exam_2 {

	void findSumOfGivenNumberFromArray() {
		int[] x = { 5, 1, 2, 7, 6, 3, 4, 9 };
		int sum = 6;

		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (sum == (x[i] + x[j])) {
					System.out.println(x[i] + "," + x[j]);
				}
			}

		}

	}

	void printSingleOccurenceElement(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}

		}

	}

	public static void main(String[] args) {
		Exam_2 exam = new Exam_2();
		System.out.println("Pairs in an array whose sum is equal to given number: ");
		exam.findSumOfGivenNumberFromArray();
		int[] arr = { 5, 8, 1, 2, 4, 3, 2, 1 };
		System.out.println("Single occurrnce element from the array: ");
		exam.printSingleOccurenceElement(arr);

	}

}
