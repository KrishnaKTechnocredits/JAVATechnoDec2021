package anvit;

public class A24_1_Total_Words {
	
	void wordCount(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index] + " --> " + output[index].length());
		}
	}

	public static void main(String[] args) {
		A24_1_Total_Words a24_1_Total_Words = new A24_1_Total_Words();
		a24_1_Total_Words.wordCount("Hi Hello");
	}
}
