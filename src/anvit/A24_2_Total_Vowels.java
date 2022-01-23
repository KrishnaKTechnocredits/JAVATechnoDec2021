package anvit;

public class A24_2_Total_Vowels {
	
	void vowelsInWords(String input) {
		String[] output = input.split(" ");
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index] + " --> " + getVowel(output[index]));
		}

	}

	int getVowel(String str) {
		char ch;
		int vowelCount = 0;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}
		return vowelCount;
	}
	
	public static void main(String[] args) {
		A24_2_Total_Vowels a24_2_Total_Vowels = new A24_2_Total_Vowels();
		a24_2_Total_Vowels.vowelsInWords("aashvi technocredits");
	}
}
