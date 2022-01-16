package nehaPandey;

public class A15_Array_Example_Program3 {
	int[] arr = { 12, -11, 99, 11, 23, -44 };
	int count;

	int countOfPositiveNumber() {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= 0) {
				count++;

			}

		}
		return count;

	}

	public static void main(String[] args) {
		A15_Array_Example_Program3 array = new A15_Array_Example_Program3();
		int PositiveNumber = array.countOfPositiveNumber();
		System.out.println("Count of positive numbers from given array: " + PositiveNumber);

	}

}
