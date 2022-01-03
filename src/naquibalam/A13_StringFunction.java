package naquibalam;

import java.util.Scanner;

public class A13_StringFunction {
	
	void getAllDuplicateChar() {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Please enter the String for which you want duplicate characters : ");
		String stringToUse = scanner1.next();
		System.out.println("Print only first duplicate character (true/false) : ");
		boolean printOnlyFirst = scanner1.nextBoolean();
		if (printOnlyFirst) {
			System.out.print("First duplicate character in string '" + stringToUse + "' is : ");
		} else {
			System.out.print("All duplicate character(s) in string '" + stringToUse + "' : ");
		}
		for (int i=0; i <= stringToUse.length()-1; i++) {
			int firstIndexOf = stringToUse.indexOf(stringToUse.charAt(i));
			int lastIndexOf = stringToUse.lastIndexOf(stringToUse.charAt(i));
			if ((firstIndexOf != lastIndexOf) && (lastIndexOf == i)) {
				System.out.print(stringToUse.charAt(i) + " ");
				if (printOnlyFirst) {
					break;
				}
			}
		}
		scanner1.close();
		System.out.println("");
	}
	
	void getAllUniqueChar() {
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Please enter the String for which you want unique characters : ");
		String stringToUseUnique = scanner2.next();
		System.out.println("Print only first unique character (true/false) : ");
		boolean printOnlyFirst = scanner2.nextBoolean();
		if (printOnlyFirst) {
			System.out.print("First unique character in string '" + stringToUseUnique + "' is : ");
		} else {
			System.out.print("All unique character(s) in string '" + stringToUseUnique + "' : ");
		}
		for (int i=0; i <= stringToUseUnique.length()-1; i++) {
			int firstIndexOf = stringToUseUnique.indexOf(stringToUseUnique.charAt(i));
			int lastIndexOf = stringToUseUnique.lastIndexOf(stringToUseUnique.charAt(i));
			if ((firstIndexOf == lastIndexOf) && (lastIndexOf == i)) {
				System.out.print(stringToUseUnique.charAt(i) + " ");
				if (printOnlyFirst) {
					break;
				}
			}
		}
		scanner2.close();
		System.out.println("");
	}
	
	public static void main(String[] args) {
		A13_StringFunction a13_StringFunction = new A13_StringFunction();
		//a13_StringFunction.getAllDuplicateChar();
		a13_StringFunction.getAllUniqueChar();
	}
}
