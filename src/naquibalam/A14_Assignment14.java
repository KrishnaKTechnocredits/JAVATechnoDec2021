package naquibalam;

import java.util.Scanner;

public class A14_Assignment14 {

	
	void getCompareCount() {
		int duplicateCount = 0;
		int uniqueCount = 0;
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Please enter the String to check : ");
		String stringToUse = scanner1.next();
		scanner1.close();
		for (int i=0; i <= stringToUse.length()-1; i++) {
			int firstIndexOf = stringToUse.indexOf(stringToUse.charAt(i));
			int lastIndexOf = stringToUse.lastIndexOf(stringToUse.charAt(i));
			if ((firstIndexOf != lastIndexOf) && (lastIndexOf == i)) {
				duplicateCount++;
			}
			if ((firstIndexOf == lastIndexOf) && (lastIndexOf == i)) {
				uniqueCount++;
			}
		}
		if (duplicateCount > uniqueCount) {
			System.out.println("Java");
		} else {
			System.out.println("Selenium");
		}
	}
	
	public static void main(String[] args) {
		A14_Assignment14 a14_Assignment14 = new A14_Assignment14();
		a14_Assignment14.getCompareCount();
	}
}
