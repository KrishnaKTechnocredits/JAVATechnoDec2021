package naquibalam;

import java.util.Scanner;

public class A13_StringFunction {
	
	void getAllDuplicateChar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String for which you duplicate characters : ");
		String stringToUse = scanner.next();
		System.out.println("Print only first duplicate character (true/false) : ");
		boolean printOnlyFirst = scanner.nextBoolean();
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
	}
	
	void getAllUniqueChar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String for which you unique characters : ");
		String stringToUse = scanner.next();
		System.out.println("Print only first unique character (true/false) : ");
		boolean printOnlyFirst = scanner.nextBoolean();
		for (int i=0; i <= stringToUse.length()-1; i++) {
			int firstIndexOf = stringToUse.indexOf(stringToUse.charAt(i));
			int lastIndexOf = stringToUse.lastIndexOf(stringToUse.charAt(i));
			if ((firstIndexOf == lastIndexOf) && (lastIndexOf == i)) {
				System.out.print(stringToUse.charAt(i) + " ");
				if (printOnlyFirst) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		A13_StringFunction a13_StringFunction = new A13_StringFunction();
		a13_StringFunction.getAllDuplicateChar();
		a13_StringFunction.getAllUniqueChar();
	}
}
