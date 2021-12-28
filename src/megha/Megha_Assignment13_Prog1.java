package megha;

import java.util.Scanner;

public class Megha_Assignment13_Prog1 {

	void findNonRepeatingChars(String str) {
		System.out.println("Non Repeating Character : ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				System.out.print(ch + " ");
		}
	}

	public static void main(String[] args) {
		Megha_Assignment13_Prog1 Megha_Assignment13 = new Megha_Assignment13_Prog1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		Megha_Assignment13.findNonRepeatingChars(str);
		sc.close();
	}

}
