/*Program 7. WAP to reverse the case of each char in a given word
Input    : "TeCHnoCReditS"
Output : "tEchNOcrEDITs"
*/

package pallavi;

public class A24_ReverseCase {
	
	public static void main(String[] arr) {

		String input = "TeCHnoCReditS";
		System.out.println("Input :-" + input);
		new A24_ReverseCase().reverseCase(input);
	}

	void reverseCase(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					ch = Character.toLowerCase(ch);
				else
					ch = Character.toUpperCase(ch);
			}
			output += String.valueOf(ch);
		}
		System.out.println("Output:- " + output);
	}
}
