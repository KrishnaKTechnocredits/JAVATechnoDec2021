/*IMPORTANT
 * Program 7. WAP to reverse the case of each char in a given word
Input    : "TeCHnoCReditS"
Output : "tEchNOcrEDITs"
ReditS"
Output : "tEchNOcrEDITs"
 */
package shwetaDharmadhikari.string_assignmment24;

public class ReverseCharacterCase {

	String reverseCaseOfEachCharacter(String str) {
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					temp += Character.toLowerCase(ch);
				else
					temp += Character.toUpperCase(ch);
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "TeCHnoCReditS";
		ReverseCharacterCase reverseCharacterCase = new ReverseCharacterCase();
		System.out.println("Output : " + reverseCharacterCase.reverseCaseOfEachCharacter(input));
	}
}
