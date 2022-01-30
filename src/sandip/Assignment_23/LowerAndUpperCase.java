package sandip.Assignment_23;

public class LowerAndUpperCase {

	String caseOfString(String input) {
		System.out.println("Input : " + input);
		String l = "";
		String u = "";
		String d = "";
		String sp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch)) {
				l = l + ch;
			} else if (Character.isUpperCase(ch)) {
				u = u + ch;
			} else if (Character.isDigit(ch)) {
				d = d + ch;
			} else if (!Character.isDigit(ch) && (!Character.isLetter(ch))) {
				sp = sp + ch;
			}
		}
		return (l + u + d + sp);
	}

	public static void main(String[] args) {
		LowerAndUpperCase l1 = new LowerAndUpperCase();
		System.out.println("Output : " + l1.caseOfString("te4c&Hno7CreD-8i*ts"));
	}
}
