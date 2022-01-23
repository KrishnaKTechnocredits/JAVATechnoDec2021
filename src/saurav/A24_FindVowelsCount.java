package saurav;

public class A24_FindVowelsCount {
	
	int cnt=0;
	int findVowels(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'o' || input.charAt(index) == 'a' || input.charAt(index) == 'e'
					|| input.charAt(index) == 'i' || input.charAt(index) == 'u') {
				cnt++;
			}
		}
		return cnt;
	}

	void findVowelsCount(String word) {
		String[] wordArray = word.split(" ");
		for (int index = 0; index < wordArray.length; index++) {
			findVowels(wordArray[index]);
		}
		System.out.println("total vowels count : " + cnt);
	}
	
	public static void main(String[] a) {
		A24_FindVowelsCount program2 = new A24_FindVowelsCount();
		String input = "aashvi ssauravo monalisaa";
		program2.findVowelsCount(input);
	}
}
