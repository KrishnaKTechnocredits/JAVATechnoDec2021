package yogiraj;

import javax.imageio.event.IIOWriteProgressListener;

public class Assignment29 {
	String input = "I have 15 years and 3 months of automation experience";// Output : Expected Sum = 8

	int sum = 0;

	String temp = "";

	String target = null;

	public void getDigits() {
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				temp = temp + input.charAt(i);
			} else {
				temp = temp + " ";
			}

		}
		try {
			target.equals(temp);

		} catch (NullPointerException ne) {
			String temporary = "0";

			int i = 0;

			while (i < temp.length()) {
				if (temp.charAt(i) != ' ') {
					temporary = temporary + temp.charAt(i);
				} else {
					sum = sum + Integer.parseInt(temporary);

					temporary = "0";
				}
				i++;
			}
		}
		System.out.println("Total sume of all numbers from the string is  " + sum);

	}

	public static void main(String[] args) {
		Assignment29 a = new Assignment29();

		a.getDigits();
	}

}
