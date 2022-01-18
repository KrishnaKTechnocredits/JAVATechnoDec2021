package kalyani;

public class A23_StringAdjustment1_P3 {

	String stringAdjustment(String input) {
		String output1 = "";
		String output2 = "";
		String output3 = "";
		String output4 = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch) && Character.isLowerCase(ch)) {
				output1 += ch;
			} else if (Character.isDigit(ch)) {
				output2 += ch;
			} else if (Character.isLetter(ch) && Character.isUpperCase(ch))
				output3 += ch;
			else
				output4 += ch;

		}
		return (output1 + output2 + output3 + output4);
	}

	public static void main(String[] args) {
		A23_StringAdjustment1_P3 stringadjustment = new A23_StringAdjustment1_P3();
		String input = "t!e4c&Hno7Cr$eD-10i*ts";
		System.out.print("Arranged String of '" + input + "' string is: ");
		System.out.println(stringadjustment.stringAdjustment(input));
	}

}