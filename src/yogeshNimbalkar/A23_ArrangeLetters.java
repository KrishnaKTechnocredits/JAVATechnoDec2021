package yogeshNimbalkar;

import java.util.Scanner;

//Return a string by placing all small characters first, followed by digits, capital letters, special characters.
public class A23_ArrangeLetters {

	String getArrangedStr(String str) {
		String lowletter="";
		String capletter="";
		String digit="";
		String spletter="";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isLowerCase(ch)) {
				lowletter += ch;
			}else if(Character.isUpperCase(ch)) {
				capletter += ch;
			}else if(Character.isDigit(ch)) {
				digit += ch;
			}else {
				spletter += ch;
			}
		}
		return lowletter + digit + capletter + spletter;
	}
	
	public static void main(String[] args) {
		A23_ArrangeLetters arrangeletter = new A23_ArrangeLetters();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = scanner.next();
		System.out.println("Resultant string : " + arrangeletter.getArrangedStr(input));
		scanner.close();
	}
}
