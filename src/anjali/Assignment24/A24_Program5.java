/*5. WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"
 */
package anjali.Assignment24;

public class A24_Program5 {

	String makeFirstletterCapital(String name) {
		String output = "";
		char ch = name.charAt(0);
		if (Character.isLetter(ch))
			Character.toUpperCase(ch);
		char c = Character.toUpperCase(ch);
		output = c + name.substring(1);
		return output;
	}

	String covFirstWorldWithCapitalInString(String name) {
		String temp = "";
		String arr[] = name.split(" ");
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + makeFirstletterCapital(arr[index]);
		}
		return temp.trim();
	}

	public static void main(String[] args) {
		A24_Program5 a24_Program5 = new A24_Program5();
		String output = a24_Program5.covFirstWorldWithCapitalInString("anvit harsh dipali");
		System.out.println(output);
	}
}
