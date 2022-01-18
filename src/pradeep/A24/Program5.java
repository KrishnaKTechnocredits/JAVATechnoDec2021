package pradeep.A24;

public class Program5 {
	// 5. WAP to convert first character of word with capital letter

	String getStringWithFirstLetterCapital(String input) {
		String[] arr = input.split(" ");
		String temp;
		String output = "";

		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			char ch = Character.toUpperCase(str.charAt(0));
			temp = ch + str.substring(1);
			output += " " + temp;
		}
		return output;
	}

	public static void main(String[] args) {
		Program5 program5 = new Program5();
		String input = "anvit harsh dipali";
		System.out.println("Input: " + input);
		String output = program5.getStringWithFirstLetterCapital(input);
		System.out.println("Output: " + output.trim());
	}
}
