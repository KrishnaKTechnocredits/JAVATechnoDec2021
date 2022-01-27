package ashwini_A23;

//Program 2 : Find sum of numbers from given string.
//input : te12ch22nocre3dits4
//output : 12 + 22 + 3 + 4 = 41

public class A23_p2 {
	String temp = "";
	int sum = 0;

	void calculatesum(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
			}
			if ((Character.isLetter(ch) && !temp.isEmpty()) || index == str.length() - 1) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}

		}

		System.out.println(sum);

	}

	public static void main(String[] args) {
		A23_p2 a2 = new A23_p2();
		String input = "te12ch22nocre3dits4";
		a2.calculatesum(input);
	}
}
