package yogeshNagar;

public class A21_GetDigitFromCharString {

	void getDigitFromString() {
		String name = "t5e3ch1noc9re4d3its";
		String onlyDigit = "";
		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				onlyDigit = onlyDigit + name.charAt(index);
			}
		}
		System.out.println(onlyDigit);
	}

	public static void main(String[] args) {
		A21_GetDigitFromCharString getDigCount = new A21_GetDigitFromCharString();
		getDigCount.getDigitFromString();
	}
}