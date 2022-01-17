package nasir;

//WAP to find out total vowels in each word from the given String
public class A24_P2_FindVowels {
	void totalVowels(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			String word = output[index];
			findVowelsFromWord(word);
		}
	}

	void findVowelsFromWord(String word) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		System.out.println("Total vowels in " + word + " " + count);
	}

	public static void main(String[] args) {
		A24_P2_FindVowels findVowels = new A24_P2_FindVowels();
		findVowels.totalVowels("aashvi technocredits");
	}

}
