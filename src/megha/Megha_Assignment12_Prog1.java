package megha;

import java.util.Scanner;

public class Megha_Assignment12_Prog1 {

	void getOccurenceOfAllChar(String name) {
		String charPresentCheck = "";
		int nameLength = name.length();
		for (int index = 0; index < nameLength; index++) {
			char ch = name.charAt(index);
			int count = 0;
			for (int index1 = index; index1 < nameLength; index1++) {
				if (name.charAt(index1) == ch)
					count++;
			}
			if (isAlreadyPresent(charPresentCheck, ch) == false)
				System.out.println(ch + " is present : " + count + " times");
			charPresentCheck = charPresentCheck + ch;

		}
	}

	boolean isAlreadyPresent(String charPresentCheck, char ch) {
		for (int index = 0; index < charPresentCheck.length(); index++) {
			if (charPresentCheck.charAt(index) == ch)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Megha_Assignment12_Prog1 megha_Assignment12 = new Megha_Assignment12_Prog1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String name = sc.nextLine();
		megha_Assignment12.getOccurenceOfAllChar(name);
		sc.close();
	}

}
