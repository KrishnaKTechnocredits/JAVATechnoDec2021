package ashwini_A24;

public class Program5 {

	void getExpectedString(String str) {
		String[] inputArr = str.split(" ");
		String expectedString = "";

		for (int index = 0; index < inputArr.length; index++) {
			char capitalChar = Character.toUpperCase(inputArr[index].charAt(0));
			String temp = capitalChar + inputArr[index].substring(1);
			expectedString = expectedString + " " + temp;
		}
		System.out.println("Expected output string	: " + expectedString.trim());
	}

	public static void main(String[] args) {
		Program5 program5_FirstCharInCapital = new Program5();
		String inputString = "anvit harsh dipali";
		System.out.println("Input String 		: " + inputString);
		program5_FirstCharInCapital.getExpectedString(inputString);
	}

}
