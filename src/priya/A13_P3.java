package priya;

import java.util.Scanner;

public class A13_P3 {
	/*Write a program using indexOf and lastIndexOf method.
      3. Return first unique character from given string.
	 */ 
	
	String getfirstUniqueChar(String input) {
			boolean flag = true;
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (input.indexOf(ch) == input.lastIndexOf(ch)) {
					System.out.println(" First Unique char from given string is : " +ch);
					break;
				}
			}
			if(flag==false)
				System.out.println("No unique char present in String");
			return input;
		}

		public static void main(String[] a) {
			A13_P3 funiqchar = new A13_P3();
			Scanner sc = new Scanner(System.in);
			System.out.print("enter the input String :");
			String word = sc.next();
			System.out.print(" ");
			funiqchar.getfirstUniqueChar(word);

		}
	}

