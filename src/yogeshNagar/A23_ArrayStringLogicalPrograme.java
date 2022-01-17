package yogeshNagar;

public class A23_ArrayStringLogicalPrograme {

	/*
	 * input : {1,11,3,99,66,54,22,44}; output : 66
	 */
	void getSecondMaxArray(int arr[]) {
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (arr[index] < arr[innerIndex]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[index]);
			}
			count = 0;
		}
	}

	/*
	 * input : te12ch22nocre3dits4 output : 12 + 22 + 3 + 4 = 41
	 */
	void getSumOfNumberInString(String str) {
		String temp = "";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				temp += str.charAt(index);
			} else if (!temp.equals("")) {
				sum += Integer.parseInt(temp);
				temp = "";
			}
		}
		if (!temp.equals(""))
			sum += Integer.parseInt(temp);
		System.out.println(sum);
	}

	/*
	 * input : te4c&Hno7CreD-8i*ts output : tecnoreits478HCD&-
	 **/
	void getReplacedCharcterSpecifiedPattern(String str) {// tecnoreits478HCD&-*
		String smallChar = "";
		String digit = "";
		String upperCaseChar = "";
		String specialChar = "";

		for (int index = 0; index < str.length(); index++) {
			if (Character.isLowerCase(str.charAt(index))) {
				smallChar = smallChar + str.charAt(index);
			} else if (Character.isDigit(str.charAt(index))) {
				digit = digit + str.charAt(index);
			} else if (Character.isUpperCase(str.charAt(index))) {
				upperCaseChar = upperCaseChar + str.charAt(index);
			} else {
				specialChar = specialChar + str.charAt(index);
			}
		}
		System.out.println(smallChar + digit + upperCaseChar + specialChar);
	}

	/*
	 * input : tec5hno3cre6di1ts output : 3 Hint : (5+3+1)-(6) = 9-6
	 */
	void getDiffrenceOddEvenNumberString(String str) {
		int evenSum = 0;
		int oddSum = 0;

		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				int digit = Integer.parseInt(str.valueOf(str.charAt(index)));
				if (digit % 2 == 0) {
					evenSum = evenSum + digit;
				} else {
					oddSum = oddSum + digit;
				}
			}
		}
		int subOddEvenDigit = oddSum - evenSum;
		System.out.println(subOddEvenDigit);

	}

	/*
	 * input : te112ch34no29 output : 117 hint : (112+34)-(29)
	 */
	void getCompleteDigitOddEvenDiffString(String str) {
		String temp = "";
		int oddNumber = 0;
		int evenNumber = 0;

		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				temp += str.charAt(index);
			} else if (!temp.equals("")) {
				if (Integer.parseInt(temp) % 2 == 0) {
					evenNumber += Integer.parseInt(temp);
				} else {
					oddNumber += Integer.parseInt(temp);
				}
				temp = "";
			}
		}
		if (!temp.equals(""))
			if (Integer.parseInt(temp) % 2 == 0) {
				evenNumber += Integer.parseInt(temp);
			} else {
				oddNumber += Integer.parseInt(temp);
			}
		System.out.println(evenNumber - oddNumber);
	}

	void getStringDefinedPattern(String str) {// 19T46
		String oddNumber = "";
		String evenNumber = "";
		String upperCaseLetter = "";

		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				int digit = Integer.parseInt(str.valueOf(str.charAt(index)));
				if (digit % 2 == 0) {
					evenNumber = evenNumber + digit;
				} else {
					oddNumber = oddNumber + digit;
				}
			} else if (Character.isUpperCase(str.charAt(index))) {
				if (upperCaseLetter.equals("")) {
					upperCaseLetter = upperCaseLetter + str.charAt(index);
				}
			}
		}
		System.out.println(oddNumber + upperCaseLetter + evenNumber);
	}

	/*
	 * int[] arr1 = {10,44,-33}; int[] arr2 = {10,44,-33}; output : both arrays are
	 * identical. int[] arr3 = {10,44,-33}; int[] arr4 = {10,44,-33,55}; output :
	 * both arrays are not identical.
	 */
	void getTwoArraysIdentical(int[] arr1, int[] arr2) {
		boolean flag = false;

		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] == arr2[index]) {
					flag = true;
				}
			}
		} else {
			flag = false;
		}
		if (flag == true) {
			System.out.println("Both Arrays are identical");
		} else {
			System.out.println("Both Arrays are non identical");
		}
	}

	public static void main(String[] args) {
		A23_ArrayStringLogicalPrograme arrStrProg = new A23_ArrayStringLogicalPrograme();

		System.out.println("----Programe 1 ---------");
		int arr[] = { 1, 11, 3, 99, 66, 54, 22, 44 };
		arrStrProg.getSecondMaxArray(arr);

		System.out.println("----Programe 2 ---------");
		arrStrProg.getSumOfNumberInString("te12ch22nocre3dits4");

		System.out.println("----Programe 3 ---------");
		arrStrProg.getReplacedCharcterSpecifiedPattern("te4c&Hno7CreD-8i*ts");

		System.out.println("----Programe 4 ---------");
		arrStrProg.getDiffrenceOddEvenNumberString("tec5hno3cre6di1ts");

		System.out.println("----Programe 5 ---------");
		arrStrProg.getCompleteDigitOddEvenDiffString("te112ch34no29");

		System.out.println("----Programe 6 ---------");
		arrStrProg.getStringDefinedPattern("eTe1CH9cred4it6s");

		System.out.println("----Programe 7 ---------");
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };
		arrStrProg.getTwoArraysIdentical(arr1, arr2);

		int[] arr3 = { 10, 44, -33 };
		int[] arr4 = { 10, 44, -33, 55 };
		arrStrProg.getTwoArraysIdentical(arr3, arr4);
	}
}
