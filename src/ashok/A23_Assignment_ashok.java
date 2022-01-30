package ashok;

import java.util.Arrays;

public class A23_Assignment_ashok {
	
	/*
	 * Program 1 : Find second max from given array. input :
	 * {1,11,3,99,66,54,22,44}; output : 66
	 */
	
	void findSecondMax(int[] arr, int n) {
		int secondMax = 0;
		for (int index = 1; index <= n; index++) {
			secondMax = findMax(arr);
		}
		System.out.println("The Second Max is : " + secondMax);

	}
	/***************************************************/
	
	/*
	 * Program 2 : Find sum of numbers from given string. input :
	 * te12ch22nocre3dits4 output : 12 + 22 + 3 + 4 = 41
	 */


	int findSumOfNumFromGivenString(String str) {
		int sum = 0;
		String s = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				s = s + ch;
			else if (s != "") {
				sum = sum + Integer.parseInt(s);
				s = "";
			}
		}
		return sum;
	}

	/***************************************************/
	
	
	
	// Find Max Function
	int findMax(int[] arr) {
		int max = 0;
		int tempIndex = 0;
		for (int index = 1; index < arr.length; index++) {
			if (max < arr[index]) {
				max = arr[index];
				tempIndex = index;
			}
		}
		arr[tempIndex] = 0;
		return max;
	}
	// Find Max Function
	

	/*
	 * Program 3 : Return a string by placing all small characters first, followed
	 * by digits, capital letters, special characters. input : te4c&Hno7CreD-8i*ts
	 * output : tecnoreits478HCD&-
	 **/

	
	String findLowerUpperDigitsSpecialCharInOrder(String str) {
		String lCase = "";
		String uCase = "";
		String digits = "";
		String specialChar = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLowerCase(ch))
				lCase = lCase + ch;
			else if (Character.isUpperCase(ch))
				uCase = uCase + ch;
			else if (Character.isDigit(ch))
				digits = digits + ch;
			else
				specialChar = specialChar + ch;
		}
		return lCase + digits + uCase + specialChar;
	}
	
	/************************************************/

	/*
	 * Program 4 : Find the difference between odd and even digits from given
	 * string. input : tec5hno3cre6di1ts output : 3 Hint : (5+3+1)-(6) = 9-6
	 */

	
	int findDiffBetweenOddAndEven(String str) {

		String s = "";
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				s = s + ch;
			else if (s != "") {
				if (Integer.parseInt(s) != 0 && Integer.parseInt(s) % 2 == 0) {
					sumEven += Integer.parseInt(s);
					s = "";
				} else {
					sumOdd += Integer.parseInt(s);
					s = "";
				}
			}
		}
		return sumOdd - sumEven;
	}

	/*
	 * Program 5 : Find the difference between even and odd numbers from given
	 * string. input : te112ch34no29 output : 11 7 hint : (112+34)-(29)
	 */

	int findDiffBetweenEvenAndOdd(String str) {

		String s = "";
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				s = s + ch;
			else if (s != "") {
				if (checkEvenOdd(Integer.parseInt(s))) {
					sumEven += Integer.parseInt(s);
				} else {
					sumOdd += Integer.parseInt(s);
				}
				s = "";
			}
		}
		if (s != "") {
			if (checkEvenOdd(Integer.parseInt(s))) {
				sumEven += Integer.parseInt(s);
			} else {
				sumOdd += Integer.parseInt(s);
			}
		}

		return (sumEven - sumOdd);
	}

	boolean checkEvenOdd(int num) {
		if (num != 0 && num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * Program 6 : Return a string by placing all odd numbers , first capital
	 * letters from given string, even numbers. input : eTe1CH9cred4it6s output :
	 * 19T46
	 */


	String findOddNosUpperCaseEvenNosrInOrder(String str) {
		String evenNo = "";
		String uCase = "";
		String oddNo = "";
		String digits = "";
		int uCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digits = digits + ch;
				if (Integer.parseInt(digits) % 2 == 0)
					evenNo = evenNo + ch;
				else
					oddNo = oddNo + ch;
			} else if (Character.isUpperCase(ch)) {
				if (uCount == 0) {
					uCase = uCase + ch;
					uCount++;
				}
			}
		}
		return oddNo + uCase + evenNo;
	}

	boolean isTwoArraysidentical(int[] arr1, int[] arr2) {
		if (Arrays.equals(arr1, arr2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		A23_Assignment_ashok a23_Assignment_ashok = new A23_Assignment_ashok();
		System.out.println("Output of Program 1 : ");
		int[] arr = { 11, 17, 2, 6, 99, 56, 36, 9 };
		a23_Assignment_ashok.findSecondMax(arr, 2);
		System.out.println();
		System.out.println("Output of Program 2 : ");
		int sum = a23_Assignment_ashok.findSumOfNumFromGivenString("Tec12hno34cred5its");
		System.out.println("The sum of digits in the given String : " + sum);
		System.out.println();
		System.out.println("Output of Program 3 : ");
		String newString = a23_Assignment_ashok.findLowerUpperDigitsSpecialCharInOrder("te4c&Hno7CreD-8i*ts");
		System.out.println("The new sorted String : " + newString);
		System.out.println();
		System.out.println("Output of Program 4 : ");
		int diffBetweenOddAndEven = a23_Assignment_ashok.findDiffBetweenOddAndEven("tec5hno3cre6di1ts");
		System.out.println("The Difference between Odd and Even Sum : " + diffBetweenOddAndEven);
		System.out.println();
		System.out.println("Output of Program 5 : ");
		int diffBetweenEvenAndOdd = a23_Assignment_ashok.findDiffBetweenEvenAndOdd("te112ch34no29");
		System.out.println("The Difference between Even and Odd Sum : " + diffBetweenEvenAndOdd);
		System.out.println();
		System.out.println("Output of Program 6 : ");
		String newString1 = a23_Assignment_ashok.findOddNosUpperCaseEvenNosrInOrder("eTe1CH9cred4it6s");
		System.out.println("The new sorted String : " + newString1);
		System.out.println();
		System.out.println("Output of Program 7 : ");
		int[] arr1 = { 11, 17, 2 };
		int[] arr2 = { 11, 17, 2 };
		boolean ans = a23_Assignment_ashok.isTwoArraysidentical(arr1, arr2);
		if (ans)
			System.out.println("Both Arrays are identical");
		else
			System.out.println("Both Arrays are not identical");

	}

}