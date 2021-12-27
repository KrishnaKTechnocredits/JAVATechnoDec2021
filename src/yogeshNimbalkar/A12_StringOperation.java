package yogeshNimbalkar;

import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class A12_StringOperation {

	void getFirstNonRepeatChar(String str) {
		for(int index = 0; index < str.length(); index++) {
			int count = 0;
//			char ch = str.charAt(index);
			for(int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				if(str.charAt(innerIndex) == str.charAt(index))
					count++;
			}
			if(count == 1) {
				System.out.println("First non repeating char - " + str.charAt(index));
				break;
			}				
		}
	}
	
	void getFirstRepeatChar(String str) {
		for(int index = 0; index < str.length(); index++) {
			int count = 0;
			for(int innerIndex = 0; innerIndex < str.length(); innerIndex++)
				if(str.charAt(innerIndex) == str.charAt(index))
					count++;
			if(count > 1) {
				System.out.println("First repeating char - " + str.charAt(index));
				break;
			}
		}
	}
	
	String getReverseOfString(String str) {
		String reverseStr = "";
		for(int index = str.length()-1; index >= 0; index--)
			reverseStr = reverseStr + str.charAt(index);
		return reverseStr;
		}
	
	public static void main(String[] args) {
		A12_StringOperation stringOperation = new A12_StringOperation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string : ");
		String input = scanner.next();
		stringOperation.getFirstNonRepeatChar(input);
//		System.out.println("Please enter the string : ");
//		input = scanner.next();
		stringOperation.getFirstRepeatChar(input);
//		System.out.println("Please enter the string : ");
//		input = scanner.next();
		System.out.println("Reverse string - " + stringOperation.getReverseOfString(input));
		scanner.close();
	}
}