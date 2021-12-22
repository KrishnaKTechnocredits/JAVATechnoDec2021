/*
 * 1.Print all characters at even position from given string.
input : technocredits
output : ehordt

2. Print only vowels from given string.
input : technocredits
output : eoei
 */
package priyankaZende;

public class A7_StringDemo2Demo {
	void printEvenPositionChars(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (index % 2 == 1) {
				output = output + input.charAt(index);
			}
		}
		System.out.println(output);
	}

	void pintVowelsFromString(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'A' || input.charAt(index) == 'a' || input.charAt(index) == 'I'
					|| input.charAt(index) == 'i' || input.charAt(index) == 'O' || input.charAt(index) == 'o'
					|| input.charAt(index) == 'U' || input.charAt(index) == 'u' || input.charAt(index) == 'E'
					|| input.charAt(index) == 'e') {
				output = output + input.charAt(index);
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		A7_StringDemo2Demo a7_StringDemo2Demo = new A7_StringDemo2Demo();
		System.out.println("Given String is: Technocredits");
		System.out.println("Print all characters at even position from given string as :");
		a7_StringDemo2Demo.printEvenPositionChars("Technocredits");
		System.out.println("Print only vowels from given string as :");
		a7_StringDemo2Demo.pintVowelsFromString("Technocredits");
	}
}
