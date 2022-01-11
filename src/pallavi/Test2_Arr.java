/*1. How to find all pairs in an array of integers whose sum is equal to the given number*
i/p  : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}



*2. WAP to print a single occurrence element from the array in Java?*
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}
*/

package pallavi;

public class Test2_Arr {

	void findSumArr(int[] arr, int sum) {
		System.out.println("Pairs in array with sum=" + sum);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum)
					System.out.println("{" + arr[i] + "," + arr[j] + "}");
			}
		}

	}

	void findSingleOccurance(int[] arr) {
		int[] temp = { 10 };
		int tempIndex = 0;

		System.out.print("Numbers occuring single time in given array:{");
		for (int outerIndex = 0; outerIndex < arr.length; outerIndex++) {
			int single = 0;
			for (int innnerIndex = 0; innnerIndex < arr.length; innnerIndex++) {
				if (arr[outerIndex] == arr[innnerIndex]) {
					single++;
				}
			}
			if (single == 1) {
				System.out.print(arr[outerIndex] + " ");
			}
		}
		System.out.println("}");
	}

	public static void main(String[] arr) {
		Test2_Arr test2 = new Test2_Arr();
		int[] input1 = { 5, 1, 2, 7, 6, 3, 4, 9 };
		int sum = 6;
		test2.findSumArr(input1, sum);
		int[] input2 = { 5, 8, 1, 2, 4, 3, 2, 1 };
		test2.findSingleOccurance(input2);

	}

}
