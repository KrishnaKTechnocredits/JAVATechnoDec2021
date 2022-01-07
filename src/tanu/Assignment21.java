package tanu;

import java.util.Scanner;
import java.lang.Character;

class Assignment21 {
	char letter;
	String sumcount = "";

	void displayDigits(String name) {
		for (int index = 0; index < name.length(); index++) {
			letter = name.charAt(index);
			if (Character.isDigit(letter)) {
				sumcount = sumcount + letter;
			}
		}
           System.out.println("Output string of digit is "+sumcount);
	}

	public static void main(String[] arg) {
		Assignment21 assignment = new Assignment21();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String userinput = input.next();
		assignment.displayDigits(userinput);

	}

}

//Tec1hn2o3C9r6e8d1i9ts