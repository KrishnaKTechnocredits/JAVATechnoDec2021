package priya;

import java.util.Scanner;

public class A14_CharComparison {
	
		int count;
		int count1;

		void charFrequencyComparison(String input) {
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (input.indexOf(ch) == input.lastIndexOf(ch)) {
					count++; 
				} else if (input.indexOf(ch) != input.lastIndexOf(ch)) {
					count1++; 
				}
			}
			System.out.println("Unique character Count is: " + count);
			System.out.println("Duplicate character Count is: " + count1);
			if (count1 > count) {
				System.out.println("JAVA");
			}
			else {
				System.out.println("SELENIUM");
			}
		}
		public static void main(String[] args) {
			A14_CharComparison enter = new A14_CharComparison();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter the String: ");
			String s1 = scanner.next();
			enter.charFrequencyComparison(s1);
			scanner.close();
		}
	}

