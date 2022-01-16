package sandip;

public class Assignment_20 {
	int sum;

	void characterCase(String s1) {

		for (int index = 0; index < s1.length(); index++) {
			char ch = s1.charAt(index);
			if (Character.isDigit(s1.charAt(index))) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		System.out.println("Sum of Digits :" + sum);
	}

	public static void main(String[] args) {
		Assignment_20 a1 = new Assignment_20();
		a1.characterCase("TE1ch2noC2red9iTs");
	}
}
