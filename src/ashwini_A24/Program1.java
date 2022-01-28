package ashwini_A24;

public class Program1 {

	void totalWordCount(String str) {
		String[] output = str.split(" ");
		System.out.println("Input String	: " + str);
		System.out.println("Total " + output.length + " words");
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index] + " --> " + output[index].length());
		}
	}

	public static void main(String[] args) {
		Program1 wordCount = new Program1();
		String inputString = "Hi Hello";
		wordCount.totalWordCount(inputString);
	}
}
