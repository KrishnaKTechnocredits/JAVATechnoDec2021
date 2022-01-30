package shamli;

import java.util.Scanner;

import megha.Megha_Assignment13_Prog3;

public class Assignment13Program3 {
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
		Assignment13Program3 assignment13prog3 = new Assignment13Program3();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		assignment13prog3.findFirstUniqueChar(str);
		sc.close();
	}

}

