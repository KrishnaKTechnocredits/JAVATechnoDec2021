package yogiraj;

public class Assignment21 {
	String str;

	public String stringDigits(String str) {
		this.str = str;

		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				temp += str.charAt(i);
			}
		}

		return temp;

	}

	public static void main(String[] args) {
		Assignment21 a = new Assignment21();

		String digitsOfString = a.stringDigits("T1e3h45n9o");

		System.out.println("Digits from the String are  " + digitsOfString);
	}

}
