package saurav;

/*krishna, 19:20
Assignment-23 : 15th Jan'2022

Program 1 : Find second max from given array.
input : {1,11,3,99,66,54,22,44}; ///////////done////////
output : 66

Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4///////////done/////////
output : 12 + 22 + 3 + 4 = 41

Program 3 : Return a string by placing all small characters first, followed by digits, capital letters, special characters.

input : te4c&Hno7CreD-8i*ts////////done/////////
output : tecnoreits478HCD&-*

Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3//////////////////////done////////////
Hint : (5+3+1)-(6) = 9-6

Program 5 : Find the difference between even and odd numbers from given string.
input : te112ch34no29
output : 117
hint : (112+34)-(29)

Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe1CH9cred4it6s
output : 19T46///////////DONE////////////

Program 7 : Verify if 2 arrays are identical.

int[] arr1 = {10,44,-33};
int[] arr2 = {10,44,-33};

output : both arrays are identical.//////done/////////

int[] arr3 = {10,44,-33};
int[] arr4 = {10,44,-33,55};

output : both arrays are not identical*/
public class A23_GetSecondMaxNumFromArray {

	int firstMax;
	int secondMax;
	int updatedSecondMax;
	int updatedFirstMax;

	void getSecondMaxNumFromArray(int[] input) {
		for (int index = 0; index < input.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (input[index] < input[innerIndex]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(input[index]);
				break;
			}
		}
	}

	int findSumOfDigitFromString(String input) {
		int sum = 0;
		char ch;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else if (!temp.equals("")) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		if (!temp.equals(""))
			sum = sum + Integer.parseInt(temp);
		System.out.println( sum);
		return sum;
	}

	void lowerDigitUpperSpecial(String input) {
		String output = " ";
		String lowerCase = " ";
		String upperCase = "";
		String digit = "";
		String special = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch) && Character.isLetter(ch)) {
				lowerCase = lowerCase + ch;
			} else if (Character.isUpperCase(ch) && Character.isLetter(ch)) {
				upperCase = upperCase + ch;
			} else if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else
				special = special + ch;
			output = lowerCase + digit + upperCase + special;
		}
		System.out.println(output);
	}

	void OddEvenNumDiff1(String input) {
		String numString = "";
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				numString += ch;
			} else if (!numString.equals("")) {
				int num = Integer.parseInt(numString);
				if (num % 2 == 0) {
					evenSum = evenSum + Integer.parseInt(numString);
					numString = "";
				} else if (!numString.equals("")) {
					num = Integer.parseInt(numString);
					if (num % 2 != 0)
						oddSum = oddSum + Integer.parseInt(numString);
					numString = "";
				}
			}
		}
		if (!numString.equals("")) {
			int num = Integer.parseInt(numString);
			if (num % 2 == 0) {
				evenSum = evenSum + Integer.parseInt(numString);
				numString = "";
			} else if (!numString.equals("")) {
				num = Integer.parseInt(numString);
				if (num % 2 != 0)
					oddSum = oddSum + Integer.parseInt(numString);
				numString = "";
			}
		}
		System.out.println(evenSum - oddSum);
	}

	void OddEvenNum2(String input) {
		int evenSum = 0;
		int oddSum = 0;
		String numString = "";
		int OddEvenDiff = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				numString += ch;
				int num = Integer.parseInt(numString.valueOf(ch));
				if (ch % 2 == 0) {
					evenSum = evenSum + num;
				} else
					oddSum = oddSum + num;
			}
			OddEvenDiff = evenSum - oddSum;
		}
		System.out.println("Difference bet even total and odd total : " + OddEvenDiff);
	}

	void arrangeString(String input) {
		String oddNum = "";
		String evenNum = "";
		String letter = "";

		for (int index = 0; index < input.length(); index++) {
			String temp = "";
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
				int numString = Integer.parseInt(temp);
				if (numString % 2 == 0) {
					evenNum += temp;
					temp = "";
				} else
					oddNum = oddNum + temp;
				temp = "";
			}

		}
		// System.out.println(evenNum);
		// System.out.println(oddNum);

		for (int index1 = 0; index1 < input.length(); index1++) {
			String temp = "";
			char ch = input.charAt(index1);
			if (Character.isUpperCase(ch) && Character.isLetter(ch)) {
				temp = temp + ch;
				letter = temp;
				// System.out.println(temp);
				break;
			}
		}
		System.out.println(evenNum + letter + oddNum);
	}

	void checkIdenticalArrays(int[] arr3, int[] arr4) {
		boolean flag = false;
		if (arr3.length == arr4.length) {
			for (int index = 0; index < arr3.length; index++) {
				if (arr3[index] != arr4[index])
					flag = true;
			}
			if (flag == false)
				System.out.println("both arrays are  identical.");
			else
				System.out.println("both arrays are not identical.");
		} else
			System.out.println("both arrays are not identical.");
	}

	public static void main(String[] args) {
		A23_GetSecondMaxNumFromArray secondmax = new A23_GetSecondMaxNumFromArray();
		int[] input = { 10, 7, 11, 99, 56, 46, 3 };
		System.out.print("second max num is : ");
		secondmax.getSecondMaxNumFromArray(input);
		System.out.println();
		System.out.print("sum of num from String array : ");
		secondmax.findSumOfDigitFromString("te12ch22nocre3dits4");
		System.out.println();
		System.out.print("OUTPUT : ");
		secondmax.lowerDigitUpperSpecial("te4c&Hno7CreD-8i*ts");
		System.out.println();
		System.out.print("DIFF IN ODD AND EVEN SUM 1: ");
		secondmax.OddEvenNum2("tec5hno3cre6di1ts");
		System.out.println();
		System.out.print("DIFF IN ODD AND EVEN SUM 1: ");
		secondmax.OddEvenNumDiff1("te112ch34no29");
		System.out.println();
		System.out.print("Arranged string : ");
		secondmax.arrangeString("eTe1CH9cred4it6s");
		System.out.println();
		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };

		int[] arr3 = { 10, 44, -33 };
		int[] arr4 = { 10, 44, -33, 55 };

		secondmax.checkIdenticalArrays(arr1, arr2);
		secondmax.checkIdenticalArrays(arr3, arr4);

	}
}