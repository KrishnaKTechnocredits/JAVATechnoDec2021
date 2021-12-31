package megha;

import java.util.Scanner;

public class Megha_Assignment13_Prog2 {

	void findRepeatingChars(String str) {
		String charPresentCheck = "";
		Megha_Assignment12_Prog1 megha_Assignment12 = new Megha_Assignment12_Prog1();
		System.out.println("Repeating Character : ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				if (megha_Assignment12.isAlreadyPresent(charPresentCheck, ch) == false) {
					System.out.print(ch + " ");
					charPresentCheck = charPresentCheck + ch;
				}
			}
		}
	}

	public static void main(String[] args) {
		Megha_Assignment13_Prog2 Megha_Assignment13 = new Megha_Assignment13_Prog2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		Megha_Assignment13.findRepeatingChars(str);
		sc.close();
	}

}
