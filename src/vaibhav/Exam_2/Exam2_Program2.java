/* Exam 2 : 11th Jan 2022

2. WAP to print a single occurrence element from the array in Java?
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}

*/

package vaibhav.Exam_2;

import java.util.Arrays;

public class Exam2_Program2 {

	void printsingleOccurrenceElement(int[] arr) {
		System.out.println("Input Array : " + Arrays.toString(arr));
		System.out.println("Single Ocurrance in a given array are : ");
		
		for (int outerIndex = 0; outerIndex <= arr.length - 1; outerIndex++) {
			boolean flag = true;
			for (int innerIndex = 0; innerIndex <= arr.length - 1; innerIndex++) {
				if (outerIndex != innerIndex) {
					if (arr[outerIndex] == arr[innerIndex]) {
						flag = false;
						break;
					}
				}

			}
			if (flag)
				System.out.print(arr[outerIndex] + " ");
		}
	}

	public static void main(String[] args) {

		Exam2_Program2 exam2_Program2 = new Exam2_Program2();
		int[] inputArr = { 5, 8, 1, 2, 4, 3, 2, 1 };
		exam2_Program2.printsingleOccurrenceElement(inputArr);
	}
}
