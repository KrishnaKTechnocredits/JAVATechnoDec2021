package priyankaKamble.test3;

import java.util.Arrays;

/*2. WAP to print a single occurrence element from the array in Java?
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}
*/
public class Test4 {

	void uniqueDigits(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex]) {
					count++;
				}
			}
			if (count == 1)
				System.out.print(" " + arr[index] + ", ");
		}
	}

	public static void main(String[] args) {
		Test4 test4 = new Test4();
		int[] arr = { 5, 8, 1, 2, 4, 3, 2, 1 };
		System.out.println("Given input Array = " + Arrays.toString(arr));
		System.out.print("Unique elements of given Array = ");
		test4.uniqueDigits(arr);
	}
}
