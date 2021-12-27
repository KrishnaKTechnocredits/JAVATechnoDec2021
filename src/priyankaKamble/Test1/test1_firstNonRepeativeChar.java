package priyankaKamble.Test1;
/*Test - 1 : 25th Dec'2021

Program 1 : find the first non repeating character from given string. 
   input : technocredits
   output : h */

public class test1_firstNonRepeativeChar {

	int countchar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void firstNonRepeativeChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = countchar(input, ch);
			if (count == 1) {
				System.out.println("First Non repeatative charcter in "+input +" is = " + input.charAt(index));
				break;
			}
		}
	}

	public static void main(String[] args) {
		test1_firstNonRepeativeChar test1 = new test1_firstNonRepeativeChar();
		test1.firstNonRepeativeChar("technocredits");
	}
}
