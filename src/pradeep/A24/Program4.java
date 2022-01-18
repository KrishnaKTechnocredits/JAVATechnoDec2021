package pradeep.A24;

public class Program4 {
	// 4. WAP to reverse each word on the same index

	void getReverseWord(String input) {
		String[] arr = input.split(" ");
		String output = "";
		String temp = "";

		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			for (int innerIndex = str.length() - 1; innerIndex >= 0; innerIndex--) {
				temp += str.charAt(innerIndex);
			}
			output += temp + " ";
			temp = "";
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		Program4 program4 = new Program4();
		String input = "Hi techno hello";
		System.out.println("Input: " + input);
		System.out.println("Output: ");
		program4.getReverseWord(input);
	}
}
