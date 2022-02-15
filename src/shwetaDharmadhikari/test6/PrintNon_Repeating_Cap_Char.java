/*Programming Test - 6
1.  Write a method to return the first non repeating Capital character.
Input : tEChNoCrEdits
Output : N
 */
package shwetaDharmadhikari.test6;

public class PrintNon_Repeating_Cap_Char {

	char displayNonRepeatingCapitalChar(String input) {
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))) {
				if (Character.isUpperCase(input.charAt(index))) {
					ch = input.charAt(index);
				}
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		String input = "tEChNoCrEdits";
		System.out.println("Output :" + new PrintNon_Repeating_Cap_Char().displayNonRepeatingCapitalChar(input));
	}
}
