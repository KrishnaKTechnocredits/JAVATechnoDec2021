/*1.  Write a method to return the first non repeating Capital character.
Input : tEChNoCrEdits
Output : N*/

package vrushali;

public class Test6_FirstNonRepeatingCapChar {

	void findNonRepeatingChar(String input) {

		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);

			if(Character.isUpperCase(ch)) {
				if(input.indexOf(ch)== input.lastIndexOf(ch)) {
					System.out.println(ch);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Test6_FirstNonRepeatingCapChar firstNonRepeatingCapChar = new Test6_FirstNonRepeatingCapChar();
		firstNonRepeatingCapChar.findNonRepeatingChar("tEChNoCrEdits");
	}
}
