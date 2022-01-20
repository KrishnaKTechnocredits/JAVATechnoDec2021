package anvit;

public class A24_7_Reverse_Case_Char {
	
	void reverseChar(String input) {
		String str = "";
		char ch;
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}
			str += ch;
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		A24_7_Reverse_Case_Char a24_7_Reverse_Case_Char = new A24_7_Reverse_Case_Char();
		a24_7_Reverse_Case_Char.reverseChar("TeCHnoCRrditS");
	}
}
