package priyankaKamble.assignment_24;

/*7. WAP to reverse the case of each char in a given word
Input    : "TeCHnoCreditS"
*/
public class ReverseStringCase {

	void converCase(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isLowerCase(input.charAt(index))) {
				output += Character.toUpperCase(input.charAt(index));
			} else if (Character.isUpperCase(input.charAt(index))) {
				output += Character.toLowerCase(input.charAt(index));
			}
		}
		System.out.println("Output String => " + input);
	}

	public static void main(String[] args) {
		ReverseStringCase reverseCase = new ReverseStringCase();
		String input = "TeCHnoCreditS";
		System.out.println("Input String => " + input);
		reverseCase.converCase(input);
	}
}
