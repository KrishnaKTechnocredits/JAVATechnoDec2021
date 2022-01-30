package sham;

public class Test4_SquareNumber {

	void findNextNumberIsSquare() {
		int[] numArray = { 2, 4, 16, 256 };
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < numArray.length; i++) {
			try {

				if (numArray[i] * numArray[i] == numArray[i + 1]) {
					flag = true;
					count++;

				}
			} catch (ArrayIndexOutOfBoundsException ae) {

			}

		}

		if (flag == true && count == numArray.length - 1) {
			System.out.println(flag);
		}
	}

	public static void main(String[] args) {
		Test4_SquareNumber squareNum = new Test4_SquareNumber();
		squareNum.findNextNumberIsSquare();
	}

}
