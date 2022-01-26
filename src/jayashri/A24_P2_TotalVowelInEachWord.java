package jayashri;

public class A24_P2_TotalVowelInEachWord {
	void getVowelCount(String input) {
		int vowelCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}
		System.out.println(input + " ---> " + vowelCount);
	}

	void printStringDesc(String input) {
		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			getVowelCount(arr[index]);
		}
	}

	public static void main(String[] args) {
		A24_P2_TotalVowelInEachWord a24_p2 = new A24_P2_TotalVowelInEachWord();
		a24_p2.printStringDesc("aashvi technocredits");
	}
}
