/*Program 7. WAP to reverse the case of each char in a given word
Input    : "TeCHnoCReditS"
Output : "tEchNOcrEDITs"
 */
package anjali.Assignment24;

public class A24_Program7 {

	String reverseCaseOfCharInString(String name) {
		String temp = "";
		for (int index = 0; index < name.length(); index++) {
			if (Character.isLetter(name.charAt(index))) {
				if (Character.isUpperCase(name.charAt(index))) {
					char c = Character.toLowerCase(name.charAt(index));
					temp = temp + c;
				} else {
					char c = Character.toUpperCase(name.charAt(index));
					temp = temp + c;
				}
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		A24_Program7 a24_Program7 = new A24_Program7();
		String output = a24_Program7.reverseCaseOfCharInString("TeCHnoCReditS");
		System.out.println(output);
	}

}
