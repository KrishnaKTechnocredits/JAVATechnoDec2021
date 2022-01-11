package ashwini;

public class A21_StringPro {
	void stringConcat(String s) {
		for (int index = 0; index < s.length() ; index++) {

			char ch = s.charAt(index);
			if (Character.isDigit(ch)) {
				String temp = " ";
				temp = temp + s.charAt(index);

				System.out.print(temp);
			}
		}
	}

	public static void main(String[] args) {
		A21_StringPro p = new A21_StringPro();
		p.stringConcat("Tech1n2Oc5reD8Ts");
	}
}
