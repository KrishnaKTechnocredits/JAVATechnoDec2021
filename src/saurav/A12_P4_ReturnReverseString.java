package saurav;

import java.util.Scanner;

public class A12_P4_ReturnReverseString {//// completed

	String returnString(String input) {
		String output = " ";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}

		System.out.println("OUTPUT : " + output);
		return output;
	}

	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.print("INPUT : ");
		A12_P4_ReturnReverseString mannnn = new A12_P4_ReturnReverseString();
		String word = sc.nextLine();
		mannnn.returnString(word);
		sc.close();
	}
}
