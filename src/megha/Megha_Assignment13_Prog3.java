package megha;

import java.util.Scanner;

public class Megha_Assignment13_Prog3 {

	void findFirstUniqueChar(String str) {
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				break;
		}
		System.out.println("The First Unique Character is : " + ch);
	}

	public static void main(String[] args) {
		Megha_Assignment13_Prog3 Megha_Assignment13 = new Megha_Assignment13_Prog3();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		Megha_Assignment13.findFirstUniqueChar(str);
		sc.close();
	}

}
