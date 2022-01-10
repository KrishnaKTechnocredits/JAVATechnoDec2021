package yogiraj;

public class Assignment20 {
	int sum = 0;

	public void sumDigits() {
		String str = "tech1noc9red3its";

		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum = sum + Integer.parseInt(str.valueOf(str.charAt(index)));
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Assignment20 a = new Assignment20();

		a.sumDigits();
	}

}
