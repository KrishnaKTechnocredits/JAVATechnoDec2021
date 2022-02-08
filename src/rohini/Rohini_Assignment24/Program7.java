package rohini.Rohini_Assignment24;

/*7. WAP to reverse the case of each char in a given word
Input    : "TeCHnoC*
*/

public class Program7 {

	void reverseCase(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					ch = Character.toLowerCase(ch);
				} else {
					ch = Character.toUpperCase(ch);
				}
			}
			temp = temp + ch;
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		Program7 prg7 = new Program7();
		prg7.reverseCase("TeCHnoC");
	}
}
