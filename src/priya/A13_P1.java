package priya;

import java.util.Scanner;

public class A13_P1 {
	
	
	/*Write a program using indexOf and lastIndexOf method.

	1. Print all duplicate characters from given string.*/
	
	

		String getduplicateChar(String input) {
			boolean flag = true;
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (input.indexOf(ch) != input.lastIndexOf(ch)) {
					System.out.println(ch);
				}
			}
			if(flag==false)
				System.out.println("No unique char present in String");
			return input;
		}

		public static void main(String[] a) {
			A13_P1 dupchar = new A13_P1();
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the String :");
			String word = scanner.nextLine();
			System.out.print("All duplicate char from given string is ");
			dupchar.getduplicateChar(word);
		}
	}

