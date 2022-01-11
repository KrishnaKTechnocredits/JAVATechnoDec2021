package pranoti;

public class A21_StringOperations {

	String getDigit(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
		}
		return temp;
	}

	public static void main(String[] args) {
		A21_StringOperations a21 = new A21_StringOperations();
		String temp2 = a21.getDigit("1eTie0h4ty9o6");
		System.out.println("Digits from given input is :" + temp2);
	}
}
