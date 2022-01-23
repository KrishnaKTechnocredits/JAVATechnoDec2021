/*Assignment24
Program 7. WAP to reverse the case of each char in a given word 
Input: "TeCHnoCReditS" 
Output : "tEchNOcrEDITs"
*/
package deepak;

public class A24_P7_ReverseCaseOfString {

	void reverseCase(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				char ch1 = Character.toLowerCase(ch);
				output = output + ch1;
			} else
				output = output + Character.toUpperCase(ch);
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		A24_P7_ReverseCaseOfString reverseCase = new A24_P7_ReverseCaseOfString();
		reverseCase.reverseCase("TeCHnoCReditS");

	}

}
