package vishakha;

public class A21_StringCode {

	String temp = "";

	String DigitsFromString(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}
		}

		return temp;
	}

	public static void main(String[] args) {
		A21_StringCode code = new A21_StringCode();
		String s = code.DigitsFromString("Tec1hn2o3C9r6e8dli9ts");
		System.out.println("Digits present in the String: " + s);
	}

}
