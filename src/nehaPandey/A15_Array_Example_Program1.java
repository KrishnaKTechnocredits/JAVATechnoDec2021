package nehaPandey;

public class A15_Array_Example_Program1 {
	int[] arr = { 12, -11, 99, 11, 23, -44 };

	int maxNumberFromArray() {

		int max = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (max < arr[index]) {
				max = arr[index];
			}

		}
		return max;

	}

	public static void main(String[] args) {
		A15_Array_Example_Program1 array = new A15_Array_Example_Program1();

		int maxnumber = array.maxNumberFromArray();
		System.out.println("Maximum number from given array: " + maxnumber);
	}

}
