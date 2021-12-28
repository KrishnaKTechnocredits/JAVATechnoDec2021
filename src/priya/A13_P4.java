package priya;
import java.util.Scanner;

public class A13_P4 {

	/*Write a program using indexOf and lastIndexOf method.
	4. Return first duplicate character from given string. */ 
	
		String getfirstDuplicateChar(String input) {
			boolean flag = true;
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (input.indexOf(ch) != input.lastIndexOf(ch)) {
					System.out.println("First duplicate char from given string is : "+ch);
					flag = false;
					break;
				}

			}
			if(flag=false)
				System.out.println("No duplicate char present in String");
			return input;
		}

		public static void main(String[] a) {
			A13_P4 firstdupchar = new A13_P4();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the input string : ");
			String word = sc.next();
			//System.out.print(" First duplicate char from given string is : ");
			firstdupchar.getfirstDuplicateChar(word);

		}
	}
