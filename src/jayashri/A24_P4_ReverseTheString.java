package jayashri;

public class A24_P4_ReverseTheString {
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
		A24_P4_ReverseTheString a24_p4 = new A24_P4_ReverseTheString();
		a24_p4.reverseCase("TeCHnoCReditS");

	}
}
