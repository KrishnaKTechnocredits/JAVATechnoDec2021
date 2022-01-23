package hevin;

public class A24_CountCharOfEachWord {

	void getStringlength(String input) {
		System.out.println(input + " --> " + input.length());
	}

	void getCharCount(String input) {
		String[] arr = input.split(" ");
		System.out.println("Total " + arr.length + " words");
		for (int index = 0; index < arr.length; index++) {
			getStringlength(arr[index]);
		}
	}

	public static void main(String[] args) {
		A24_CountCharOfEachWord a24 = new A24_CountCharOfEachWord();
		a24.getCharCount("Hi Hello");

	}

}
