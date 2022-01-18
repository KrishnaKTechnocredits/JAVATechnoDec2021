package swati.swati_Assignment23;

public class CountString {
	String temp = "";
	String finalTemp = "";
	int sum = 0;

	void countString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLetter(c)) {
				if (temp != "") {
					int conv = Integer.parseInt(temp);
					sum = sum + conv;
				}
				temp = "";
			} else if (Character.isDigit(c)) {
				temp = temp + c;
			}
			if (i == str.length() - 1 && Character.isDigit(c)) {
				int conv = Integer.parseInt(temp);
				sum = sum + conv;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		CountString cs = new CountString();
		cs.countString("te12ch22nocre3dits4");
	}
}
