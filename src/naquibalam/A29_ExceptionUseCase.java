package naquibalam;

import java.util.Scanner;

public class A29_ExceptionUseCase {

	int getNumberAddition(String input) {
		int sum = 0;
		String[] arr = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			try {
				sum = sum + Integer.parseInt(arr[i]);
			} catch(NumberFormatException nfe) {
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		A29_ExceptionUseCase a29_ExceptionUseCase = new A29_ExceptionUseCase();
		String input = "I have 15 years and 3 months of automation experience";
		System.out.println("Addition of numers in sentence is : " + a29_ExceptionUseCase.getNumberAddition(input));
		a29_ExceptionUseCase.getNumberAddition(input);
	}
}
