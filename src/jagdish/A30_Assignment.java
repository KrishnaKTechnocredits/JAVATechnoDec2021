package jagdish;
/*1. WAP to shift all the zero elements of an array after the non zero elements present in the given array.
Input     : {1, 0, 2, 0, 9, 6, 0, 19, 20, 0}
Output  : {1, 2, 9, 6, 19, 20, 0, 0, 0, 0}*/

public class A30_Assignment {

	void shiftArraytoZero(int[] arr) {
		System.out.println("Below is the Array shifted to Zero");
		int[] newArray = new int[arr.length];
		int temp = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				newArray[temp] = arr[index];
				temp++;
			}
		}

		for (int index = 0; index < arr.length; index++) {
			System.out.print(newArray[index] + " ");
		}
	}

	// Find Unique Array
	void uniqueElementsInArray(int[] arr) {
		System.out.println("Below is the Unique Array");
		int[] newArray = new int[arr.length];
		int temp = 0;
		int dupcount = 0;
		for (int index = 0; index < arr.length - 1; index++) {
			int count = 1;
			for (int innerloop = index + 1; innerloop < arr.length; innerloop++) {
				if (arr[index] == arr[innerloop]) {
					count++;
					dupcount++;
					break;
				}
			}
			if (count == 1) {
				newArray[temp] = arr[index];
				temp++;
			}
		}

		int[] finalresult = new int[newArray.length - dupcount];

		for (int index = 0; index < finalresult.length; index++) {
			finalresult[index] = newArray[index];
			System.out.print(finalresult[index] + " ");
		}
	}

	public static void main(String[] args) {
		A30_Assignment shiftarray = new A30_Assignment();
		int[] input = new int[] { 1, 0, 2, 0, 9, 6, 0, 19, 20, 0 };
		shiftarray.shiftArraytoZero(input);
		System.out.println("");
		int[] arr = { 19, 8, 0, 8, 60, 56, 97, 0, 33, 60, 0 };
		shiftarray.uniqueElementsInArray(arr);
	}
}