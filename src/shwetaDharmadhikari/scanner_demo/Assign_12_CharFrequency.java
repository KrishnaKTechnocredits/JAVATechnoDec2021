/*
 * Assignment - 12 : 26th Dec'2021-- 385

Write 4 different programs to satisfy below requirements, please take input from user using Scanner class. 

1. print freq of each character in given String. [Program-1]
 */
package shwetaDharmadhikari.scanner_demo;

import java.util.Scanner;

public class Assign_12_CharFrequency {
	static void printFrequencyofChar(String input) {
		String name = " ";
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			for (int InnerIndex = 0; InnerIndex < input.length(); InnerIndex++) {
				if (input.charAt(index) == input.charAt(InnerIndex)) {
					count++;
					name = name + input.charAt(index);
				}
			}
			System.out.println("Frequency of:" + input.charAt(index) + " is  " + count);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = scan.next();
		printFrequencyofChar(name);
		scan.close();
	}

}
