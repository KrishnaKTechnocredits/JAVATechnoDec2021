//Total of digits in string (Character.getNumericValue)

package pallavi;

import java.util.Scanner;

public class A20_CharFunctions2 {

	int getSumOfDigits(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				sum = sum + Character.getNumericValue(str.charAt(index));
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter input string");
		String str = sc1.next();
		System.out.println("Total of digits in given string is:" + new A20_CharFunctions2().getSumOfDigits(str));
		sc1.close();

	}
}
