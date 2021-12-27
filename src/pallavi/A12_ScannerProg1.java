/*Assignment - 12 : 26th Dec'2021

1. print freq of each character in given String. [Program-1]*/


package pallavi;

import java.util.Scanner;

public class A12_ScannerProg1 {

	void findfreq(String str) {
		int count;
		String isPresent = "";
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			for (int index = 0; index < str.length(); index++) {
				if (str.charAt(index) == str.charAt(i))
					count++;
			}

			if (isPresent(isPresent, str.charAt(i)) == false)
				System.out.println(str.charAt(i) + "--" + count);
			isPresent = isPresent + str.charAt(i);
		}
	}

	boolean isPresent(String str, char c) {

		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == c)
				return true;
		}
		return false;
	}

	public static void main(String[] arr) {
		A12_ScannerProg1 a12_ScannerProg1 = new A12_ScannerProg1();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter the imput string");
		String str=scanner1.nextLine();
		a12_ScannerProg1.findfreq(str);
		scanner1.close();
	}
}
