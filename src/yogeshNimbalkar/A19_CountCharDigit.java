package yogeshNimbalkar;

import java.util.Scanner;

// in given string count the number of charters, lower case, upper case characters and number of digits 
public class A19_CountCharDigit {

	void printCount(String str) {
		int digitCount=0, lowerCaseCount=0, upperCaseCount=0; 
		for(int index=0; index<str.length(); index++) {
			if(Character.isLetter(str.charAt(index))) {
				if(Character.isUpperCase(str.charAt(index))) {
					upperCaseCount++;
				}else {
					lowerCaseCount++;
				}
			}else if(Character.isDigit(str.charAt(index))) {
				digitCount++;
			}
		}
		System.out.println("Given String : \n" + str);
		System.out.println("Total charactres in string : " + (upperCaseCount + lowerCaseCount));
		System.out.println("Number of lower case characters : " + lowerCaseCount);
		System.out.println("Number of upper case characters : " + upperCaseCount);
		System.out.println("Number of digit : " + digitCount);
	}
	
	public static void main(String[] args) {
		A19_CountCharDigit countchardigit = new A19_CountCharDigit();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		String input = scanner.next();
		countchardigit.printCount(input);
		scanner.close();
	}
}
