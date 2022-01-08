package priyankaKamble.assignment_21;

import java.util.Scanner;

/*Create a method which will written the string with all the digits from the given string 
Input : "Tec1hn2o3C9r6e8d1i9ts"
Output : 12396819*/
public class ReturnDigitString {
	
	String result ="";
	String printDigits(String input) {
		
		for (int index =0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				result+=ch;
			}
			if(!Character.isDigit(ch))
				return "No digit present in given String";
		}
		return result;
	}
	
	public static void main(String[] args) {
		ReturnDigitString returnDigitString = new ReturnDigitString();
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("\nInput String is = "+input);
		System.out.println("Extracted Digit String from given String is = " +returnDigitString.printDigits(input) );
	}
}
