package ashok;

public class A24_Program_Total_vowel {
	
	void findTotalVowelsInEachWordsInString(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			int wordVowel = 0;
			for (int innerIndex = 0; innerIndex < wordLength; innerIndex++) {
				char ch = word.charAt(innerIndex);
				if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
						|| ch == 'u' || ch == 'U')
					wordVowel++;
			}
			System.out.println("Vowels in the word " + word + " --> " + wordVowel);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_Program_Total_vowel assignment = new A24_Program_Total_vowel();
	
		System.out.println("Output of Program: ");
		assignment.findTotalVowelsInEachWordsInString("Aashvi Technocredits");
	}

}
