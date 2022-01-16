/*Test - 1 : 25th Dec'2021

Program 1 : find the first non repeating character from given string. 
   input : technocredits
   output : h   

*/

package vaibhav.Test1;

public class Program1 {

	int getFrequencyOfChar(String input, char ch) { // technocredits
		int charFreq = 0;
		for (int index = 0; index <= input.length() - 1; index++) {
			if (input.charAt(index) == ch) {
				charFreq++;
			}
		}
		return charFreq;
	}

	void getFirstNonRepeatingChar(String input) {
		char ch = ' ';
		for (int index = 0; index <= input.length() - 1; index++) {
			ch = input.charAt(index);
			if (getFrequencyOfChar(input, ch) ==1) {
				System.out.println("First non repeating character from given string \""+input+"\" is : " + ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();
		program1.getFirstNonRepeatingChar("technocredits");
	}
}
