package naquibalam;

import java.util.Scanner;

public class A23_Program6 {

	String getSegregatedValues(String input) {
		String oddNumbers = "";
		String firstCapital = "";
		String evenNumber = "";
		boolean firstCapitalFound = false;
		for (int i = 0; i < input.length(); i++) {
			char eachChar = input.charAt(i);
			if (Character.isDigit(eachChar)) {
				if (Integer.parseInt(eachChar+"") % 2 == 0) {
					evenNumber = evenNumber + eachChar;
				} else {
					oddNumbers = oddNumbers + eachChar;
				}
			} else if ((Character.isUpperCase(eachChar)) && (firstCapitalFound == false)) {
				firstCapital = eachChar + "";
				firstCapitalFound = true;
			}
		}
		return oddNumbers + firstCapital + evenNumber;
	}
	
	public static void main(String[] args) {
		A23_Program6 a23_Program6 = new A23_Program6();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String from which you want segregated values : ");
		String stringToUse = scanner.next();
		System.out.println("Segregated Values from string : " + a23_Program6.getSegregatedValues(stringToUse));
		scanner.close();
	}

}
