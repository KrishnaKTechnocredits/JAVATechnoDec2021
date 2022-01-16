/*5. write a method to return the reverse string. [program-3]*/

package shivangi.Assignment12_Scanner;

import java.util.Scanner;

public class A12_4_ReverseString {
	
	void printReverseString(String input) {
		int length = input.length(); 
		for(int index=length-1; index>=0; index--) {
			System.out.println(input.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		A12_4_ReverseString a12_4_ReverseString = new A12_4_ReverseString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an String : ");
		String input = scanner.nextLine();
		a12_4_ReverseString.printReverseString(input);
		scanner.close();
	}
}
