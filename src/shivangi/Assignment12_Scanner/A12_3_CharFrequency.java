/*3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h
4. find the first repeating character from given string. [program-3]
   input : shivangi
   output : i*/

package shivangi.Assignment12_Scanner;

import java.util.Scanner;

public class A12_3_CharFrequency {
	
	int getCharCount(String input, char ch) {
		int count = 0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index) == ch) {
				count++;
			}
		}
		return count;
	}
	
	void findFirstNonRepeatingChar(String input) {
		int count = 0;
		for(int index=0; index<input.length(); index++) {
			count = getCharCount(input, input.charAt(index));
			if(count == 1) {
				System.out.println("Fisrt not repeating character is : " + input.charAt(index) + " with count " + count);
				break;
			}
		}
	}
	
	void findFirstRepeatingChar(String input) {
		int count = 0;
		for(int index=0; index<input.length(); index++) {
			count = getCharCount(input, input.charAt(index));
			if(count > 1) {
				System.out.println("Fisrt repeating character is : " + input.charAt(index) + " with count " + count);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		A12_3_CharFrequency a12_3_CharFrequency = new A12_3_CharFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = scanner.nextLine();
		a12_3_CharFrequency.findFirstNonRepeatingChar(input);
		System.out.println("-------------------------");
		System.out.println("Enter a string : ");
		String name = scanner.nextLine();
		a12_3_CharFrequency.findFirstRepeatingChar(name);
		scanner.close();
	}
}
