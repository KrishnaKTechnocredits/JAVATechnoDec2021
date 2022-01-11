package nehaPandey;

import java.util.Scanner;

public class A12_P3_Scanner_Example {
	boolean temp = true;

	int stringOccuurrencecount(String str1, char ch) {
		int count = 0;

		for (int index = 0; index < str1.length(); index++) {
			if (str1.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void countOccurrence(String strname) {
		
		for (int index = 0; index < strname.length(); index++) {
			char ch = strname.charAt(index);
			int count = stringOccuurrencecount(strname, ch);

			if (temp == true && count == 1) {
				System.out.println("First non repeative char is : " + ch);
				temp = false;
			}
		}
	}

	public static void main(String[] agrs) {
		A12_P3_Scanner_Example as = new A12_P3_Scanner_Example();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string: ");
		String str = sc.next();

		as.countOccurrence(str);

		sc.close();
	}

}
