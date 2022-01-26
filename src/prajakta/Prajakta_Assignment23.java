package prajakta;

import java.util.Arrays;

public class Prajakta_Assignment23 {

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

	void findSecondMax(int[] arr, int n) {
		int ans = 0;
		for (int index = 1; index <= n; index++) {
			ans = findMax(arr);
		}
		System.out.println("The Second Max is : " + ans);
		;
	}

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
		Prajakta_Assignment23 prajakta_Assignment = new Prajakta_Assignment23();
		System.out.println("Output of Program 1 : ");
		int[] arr = { 11, 17, 2, 6, 99, 56, 36, 9 };
		prajakta_Assignment.findSecondMax(arr, 2);
		System.out.println();
		System.out.println("Output of Program 2 : ");
		int sum = prajakta_Assignment.findSumOfNumFromGivenString("Tec12hno34cred5its");
		System.out.println("The sum of digits in the given String : " + sum);
		System.out.println();
		System.out.println("Output of Program 3 : ");
		String newString = prajakta_Assignment.findLowerUpperDigitsSpecialCharInOrder("te4c&Hno7CreD-8i*ts");
		System.out.println("The new sorted String : " + newString);
		System.out.println();
		System.out.println("Output of Program 4 : ");
		int diffBetweenOddAndEven = prajakta_Assignment.findDiffBetweenOddAndEven("tec5hno3cre6di1ts");
		System.out.println("The Difference between Odd and Even Sum : " + diffBetweenOddAndEven);
		System.out.println();
		System.out.println("Output of Program 5 : ");
		int diffBetweenEvenAndOdd = prajakta_Assignment.findDiffBetweenEvenAndOdd("te112ch34no29");
		System.out.println("The Difference between Even and Odd Sum : " + diffBetweenEvenAndOdd);
		System.out.println();
		System.out.println("Output of Program 6 : ");
		String newString1 = prajakta_Assignment.findOddNosUpperCaseEvenNosrInOrder("eTe1CH9cred4it6s");
		System.out.println("The new sorted String : " + newString1);
		System.out.println();
		System.out.println("Output of Program 7 : ");
		int[] arr1 = { 11, 17, 2 };
		int[] arr2 = { 11, 17, 2 };
		boolean ans = prajakta_Assignment.isTwoArraysidentical(arr1, arr2);
		if (ans)
			System.out.println("Both Arrays are identical");
		else
			System.out.println("Both Arrays are not identical");

	}

}