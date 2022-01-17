package yogeshNimbalkar;

import java.util.Scanner;

public class A24_ReverseCase {

	String getReverseCase(String str) {
		String resultStr = "";
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)) {
					ch = Character.toLowerCase(ch);
				}else {
					ch = Character.toUpperCase(ch);
				}
				resultStr += ch;
			}else {
				resultStr += ch;
			}
		}
		return resultStr;
	}
	
	public static void main(String[] args) {
		A24_ReverseCase reverseCase = new A24_ReverseCase();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = scanner.next();
		System.out.println("Resultant String : " + reverseCase.getReverseCase(input));
		scanner.close();
	}
}
