package jagdish;

public class Exam6_P2 {
	static void findmaxwordlength(String name) {
		String[] output = name.split(" ");
		int maxLenght = output[0].length();
		String maxString = output[0];
		for (int index = 1; index < output.length; index++) {
			if (maxLenght < output[index].length()) {
				maxLenght = output[index].length();
				maxString = output[index];
			}
		}
		System.out.println("Output is:- " + maxString);
	}

	public static void main(String[] args) {
		String input = "good morning technocredits hi hello";
		findmaxwordlength(input);
	}
}