/*Programming Test : 27th Jan'2022

Program - 1 : WAP to find next number in an array is square of previous number or not

Input 1: {2,4,16,256}

output 1 : true

Note: 4 is square of 2, 16 is square of 4, and so on

*/

package vaibhav.Exam_4;

import java.util.Arrays;

public class Exam4_Program1 {

	boolean isCurrentNumSquareOfPreviousNum(int num1, int num2) {

		if (num2 == num1 * num1)
			return true;
		else
			return false;
	}

	boolean validatation(int[] numArr) {
		int previousNum = 0;
		int currentNum = 0;
		boolean flag = false;

		if (numArr.length > 2) {
			for (int index = 0; index < numArr.length; index++) {
				if (index == 0) {
					continue;
				} else {
					currentNum = numArr[index];
					previousNum = numArr[index - 1];
					flag = isCurrentNumSquareOfPreviousNum(previousNum, currentNum);
					if (flag == false)
						break;
				}
			}
			return flag;
		} else {
			return flag;
		}
	}

	public static void main(String[] args) {
		Exam4_Program1 exam4_Program1 = new Exam4_Program1();
		int[] inputArr = { 2, 4, 16, 256 };
		boolean validationFlag = exam4_Program1.validatation(inputArr);
		System.out.println("Input Array : " + Arrays.toString(inputArr));
		System.out.println("Is next number in an array is square of previous number : " + validationFlag);
	}
}
