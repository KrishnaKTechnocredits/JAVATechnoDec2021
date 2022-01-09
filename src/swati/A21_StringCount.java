package swati;

public class A21_StringCount {

	String inputCount(String name) {
		String temp = "";
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (Character.isDigit(c)) {
				temp += c;
			}

		}

		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A21_StringCount a21 = new A21_StringCount();
		String temp = a21.inputCount("T1e3h45n9O");
		System.out.println(temp);

	}

}
