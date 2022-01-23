package kalyani;

public class A24_FindVowelsInString_P2 {
	
	void CountOfVowelsInString(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			input = output[index];
			findVowelsInWord(input);
		}
	}

	void findVowelsInWord(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		System.out.println("Total vowels in " + input + " " + count);
	}

	public static void main(String[] args) {
		A24_FindVowelsInString_P2 findVowels = new A24_FindVowelsInString_P2();
		findVowels.CountOfVowelsInString("aashvi technocredits");
	}
}