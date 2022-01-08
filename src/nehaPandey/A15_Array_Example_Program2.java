package nehaPandey;

public class A15_Array_Example_Program2 {
	int[] arr = { 12, -11, 99, 11, 23, -44 };

	int minNumberFromArray() {

		int min = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (min > arr[index]) {
				min = arr[index];
			}

		}
		return min;

	}

	public static void main(String[] args) {
		A15_Array_Example_Program2 array = new A15_Array_Example_Program2();

		int minnumber = array.minNumberFromArray();
		System.out.println("Minimum number from given array: " + minnumber);
	}

}
