package jayashri;

public class A21_PrintDigits {
	String str = "t1e3chnoc45red9its";
	String temp = " ";

	void print() {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + str.charAt(index);
			}
		}
		System.out.println("Digits in " + str + " is " + temp);
	}
	public static void main(String[] args) {
		A21_PrintDigits a21_printdigits = new A21_PrintDigits();
		a21_printdigits.print();
	}
}
