package jayashri;

public class A24_P1_CountTotalWords {

	void getCharCount(String input) {
		String[] arr = input.split(" ");
		System.out.println("Total " + arr.length + " words");
		for (int index = 0; index < arr.length; index++) {
			getStringlength(arr[index]);
		}
	}

	void getStringlength(String input) {
		System.out.println(input + " -- " + input.length());
	}
	public static void main(String[] args) {
		A24_P1_CountTotalWords a24_p1 = new A24_P1_CountTotalWords();
		a24_p1.getCharCount("Hi Hello");

	}
}
