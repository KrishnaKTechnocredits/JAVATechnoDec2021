/*1. print frequency of each character in given String. [Program-1]*/

package shivangi.Assignment12_Scanner;

import java.util.Scanner;

public class A12_1_FreqOFEachChar {

	int getCharCount(String name, char ch) {
		int count = 0;
		for(int index=0; index<name.length(); index++) {
			if(name.charAt(index) == ch) {
				count++;
				//System.out.println(name.charAt(index) + "--" + count);
			}
		}
		return count;
	}
	
	void findFreqOfEachChar(String name) {
		for(int index=0; index<name.length(); index++) {
			int count = getCharCount(name, name.charAt(index));
			System.out.println(name.charAt(index) + "-->" + count);
			//break;
		}	
	}
	
	
	public static void main(String[] args) {
		A12_1_FreqOFEachChar a12_1_FreqOFEachChar = new A12_1_FreqOFEachChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String to get count of each char : ");
		String name = scanner.nextLine();
		a12_1_FreqOFEachChar.findFreqOfEachChar(name);
		scanner.close();
	}
}
