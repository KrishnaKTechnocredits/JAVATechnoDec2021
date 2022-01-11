/* Exam 2 : 11th Jan 2022

 1. How to find all pairs in an array of integers whose sum is equal to the given number
i/p : {5,1,2,7,6,3,4,9} , sum : 6
o/p : {5,1}, {2,4}

*/
package vaibhav.Exam_2;

import java.util.Arrays;

public class Exam2_Program1 {

	void printPairOfNumForSum(int[] arr, int sumNum) {

		System.out.println("Input Array : " + Arrays.toString(arr));
		System.out.println("All the pairs in arry whose sum is equal to " + sumNum + " is as below :");
		
		for (int outerIndex = 0; outerIndex <= arr.length - 1; outerIndex++) {

			for (int innerIndex = outerIndex; innerIndex <= arr.length - 1; innerIndex++) {
				if (innerIndex != outerIndex) {
					int num1 = arr[outerIndex];
					int num2 = arr[innerIndex];
					if (num1 + num2 == sumNum)
						System.out.println(num1 + " , " + num2);
				}
			}
		}
		// System.out.println(inputArr.length);

	}

	public static void main(String[] args) {

		Exam2_Program1 exam2_Program1 = new Exam2_Program1();
		int[] arr = { 5, 1, 2, 7, 6, 3, 4, 9 };
		exam2_Program1.printPairOfNumForSum(arr,6);
	}

}
