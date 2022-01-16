package yogeshNimbalkar;

import java.util.Scanner;

// Return a string by placing all odd numbers , first capital letters from given string, even numbers.
public class A23_ArrangeLetters1 {

	String getArrangedStr(String str) {
		String capletter="";
		String oddNumber="";
		String evenNumber="";
		boolean flag = true;
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				if(Character.getNumericValue(ch)%2 == 0) {
					evenNumber += ch;
				}else {
					oddNumber +=ch;
				}
			}else if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch) && flag) {
					capletter += ch;
					flag = false;
				}
			}
		}
		return oddNumber + capletter + evenNumber;
	}
	
	public static void main(String[] args) {
		A23_ArrangeLetters1 arrangeLetter1 = new A23_ArrangeLetters1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = scanner.next();
		System.out.println("Strring in arranged form is : " + arrangeLetter1.getArrangedStr(input));
		scanner.close();
	}
}
