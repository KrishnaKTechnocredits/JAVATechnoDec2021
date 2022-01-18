package pradeep.A24;

public class Program7 {
	// 7. WAP to reverse the case of each char in a given word
	String changeCase(String input) {
		String temp = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					ch = Character.toLowerCase(ch);
				else
					ch = Character.toUpperCase(ch);
			}
			temp = temp + ch;
		}
		return temp;
	}

	public static void main(String[] args) {
		Program7 program7 = new Program7();
		String input = "TeCHnoC";
		System.out.println("Input: " + input);
		String output = program7.changeCase(input);
		System.out.println("Output: " + output);
	}
}
