package pranoti;

public class A24_P2_CountTotalVowels {

	void findVowel(String word) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		System.out.println(word + "-->" + count);
	}

	void findtotalVowels(String input) {
		String[] word = input.split(" ");
		for (int index = 0; index < word.length; index++) {
			findVowel(word[index]);
		}
	}
	
	public static void main(String[] args) {
		A24_P2_CountTotalVowels a24_P2_CountTotalVowels =new A24_P2_CountTotalVowels();
		a24_P2_CountTotalVowels.findtotalVowels("aashvi technocredits");
	}
}
