package ashwini;

public class Assignment26 {

	void expectedOutput(String str) {
		String[] expectedOutput = str.split("id=");
		System.out.println("Input URL 		: " + str);
		System.out.println("Expeccted output	:" + " id = " + expectedOutput[1]);
	}

	public static void main(String[] args) {
		Assignment26 stringOperation = new Assignment26();
		String inputURL = "https://automationbykrishna.com/name=techno/id=123";
		stringOperation.expectedOutput(inputURL);
	}
}
