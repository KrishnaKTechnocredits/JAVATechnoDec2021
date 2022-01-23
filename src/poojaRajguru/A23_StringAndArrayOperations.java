package poojaRajguru;

public class A23_StringAndArrayOperations {
	void secondMax(int[] arr) {
		int maxno1, maxno2;
		// arr = {1,11,3,99,66,54,22,44};
		if (arr[0] > arr[1]) {
			maxno1 = arr[0];
			maxno2 = arr[1];
		} else {
			maxno1 = arr[1];
			maxno2 = arr[0];
		}
		for (int index = 2; index < arr.length; index++) {
			if (maxno1 < arr[index]) {
				maxno2 = maxno1;
				maxno1 = arr[index];
			} else if (maxno1 > arr[index] && maxno2 < arr[index]) {
				maxno2 = arr[index];
			}
		}
		System.out.println("The Second Max Number From Given Array is :  " + maxno2);
	}

	void sumOfDigitsInString(String str) {
		// te12ch22nocre3dits4
		String temp = "";
		int add = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
			} else {
				if (!temp.equals("")) {
					add = add + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if (!temp.equals("")) {
			add = add + Integer.parseInt(temp);
		}
		System.out.print(add);
	}

	String replacingCharacterDigitsSpecialChar(String str1) {
		String uppercase = "";
		String lowercase = "";
		String dgt = "";
		String specialchar = "";
		for (int index = 0; index < str1.length(); index++) {
			char ch = str1.charAt(index);
			if (Character.isLowerCase(ch)) {
				lowercase += ch;
			} else if (Character.isUpperCase(ch)) {
				uppercase += ch;
			} else if (Character.isDigit(ch)) {
				dgt += ch;
			} else {
				specialchar += ch;
			}
		}
		return lowercase + dgt + uppercase + specialchar;
	}

	void diffOddEvenNumberFromString(String str2) {
		// te5ch3nocre6dits1
		String var = "";
		int diff = 0;
		for (int index = 0; index < str2.length(); index++) {
			char ch = str2.charAt(index);
			if (Character.isDigit(ch)) {
				var = var + ch;
			} else {
				if (!var.equals("")) {
					if (Integer.parseInt(var) % 2 == 0) {
						diff = diff + Integer.parseInt(var);
						var = "";
					} else {
						diff -= Integer.parseInt(var);
						var = "";
					}
				}
			}
		} // if outer
		if (!var.equals("")) {
			if (Integer.parseInt(var) % 2 == 0) {
				diff += Integer.parseInt(var);
			} else
				diff -= Integer.parseInt(var);

		}
		System.out.println("The difference between even and off numbers is : " + diff);
	}

	void diffOddEvenDigitFromString(String str3) {
		int add = 0;
		for (int index = 0; index < str3.length(); index++) {
			char ch = str3.charAt(index);
			if (Character.isDigit(ch)) {
				if (Character.getNumericValue(ch) % 2 != 0) {
					add += Character.getNumericValue(ch);
				} else {
					add -= Character.getNumericValue(ch);
				}
			}
		}
		System.out.println("The diff between even and odd digits is : " + add);
	}

	void replaceOddFirstCapEvenDigitFromString(String str4) {
		String odd = "";
		String even = "";
		String uppercase = "";
		int count = 0;
		String dgt = "";
		for (int index = 0; index < str4.length(); index++) {
			char ch = str4.charAt(index);
			if (Character.isDigit(ch)) {
				dgt = dgt + ch;
				if (Integer.parseInt(dgt) % 2 == 0)
					even = even + ch;
				else
					odd = odd + ch;
			} else if (Character.isUpperCase(ch)) {
				if (count == 0) {
					uppercase += ch;
					count++;
				}
			}
		}
		System.out.println("The String is :  " + odd + uppercase + even);
	}

	void arrayIdentical(int[] arr1, int[] arr2) {
		boolean flag = true;
		if (arr1.length == arr2.length) {
			for (int index = 0; index < arr1.length; index++) {
				if (arr1[index] != arr2[index]) {
					flag = false;
					break;
				}
			}
		} else {
			flag = false;
		}
		if (flag == true)
			System.out.println("Given Array is Identical");
		else
			System.out.println("Given Array is not Identical");
	}

	public static void main(String[] args) {
		A23_StringAndArrayOperations no = new A23_StringAndArrayOperations();
		int[] arr = { 1, 11, 3, 99, 66, 54, 22, 44 };
		no.secondMax(arr);

		System.out.print("Sum of Numbers from given string : ");
		String str = "te12ch22nocre3dits4";
		no.sumOfDigitsInString(str);

		System.out.println();
		String str1 = "te12ch22nocre3dits4";
		String ans = no.replacingCharacterDigitsSpecialChar(str1);
		System.out.println("The String is :  " + ans);

		String str2 = "te5ch3nocre6dits1";
		no.diffOddEvenNumberFromString(str2);

		String str3 = "te5ch3nocre6dits1";
		no.diffOddEvenDigitFromString(str3);

		String str4 = "Te5ch3nocre6dits1";
		no.replaceOddFirstCapEvenDigitFromString(str4);

		int[] arr1 = { 10, 44, -33 };
		int[] arr2 = { 10, 44, -33 };
		no.arrayIdentical(arr1, arr2);
		System.out.println("");
	}
}
