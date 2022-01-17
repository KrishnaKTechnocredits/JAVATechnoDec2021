package nasir;
//WAP to find out total words in a given string & print each word with its length
public class A24_P1_StringMethodsProgram {
	// WAP to find out total words in a given string & print each word with its
	// length
	void totalWords(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index] + " - which has total length is " + output[index].length());
		}
	}

	public static void main(String[] args) {
		A24_P1_StringMethodsProgram smp = new A24_P1_StringMethodsProgram();
		smp.totalWords("Hi Hello");

	}
}
