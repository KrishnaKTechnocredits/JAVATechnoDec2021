package yogeshNagar;

public class Exam4_SquareOfArray {

	void getNextNumberSquareInArray(int[] arr) {
		for (int index = 0; index < arr.length - 1; index++) {
			int sqrInt = arr[index] * arr[index];
			if (sqrInt == arr[index + 1]) {
				System.out.println(arr[index] + " Next number in array is square " + arr[index + 1]);
			}
		}
	}

	public static void main(String[] args) {
		Exam4_SquareOfArray sqrNumArr = new Exam4_SquareOfArray();
		int[] arr = { 2, 4, 16, 256 };
		sqrNumArr.getNextNumberSquareInArray(arr);
	}

}
