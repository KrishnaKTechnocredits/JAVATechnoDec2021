/* Program 1 : Find second max from given array.   
input : {1,11,3,99,66,54,22,44};
output : 66  */

package amruta.Assignment_23;

import java.util.Arrays;

class FindSecondHighestNum {

	// 1st Logic
	int secondHighestNum(int[] arr) {
		int maxNum = 0;
		int secondMaxNum = 0;

		for (int index = 0; index < arr.length; index++) {

			if (arr[index] > maxNum) {
				secondMaxNum = maxNum;
				maxNum = arr[index];

			} else if (arr[index] > secondMaxNum) {
				secondMaxNum = arr[index];
			}
		}
		return secondMaxNum;
	}

	// 2nd Logic
	int findMaxNum(int[] arr) {
		int maxNum = 0;
		int tempIndex = 0;

		for (int index = 0; index < arr.length; index++) {

			if (arr[index] > maxNum) {
				maxNum = arr[index];
				tempIndex = index;
			}
		}
		arr[tempIndex] = 0;
		
		return maxNum;
	}

	void printSecondMaxNum(int[] arr, int num) {

		int ans = 0;
		for (int index = 1; index <= num; index++) {
			ans = findMaxNum(arr);
		}
		System.out.println("\nNew array after replacing max num with 0 - " + "\n\n" + Arrays.toString(arr));
		System.out.println("\nSecond Max number from given array is : " + ans);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 11, 3, 99, 66, 54, 22, 44 };
		FindSecondHighestNum findsecondhighestnum = new FindSecondHighestNum();
		
		System.out.println("\n------------------- 1st Logic O/P ---------------\n");

		int sMaxNum = findsecondhighestnum.secondHighestNum(arr);

		System.out.println("Second Max Number from given array is : " + sMaxNum);

		System.out.println("\n------------------- 2nd Logic O/P ---------------\n");

		System.out.println("\nGiven array - " + "\n\n" + Arrays.toString(arr));

		findsecondhighestnum.printSecondMaxNum(arr, 2);
	}
}