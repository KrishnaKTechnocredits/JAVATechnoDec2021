package priya;
import java.util.Scanner;

public class A13_P2 {
	/* Write a program using indexOf and lastIndexOf method.
	2. Print all unique characters from given string. */

		String getUniqueCharFromString(String input) {
			boolean flag = true;

			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (input.indexOf(ch) == input.lastIndexOf(ch)) {
					System.out.println(ch);
				}
			}
			if(flag==false)
				System.out.println("No unique char present in String");
			return input;
		}

		public static void main(String[] a) {
			A13_P2 unicchar = new A13_P2();
			Scanner sc = new Scanner(System.in);
			System.out.print("enter the input String :");
			String word = sc.nextLine();

			unicchar.getUniqueCharFromString(word);
		}
	}


