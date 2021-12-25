/*Program 1 : find the first non repeating character from given string. 
   input : technocredits
   output : h   
*/

package deepak;

public class Test1_P1_NonRepeatingChar {

	int getCharOccurence(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char strChar = input.charAt(index);
			if (strChar == ch) {
				count++;
			}
		}
		return count;
	}

	void getFirstNonRepeatChar(String input) {
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			int count = getCharOccurence(input, ch);
			if (count == 1) {
				break;
			}
		}
		System.out.println("First Non Repeated Character: " + ch);
	}

	public static void main(String[] args) {
		Test1_P1_NonRepeatingChar nonRepeatChar = new Test1_P1_NonRepeatingChar();
		nonRepeatChar.getFirstNonRepeatChar("technocredits");

	}
}